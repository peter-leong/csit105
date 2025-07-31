package csit105labch03sum25;

/**
 * Batch Tester Version 2 to test Soda class for CSIT 105 Prog Lab Ch 3 DO NOT
 * CHANGE THIS FILE!!
 *
 * @author Stephen T. Brower
 */
public class BatchTestSodaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Soda mySoda;
        String name, newName;
        double price, newPrice;
        int calories, newCalories;
        int returnResult = 0;

        // Assign Values
        name = "Sierra Missed";
        price = 3.10;
        calories = 200;

        newName = "Diet Sierra Myst";
        newPrice = 2.79;
        newCalories = 3;

        //instantiate Soda object
        mySoda = new Soda(name, price, calories);

        // display values
        System.out.println("Object Instantiated:");

        // show and test name
        // note: if mySoda.getName() is null, this does not crash
        System.out.print("\tName: " + mySoda.getName());
        if (name.equals(mySoda.getName())) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + name);
            returnResult++;
        }

        // show and test price
        System.out.printf("\tPrice: %.2f", mySoda.getPrice());
        if (price == mySoda.getPrice()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + price);
            returnResult++;
        }

        // show and test calories
        System.out.print("\tCalories: " + mySoda.getCalories());
        if (calories == mySoda.getCalories()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + calories);
            returnResult++;
        }

        // check values ( check getters )
        if (returnResult == 0) {
            System.out.println("\nConstructor/Getters - good");
        } else {
            System.out.println("\nConstructor/Getters - \t\tissues - see above");
        }

        // whether or not the values return are as expected, let's call the setters, then check
        // change the object
        mySoda.setName(newName);
        mySoda.setPrice(newPrice);
        mySoda.setCalories(newCalories);

        // display values
        System.out.println("\nObject changed:");

        // check values ( call getters to check setters )
        // show and test name
        // note: if mySoda.getName() is null, this does not crash
        System.out.print("\tName: " + mySoda.getName());
        if (newName.equals(mySoda.getName())) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newName);
            returnResult++;
        }

        // show and test price
        System.out.printf("\tPrice: %.2f", mySoda.getPrice());
        if (newPrice == mySoda.getPrice()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newPrice);
            returnResult++;
        }

        // show and test calories
        System.out.print("\tCalories: " + mySoda.getCalories());
        if (newCalories == mySoda.getCalories()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newCalories);
            returnResult++;
        }

        // check values ( check setters )
        if (returnResult == 0) {
            System.out.println("\nSetters - good");
        } else {
            System.out.println("\nSetters - \t\tissues - see above");
        }

        // display summary  
        if (returnResult == 0) {
            System.out.println("\nAll tests good");
        } else {
            System.out.println("\nSomething went wrong...check above");
        }

        System.exit(returnResult); // throws a fit if returnResult is not 0

    }

}
