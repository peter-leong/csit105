/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csit105labch02sum25;

import java.util.Scanner;

/**
 * Ch2 Lab - Gets and displays user-entered name, age, and desired yearly salary
 *
 * @author Peter Leong
 */
public class CSIT105LabCh02Sum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // declare variables
        String name;
        int ageYears;
        int ageMonths;
        double annualSalary;
        Scanner input = new Scanner(System.in);

        // get data
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        ageYears = input.nextInt();

        System.out.print("Enter how much you would like to earn a year: ");
        annualSalary = input.nextDouble();

        // calculate data
        ageMonths = ageYears * 12;

        // display results
        System.out.println("\nYour name is " + name);
        System.out.println("Your age is " + ageYears + " years old which is " + ageMonths + " months");
        System.out.printf("You hope to earn $%,.2f per year.\n", annualSalary);

    }

}
