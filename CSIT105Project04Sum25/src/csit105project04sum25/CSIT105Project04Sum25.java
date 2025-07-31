/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csit105project04sum25;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Peter Leong
 */
public class CSIT105Project04Sum25 {

    public static void showMap(Sector[][] wheatField, int currentRow, int currentCol) {
        System.out.println("\nWheat Field");

        System.out.printf("%4s", " ");
        for (int i = 0; i < wheatField[0].length; i++) {
            System.out.printf(" %3d ", i);
        }
        
        System.out.printf("\n%4s", " ");
        for (int i = 0; i < wheatField[0].length; i++) {
            System.out.printf(" %3s ", "---");
        }

        System.out.println("");
        
        for (int i = 0; i < wheatField.length; i++) {
            System.out.printf("%2d: ", i);
            for (int j = 0; j < wheatField[0].length; j++) {
                if (i == currentRow && j == currentCol) {
                    System.out.printf("[%3d]", wheatField[i][j].getNumBushelsOfWheatGrains());
                } else {
                    System.out.printf(" %3d ", wheatField[i][j].getNumBushelsOfWheatGrains());
                }
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        Sector[][] wheatField;
        String input;
        int numGatherings = 0;
        int gather, totalGathered = 0, vacuumTotal = 0;
        int nRows, nCols;
        int currentRow, currentCol;

        // get user input for array size
        System.out.print("Enter the number of rows (3-12): ");
        nRows = keyboard.nextInt();

        while (nRows < 3 || nRows > 12) {
            System.out.println("Value must be >=3 and <=12!");
            System.out.print("Enter the number of rows (3-12): ");
            nRows = keyboard.nextInt();
        }

        System.out.print("Enter the number of columns (3-12): ");
        nCols = keyboard.nextInt();

        while (nCols < 3 || nCols > 12) {
            System.out.println("Value must be >=3 and <=12!");
            System.out.print("Enter the number of columns (3-12): ");
            nCols = keyboard.nextInt();
        }

        keyboard.nextLine();

        // create array
        wheatField = new Sector[nRows][nCols];

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                wheatField[i][j] = new Sector(rand.nextInt(1000));
            }
        }

        // set initial position
        currentRow = nRows / 2;
        currentCol = nCols / 2;

        showMap(wheatField, currentRow, currentCol);
        
        // main input loop
        do {
            System.out.printf("\nCurrently in (%d,%d)\n", currentRow, currentCol);
            System.out.println("Total Gathered so far " + totalGathered + " bushels of wheat grains");
            System.out.println("\n{ navigation W, A, S, D } { actions M, G, J, V, Q }");
            System.out.print("Enter Command: ");
            
            input = keyboard.nextLine();
            
            switch(input.toUpperCase()) {
                case "W":
                    if (currentRow - 1 >= 0) {
                        currentRow--;
                    }
                    break;
                case "A":
                    if (currentCol - 1 >= 0) {
                        currentCol--;
                    }
                    break;
                case "S":
                    if (currentRow + 1 < nRows) {
                        currentRow++;
                    }
                    break;
                case "D":
                    if (currentCol + 1 < nCols) {
                        currentCol++;
                    }
                    break;
                case "M":
                    showMap(wheatField, currentRow, currentCol);
                    break;
                case "G":
                    gather = wheatField[currentRow][currentCol].gather();
                    totalGathered += gather;
                    numGatherings++;
                    System.out.println("Just Gathered " + gather + " bushels of wheat grains");
                    break;
                case "J":
                    System.out.println("\nJUMP");
                    currentRow = rand.nextInt(nRows);
                    currentCol = rand.nextInt(nCols);
                    break;
                case "V":
                    System.out.println("\nnature abhors a vacuum\n");
                    gather = wheatField[currentRow][currentCol].gather(0.9);
                    vacuumTotal = gather;
                    System.out.printf("\nJust Gathered %d bushels of wheat grains at (%d,%d) - this spot\n", gather, currentRow, currentCol);
                    if (currentRow - 1 >= 0) {
                        gather = wheatField[currentRow-1][currentCol].gather(0.2);
                        vacuumTotal += gather;
                        System.out.printf("\nJust Gathered %d bushels of wheat grains at (%d,%d) - North\n", gather, currentRow-1, currentCol);
                    } 
                    if (currentRow + 1 < nRows) {
                        gather = wheatField[currentRow+1][currentCol].gather(0.2);
                        vacuumTotal += gather;
                        System.out.printf("\nJust Gathered %d bushels of wheat grains at (%d,%d) - South\n", gather, currentRow+1, currentCol);
                    }
                    if (currentCol + 1 < nCols) {
                        gather = wheatField[currentRow][currentCol+1].gather(0.2);
                        vacuumTotal += gather;
                        System.out.printf("\nJust Gathered %d bushels of wheat grains at (%d,%d) - East\n", gather, currentRow, currentCol-1);
                    }
                    if (currentCol - 1 >= 0) {
                        gather = wheatField[currentRow][currentCol-1].gather(0.2);
                        vacuumTotal += gather;
                        System.out.printf("\nJust Gathered %d bushels of wheat grains at (%d,%d) - West\n", gather, currentRow, currentCol+1);
                    }
                    System.out.println("\nthe total collected at this spot and the surrounding spots was " + vacuumTotal);
                    totalGathered += vacuumTotal;
                    numGatherings++;
                    break;
                case "Q":
                    System.out.println("\nTotal Gathered " + totalGathered + " bushels of wheat grains");
                    System.out.println("Number of gatherings: " + numGatherings);
                    System.out.println("Average # of bushels per gathering: " + (double) totalGathered / numGatherings);
                    break;
                default:
                    System.out.println("invalid command");
            }
        } while (!input.equalsIgnoreCase("Q"));
    }

}
