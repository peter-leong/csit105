package csit105labch07part2sum25;

import java.util.Random;

/**
 * This program generate 1 random Pizza! mmmmm....Pizza! Written 11/1/2023 using
 * PizzaArray.java from Demo Ch 7 Part 2 as a source.
 *
 * @author Stephen Brower
 */
public class OneRandomPizza {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        int sizeGenerated, numToppingsGenerated; // for holding random numbers for size and # toppings
        String toppingDescriptionGenerated; // for holding a 'random string'
        // possible toppings...Note: Spam, Sun-dried Spam, and BBQ Spam were inspired by Monty Python
        String[] toppings = {"Mushroom", "Sausage", "Broccoli", "Spam", "Meatball",
            "Pepperoni", "Onion", "Extra Cheese", "Peppers",
            "Sun-dried Tomatoes", "Sun-dried Spam", "Bacon",
            "Ham", "Chicken", "BBQ Chicken", "BBQ Spam"};
        Random randomNumbers = new Random(); // to help generate random numbers
        int toppingNum; // for adding toppings
        String[] sizeDescription = {"Small", "Medium", "Large"}; // for output of the Pizza's size
        Pizza randomPizza; // to hold a randomly generated Pizza

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

        // create Pizza object 
        randomPizza = new Pizza(sizeGenerated, numToppingsGenerated,
                toppingDescriptionGenerated);

        // display the Pizza object using getters
        System.out.println("\nOne Pizza:\n");
        System.out.printf("%-6s %10s %6s %s\n", "Size", "# toppings", "Cost", "Topping Description");
        System.out.printf("%-6s %10d %,6.2f %s\n",
                sizeDescription[randomPizza.getSize() - 1],
                randomPizza.getNumToppings(),
                randomPizza.cost(),
                randomPizza.getToppingDescription());
        // for this lab do not just print the object

    }
}
