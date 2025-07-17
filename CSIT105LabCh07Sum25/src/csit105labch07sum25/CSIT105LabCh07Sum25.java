/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csit105labch07sum25;

import java.util.Scanner;

/**
 * Lab for Chapter 7 Part 1 - gets number of movies watched per day and displays
 * a table of the results
 *
 * @author Peter Leong
 */
public class CSIT105LabCh07Sum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double average = 0.0;
        int[] moviesWatched = new int[7];
        int total = 0;
        int n = 0;

        // get data loop
        do {
            System.out.print("Enter the  number of movies watched for the day (-1 when done): ");
            if ((moviesWatched[n] = keyboard.nextInt()) != -1) {
                // Yell at the user if they happen to enter a negative number that isn't -1
                if (moviesWatched[n] < 0) {
                    System.out.println("You can't watch a negative # of movies dummy!");
                    continue;
                }
                total += moviesWatched[n++];
            } else { // input is -1
                break;
            }
        } while (n < moviesWatched.length); // up to 7 days

        // print results
        if (n > 0) {
            // all 7 days were entered
            if (n == 7) {
                System.out.println("\nThat's the whole week!");
            }

            // print out the average # of movies watched
            average = (double) total / n;
            System.out.printf("\nAverage # of movies watched over %d days: %.1f\n", n, average);

            // print table listing days, # movies watched, and difference between average
            System.out.println("\n    Number");
            System.out.println("Day Watched Difference");
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d %7d %10.1f\n", i, moviesWatched[i], moviesWatched[i] - average);
            }
        } else {
            System.out.println("No Data Entered! Get watching!");
        }

    }

}
