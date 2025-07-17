package csit105labch06sum25;

/**
 * In this file, ONLY CHANGE LINE #54!!
 *
 * @author Stephen T. Brower
 */
public class FoodStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 2 of our items
        Food potentialSaleItem1 = new Food("Spicy Sweet Chili Doritos", 4.99);
        Food potentialSaleItem2 = new Food("Spicy Nacho Doritos", 4.79);

        //create 2 of their items
        Food competitorSaleItem1 = new Food("Spicy Sweet Chili Doritos", 4.34);
        Food competitorSaleItem2 = new Food("Spicy Nacho Doritos", 4.17);

        // display the items using getters
        System.out.println("-----------------------------------------------");
        System.out.println("\n\t\t\tgetters return:");
        System.out.println("Currently - us:\nItem 1: "
                + potentialSaleItem1.getDescription()
                + " " + potentialSaleItem1.getPrice());
        System.out.println("Item 2: "
                + potentialSaleItem2.getDescription()
                + " " + potentialSaleItem2.getPrice());
        System.out.println("\nCurrently - them:\nItem 1: "
                + competitorSaleItem1.getDescription()
                + " " + competitorSaleItem1.getPrice());
        System.out.println("Item 2: "
                + competitorSaleItem2.getDescription()
                + " " + competitorSaleItem2.getPrice());

        // display the items using toString()
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n\t\t\ttoString() returns:");
        System.out.println("Currently - us:\nItem 1: " + potentialSaleItem1);
        System.out.println("Item 2: " + potentialSaleItem2);
        System.out.println("\nCurrently - them:\nItem 1: " + competitorSaleItem1);
        System.out.println("Item 2: " + competitorSaleItem2);
        System.out.println("\n-----------------------------------------------");

        // mark down our items
        System.out.println("\n*** Markdown 2 items ***");

        // markdown item1 using the default %
        potentialSaleItem1.markdown(); // leave the () as is!

        // markdown item2 using 13%
        potentialSaleItem2.markdown(0.13); // <-- change to potentialSaleItem2.markdown(.13);

        //display the items and note if they match
        System.out.println("\n-----------------------------------------------");
        // display our item 1
        System.out.print("\nNow - us:\nItem 1: " + potentialSaleItem1);

        // display if item 1 matches their item
        if (potentialSaleItem1.equals(competitorSaleItem1)) {
            System.out.println("\t\t<-- matches theirs");
        } else {
            System.out.println("\t\t<-- does not match theirs");
        }

        // display our item 2
        System.out.print("Item 2: " + potentialSaleItem2);

        // display if item 2 matches their item
        if (potentialSaleItem2.equals(competitorSaleItem2)) {
            System.out.println("\t\t<-- matches theirs");
        } else {
            System.out.println("\t\t<-- does not match theirs");
        }

        // display their item 1
        System.out.print("\nCurrently - them:\nItem 1: " + competitorSaleItem1);

        // display if item 1 matches their item
        if (competitorSaleItem1.equals(potentialSaleItem1)) {
            System.out.println("\t\t<-- matches ours");
        } else {
            System.out.println("\t\t<-- does not match ours");
        }

        // display their item 2
        System.out.print("Item 2: " + competitorSaleItem2);

        // display if item 2 matches their item
        if (competitorSaleItem2.equals(potentialSaleItem2)) {
            System.out.println("\t\t<-- matches ours");
        } else {
            System.out.println("\t\t<-- does not match ours");
        }
    }
}
