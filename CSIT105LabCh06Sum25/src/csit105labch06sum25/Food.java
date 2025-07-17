package csit105labch06sum25;

/**
 * Food Class provided for Lab 6 - originally written by Stephen Brower
 *
 * @author Stephen Brower ( see line 71 )
 */
public class Food {

    private String description;
    private double price;

    /**
     * Constructor
     *
     * @param initialDescription value for the description field
     * @param initialPrice value for the price field
     */
    public Food(String initialDescription, double initialPrice) {
        description = initialDescription;
        price = initialPrice;
    }

    /**
     * getDescription method returns value in the description field
     *
     * @return value in the description field
     */
    public String getDescription() {
        return description;
    }

    /**
     * getPrice method returns value in the price field
     *
     * @return value in the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * setDesciption method assigns a new value for description field
     *
     * @param newDescription new value for description field
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /**
     * setPrice method assigns a new value for the price field
     *
     * @param newPrice new value for the price field
     */
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    /**
     * markdown method reduces the price by 10%
     */
    public void markdown() {            // DO NOT CHANGE THIS METHOD!
        // do not change this method
        double percentReduction = .1;
        // do not change this method
        price = (double) Math.round(price * (1 - percentReduction) * 100) / 100;
        // do not change this method
    }// do not change this method

    /* ==================== changes for Lab go below ========================= */
    /* author for the additional methods: Peter Leong */
    
    /**
     * toString overrides default toString
     *
     * @return description and price with a space in between
     */
    @Override
    public String toString() {
        return description + " " + price;
    }

    /**
     * markdown method reduces the price by % percentReduction
     * @param percentReduction
     */
    public void markdown(double percentReduction) {
        price = (double) Math.round(price * (1 - percentReduction) * 100) / 100;
    }

    /**
     * equals method compares prices and description
     * @param otherObject
     * @return true if the price and description match
     * @throws ClassCastException
     */
    @Override
    public boolean equals(Object otherObject) throws ClassCastException {
        if (!(otherObject instanceof Food)) {
            throw new ClassCastException("Dude...I wanted food!.");
        }

        // if we got here, otherObject is a Food - cast as Food!
        Food otherFood = (Food) otherObject;

        return (price == otherFood.price && description.equalsIgnoreCase(otherFood.description));
    }
}
