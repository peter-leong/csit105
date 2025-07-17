package csit105labch5loopssum25;

import java.util.Scanner;

/**
 * Prog Lab for Ch 5
 *
 * @author Stephen Brower, modified by Peter Leong
 */
public class CSIT105LabCh5LoopsSum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Variables
        Scanner keyboard = new Scanner(System.in);  // for interacting with user
        String userCommand;     // to hold the user's command
        int startingPoint;      // to hold the beginning point of the loop
        int endingPoint;        // to hold the ending point of the loop
        int incrementer;        // to hold the amount to change the counter
        int counter;            // for the loop

        do {
            // Display menu to user
            System.out.print("\nEnter choice (A=Ascending Loop, "
                    + "D=Descending Loop,Q=Quit): ");
            userCommand = keyboard.nextLine(); // get user's choice

            // evaluate what the user entered
            switch (userCommand.toUpperCase()) {
                case "Q":
                    System.out.println("\nBye bye!\n");
                    break;
                case "A":
                    System.out.println("\nAscending Loop:\n");

                    // prompt the user for startingPoint, endingPoint, and incrementer
                    System.out.print("Enter starting point: ");
                    startingPoint = keyboard.nextInt();

                    System.out.print("Enter ending point: ");
                    endingPoint = keyboard.nextInt();

                    System.out.print("Enter incrementer: ");
                    incrementer = keyboard.nextInt();

                    // ascending counting loop
                    for (counter = startingPoint; counter <= endingPoint; counter += incrementer) {
                        System.out.print(counter + " ");
                    }
                    System.out.println();

                    // flush buffer
                    keyboard.nextLine();

                    break;
                case "D":
                    System.out.println("\nDescending Loop:\n");

                    // prompt the user for startingPoint, endingPoint, and incrementer
                    System.out.print("Enter starting point: ");
                    startingPoint = keyboard.nextInt();

                    System.out.print("Enter ending point: ");
                    endingPoint = keyboard.nextInt();

                    System.out.print("Enter incrementer: ");
                    incrementer = keyboard.nextInt();

                    // decending counting loop
                    for (counter = startingPoint; counter >= endingPoint; counter += incrementer) {
                        System.out.print(counter + " ");
                    }
                    System.out.println();

                    // flush buffer
                    keyboard.nextLine();

                    break;
                default:
                    System.out.println("\nyou entered an invalid choice");
            } // end switch            

        } while (!(userCommand.equalsIgnoreCase("Q")));
    }

}
