package csit105labch06sum25;

/**
 * Batch tester for Food ( not mentoned on Lab Sheer, but used to test Food )
 *
 * @author Stephen T. Brower
 */
public class BatchFoodTestV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        boolean verboseMode = false;
        int returnResult = 0;
        double defaultMarkdown = 0.1;
        double specialMarkDown = 0.13;
        final double EPSILON = 0.000001;

        // values for item 1
        String item1Description = "Mango Chips";
        double item1Price = 5.29;
        double item1PriceReducedExpected = (double) Math.round(item1Price * (1 - defaultMarkdown) * 100) / 100;

        // values for item 2
        String item2Description = "Curry crisps";
        double item2Price = 5.67;
        double item2PriceReducedExpected = (double) Math.round(item2Price * (1 - specialMarkDown) * 100) / 100;

        //create 2 Food objects 
        Food foodObjectItem1 = new Food(item1Description, item1Price);
        Food foodObjectItem2 = new Food(item2Description, item2Price);

        // create 3 test objects
        Food testFoodObjectItem1 = new Food(item1Description, item1Price);
        Food testFoodObjectItem1Too = new Food(item1Description.toLowerCase(), item1Price);
        Food testFoodObjectItem2 = new Food(item2Description, item2Price);

        System.out.print("=== BatchFoodTestV5 - verbose mode: ");
        if (verboseMode) {
            System.out.println("on - chatter! chatter!");
        } else {
            System.out.println("off - shh!");
        }

        if (verboseMode) {
            System.out.println("\nCreated Objects");
            System.out.printf("Item 1:\t%s %,.2f\n\t%s\nItem 2:\t%s %,.2f\n\t%s\n",
                    foodObjectItem1.getDescription(), foodObjectItem1.getPrice(), foodObjectItem1.toString(),
                    foodObjectItem2.getDescription(), foodObjectItem2.getPrice(), foodObjectItem2.toString());
        }

        // are the created objects as expected?
        System.out.print("\nCreation Check:\t");
        System.out.print("Item 1:\t");
        if (foodObjectItem1.getDescription().equals(item1Description)) {
            System.out.print(" desc-yes ");
        } else {
            System.out.print(" \n\tdesc-NO\n");
            returnResult++;
        }
        if (foodObjectItem1.getPrice() == item1Price) {
            System.out.print(" price-yes ");
        } else {
            System.out.print(" \n\tprice-NO\n");
            returnResult++;
        }
        System.out.print("\t\tItem 2:\t");
        if (foodObjectItem2.getDescription().equals(item2Description)) {
            System.out.print(" desc-yes ");
        } else {
            System.out.print(" \n\tdesc-NO\n");
            returnResult++;
        }
        if (foodObjectItem2.getPrice() == item2Price) {
            System.out.print(" price-yes ");
        } else {
            System.out.print(" \n\tprice-NO\n");
            returnResult++;
        }
        System.out.println();

        // markdown both
        foodObjectItem1.markdown();
        foodObjectItem2.markdown(specialMarkDown);

        if (verboseMode) {
            System.out.println("\nObjects Reduced");
            System.out.printf("Item 1:\t%s %,.2f\n\t%s\nItem 2:\t%s %,.2f\n\t%s\n",
                    foodObjectItem1.getDescription(), foodObjectItem1.getPrice(), foodObjectItem1.toString(),
                    foodObjectItem2.getDescription(), foodObjectItem2.getPrice(), foodObjectItem2.toString());
        }

        // default markdown check:
        System.out.print("\nMarkdown Check:\t");
        if (Math.abs(foodObjectItem1.getPrice() - item1PriceReducedExpected) <= EPSILON) {
            System.out.print("def: yes ");
        } else {
            System.out.print("\n\tdefault markdown-NO\t");
            System.out.printf("%,.2f\t%,.2f\t%f\n", foodObjectItem1.getPrice(), item1PriceReducedExpected,
                    (foodObjectItem1.getPrice() - item1PriceReducedExpected));
            returnResult++;
        }
        System.out.print("\t\t");

        // default markdown check:
        if (Math.abs(foodObjectItem2.getPrice() - item2PriceReducedExpected) <= EPSILON) {
            System.out.print("spec: -yes ");
        } else {
            System.out.print("\n\tsepecial markdown-NO\t");
            System.out.printf("%,.2f\t%,.2f\t%f\n", foodObjectItem2.getPrice(), item2PriceReducedExpected,
                    (foodObjectItem1.getPrice() - item2PriceReducedExpected));
            returnResult++;
        }
        System.out.println();

        if (verboseMode) {
            System.out.println("\nCheck equals() Objects");
            System.out.printf("Item 1:\t%s %,.2f\n\t%s\nItem 1 Too:\t%s %,.2f\n\t\t%s\n",
                    testFoodObjectItem1.getDescription(), testFoodObjectItem1.getPrice(), testFoodObjectItem1.toString(),
                    testFoodObjectItem1Too.getDescription(), testFoodObjectItem1Too.getPrice(), testFoodObjectItem1Too.toString());
            System.out.printf("Item 2:\t%s %,.2f\n\t%s\n",
                    testFoodObjectItem2.getDescription(), testFoodObjectItem2.getPrice(), testFoodObjectItem2.toString());
        }

        System.out.print("\n==?");
        if (testFoodObjectItem1 == testFoodObjectItem1Too) {
            System.out.print("\n\ttrue - Something went wrong with the pointers!!\n");
            returnResult++;
        } else {
            System.out.print(" false - good");
        }

        if (verboseMode) {
            System.out.print("\ttestFoodObjectItem1.equals(testFoodObjectItem1Too) :");
        } else {
            System.out.print("\t1.equals(1Too)? ");
        }
        if (testFoodObjectItem1.equals(testFoodObjectItem1Too)) {
            System.out.print(" true - good");
        } else {
            System.out.print("\n\tfalse - equals() returned an unexpected result!!\n");
            returnResult++;
        }

        if (verboseMode) {
            System.out.print("\ttestFoodObjectItem1.equals(testFoodObjectItem2) :");
        } else {
            System.out.print("\t1.equals(2)? ");
        }
        if (testFoodObjectItem1.equals(testFoodObjectItem2)) {
            System.out.print("\n\ttrue - equals() returned an unexpected result!!\n");
            returnResult++;
        } else {
            System.out.println(" false - good");
        }

        if (returnResult == 0) {
            System.out.println("\nAll automated tests good");
        } else {
            System.out.println("\n*** automated tests off - review results above ***");
        }

        System.out.println("...visually inspect toString(): " + testFoodObjectItem1);

        System.exit(returnResult); // throws a fit if not 0
    }
}
/*
Expected output:
=== BatchFoodTestV5 - verbose mode: off - shh!

Creation Check:	Item 1:	 desc-yes  price-yes 		Item 2:	 desc-yes  price-yes 

Markdown Check:	def: yes 		spec: -yes 

==? false - good	1.equals(1Too)?  true - good	1.equals(2)?  false - good

All automated tests good
...visually inspect toString(): Mango Chips 5.29
 
 */
