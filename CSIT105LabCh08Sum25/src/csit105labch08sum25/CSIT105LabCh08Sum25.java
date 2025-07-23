/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csit105labch08sum25;

import java.io.*;
import java.util.Scanner;

/**
 * Lab for Ch 8 Text Processing and Ch 7 2D Arrays
 *
 * @author Peter Leong
 */
public class CSIT105LabCh08Sum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        final int MAX_NUM_ICE_CREAMS = 60;

        String filename = "IceCreamSales.txt";
        String badFilename = "BadData.txt";
        String lineRead;
        String[] tokens;
        String[] iceCreamName = new String[MAX_NUM_ICE_CREAMS];
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        double percentOfTotal;
        
        int[][] iceCreamSalesByMonth = new int[MAX_NUM_ICE_CREAMS][12];
        int numIceCreams = 0;
        int[] mthTotal = new int[12];
        int rowTotal;
        int badRows = 0;
        
        // Open files
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        PrintWriter badFile = new PrintWriter(badFilename);

        // while file has data and array not full
        while (inputFile.hasNext() && numIceCreams < MAX_NUM_ICE_CREAMS) {
            // read an entire line from the file
            lineRead = inputFile.nextLine();

            // split the lineread into an array of strings
            tokens = lineRead.split(",");

            if (tokens.length == 13) {
                // store ice cream name
                iceCreamName[numIceCreams] = tokens[0];

                for (int month = 1; month <= mthTotal.length; month++) {
                    iceCreamSalesByMonth[numIceCreams][month - 1] = Integer.parseInt(tokens[month].trim());
                }

                numIceCreams++;
            } else {
                badFile.println("Bad Data: " + lineRead);
                badRows++;
            }
        }

        // close the file
        inputFile.close();
        badFile.close();
        
        // echo back what we read
        // display column headers
        System.out.printf("\n%-32s ", "Ice Cream Name");
        for (int month = 0; month < mthTotal.length; month++) {
            System.out.printf("%4s ", monthNames[month]);
        }
        System.out.printf("%6s %6s\n\n", "Total", "%");

        // display data
        for (int iceCream = 0; iceCream < numIceCreams; iceCream++) {
            rowTotal = 0;

            // display ice cream as row header
            System.out.printf("%-32s ", iceCreamName[iceCream]);

            // display month data
            for (int month = 0; month < mthTotal.length; month++) {
                System.out.printf("%4d ", iceCreamSalesByMonth[iceCream][month]);
                // total row
                rowTotal += iceCreamSalesByMonth[iceCream][month];
                // total col
                mthTotal[month] += iceCreamSalesByMonth[iceCream][month];
            }
            System.out.printf("%,6d\n", rowTotal);
            
            
        }

        // display month totals
        rowTotal = 0;

        System.out.printf("\n%-32s ", "Total");
        for (int month = 0; month < mthTotal.length; month++) {
            System.out.printf("%4d ", mthTotal[month]);
            rowTotal += mthTotal[month];
        }
        System.out.printf("%,6d\n", rowTotal);

        System.out.println(numIceCreams + " ice creams loaded from file " + filename);
        System.out.println(badRows + " bad rows written to file " + badFilename);

    }
    
}
