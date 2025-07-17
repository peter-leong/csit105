/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csit105proj01sum25;

import java.util.Scanner;

/**
 * Project 2 - Calculates and displays the percent of customers who prefer
 * energy drinks and the the percent of energy drink drinkers that prefer
 * citrus-flavored drinks.
 *
 * @author Peter Leong
 */
public class CSIT105Proj01Sum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        Scanner input = new Scanner(System.in);
        double percentEnergy, percentCitrus, approxEnergy, approxCitrus;
        int numCustomers;

        // get input
        System.out.print("Enter # of customers surveyed: ");
        numCustomers = input.nextInt();

        System.out.print("Enter % of customers surveyed who purchased energy drinks: ");
        percentEnergy = input.nextDouble();

        System.out.print("Enter % of energy drinkers who prefer citrus drinks: ");
        percentCitrus = input.nextDouble();

        // calculate results
        approxEnergy = numCustomers * percentEnergy;
        approxCitrus = approxEnergy * percentCitrus;

        // display results
        System.out.printf("\nApprox. # of Custs bought Energy Drinks: %,.1f\n", approxEnergy);
        System.out.printf("Approx. # of Custs bought Citrus Drinks: %,.1f\n", approxCitrus);
    }

}
