package csit105labch03sum25;

/**
 * Soda class for Prog Lab for Ch 3
 *
 * @author Peter Leong
 */
public class Soda {

    private String name;
    private double price;
    private int calories;

    /**
     * Constructor
     *
     * @param initialName value for the name field
     * @param initialPrice value for the price field
     * @param initialCalories value for the calories field
     */
    public Soda(String initialName, double initialPrice, int initialCalories) {
        name = initialName;
        price = initialPrice;
        calories = initialCalories;
    }

    /**
     * the getName method returns the value from the name field
     *
     * @return value from the name field
     */
    public String getName() {
        return name;
    }

    /**
     * the setName method sets a new value for the name field
     *
     * @param newName new value for the name field
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * the getPrice method returns the value from the price field
     *
     * @return value from the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * the setPrice method sets a new value for the price field
     *
     * @param newPrice new value for the price field
     */
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    /**
     * the getCalories method gets the value from the calories field
     *
     * @return value from the calories field
     */
    public int getCalories() {
        return calories;
    }

    /**
     * the setCalories method sets a new value for the calories method
     *
     * @param newCalories new value for the calories method
     */
    public void setCalories(int newCalories) {
        calories = newCalories;
    }

}
