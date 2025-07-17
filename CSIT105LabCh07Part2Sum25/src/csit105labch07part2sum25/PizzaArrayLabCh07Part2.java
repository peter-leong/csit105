package csit105labch07part2sum25;

import java.util.Random;

/**
 * This program uses an Array of Pizza! mmmmm....Pizza! Written 10/24/2021,
 * modified 11/1/2023
 *
 * @author Peter Leong
 */
public class PizzaArrayLabCh07Part2 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables

        // array of Pizza - currently all null
        Pizza[] pizzaOrder = new Pizza[10];
        // for output of the Pizza's size
        String[] sizeDescription = {"Small", "Medium", "Large"};
        int index; // for referencing the subscripts of pizzaOrder

        // see OneRandomPizza for generating a random pizza
        int sizeGenerated, numToppingsGenerated; // see OneRandomPizza: for holding random numbers
        String toppingDescriptionGenerated; // see OneRandomPizza - for holding a 'random string'
        // see OneRandomPizza - possible toppings
        // Note: Spam, Sun-dried Spam, and BBQ Spam were inspired by Monty Python
        String[] toppings = {"Mushroom", "Sausage", "Broccoli", "Spam", "Meatball",
            "Pepperoni", "Onion", "Extra Cheese", "Peppers",
            "Sun-dried Tomatoes", "Sun-dried Spam", "Bacon",
            "Ham", "Chicken", "BBQ Chicken", "BBQ Spam"};
        int toppingNum; // see OneRandomPizza - for adding toppings
        Random randomNumbers = new Random(); // see OneRandomPizza - to help generate random numbers

        // generate array of 10 random Pizza objects
        for (index = 0; index < pizzaOrder.length; index++) {
            // generate random number that is 1, 2, or 3
            sizeGenerated = randomNumbers.nextInt(3) + 1;

            // generate random number that is 0..9
            numToppingsGenerated = randomNumbers.nextInt(10);

            toppingDescriptionGenerated = ""; // initialize topping description to an empty string

            if (numToppingsGenerated == 0) {
                toppingDescriptionGenerated += "Plain";
            } else {
                for (toppingNum = 0; toppingNum < numToppingsGenerated; toppingNum++) {
                    toppingDescriptionGenerated += toppings[randomNumbers.nextInt(toppings.length)];
                    if (toppingNum < numToppingsGenerated - 1) {
                        toppingDescriptionGenerated += ", ";
                    }
                }
            }

            // generate a random pizza and add to list
            pizzaOrder[index] = new Pizza(sizeGenerated, numToppingsGenerated, toppingDescriptionGenerated);
        }

        // display the array of Pizza objects by calling the getters
        System.out.println("\nPizza Order:\n");
        System.out.printf("%-6s %10s %6s %s\n", "Size", "# toppings", "Cost", "Topping Description");
        for (index = 0; index < pizzaOrder.length; index++) {
            // print pizza from array using getters
            System.out.printf("%-6s %10d %,6.2f %s\n", sizeDescription[pizzaOrder[index].getSize() - 1], pizzaOrder[index].getNumToppings(), pizzaOrder[index].cost(), pizzaOrder[index].getToppingDescription());
        }
    }
}
