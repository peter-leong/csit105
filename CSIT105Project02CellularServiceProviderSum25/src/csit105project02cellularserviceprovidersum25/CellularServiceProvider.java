/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csit105project02cellularserviceprovidersum25;

/**
 * Project 2 - Cellular Service Provider Class
 *
 * @author Peter Leong
 */
public class CellularServiceProvider {

    private String customerName;
    private char customerPackage;
    private int numberOfMinutesUsed;

    /**
     * Default constructor
     *
     * @param initialCustomerName the initial customer name
     * @param initialCustomerPackage the initial customer package
     * @param initialNumberOfMinutesUsed the initial number of minutes used
     */
    public CellularServiceProvider(String initialCustomerName, char initialCustomerPackage, int initialNumberOfMinutesUsed) {
        customerName = initialCustomerName;
        customerPackage = initialCustomerPackage;
        numberOfMinutesUsed = initialNumberOfMinutesUsed;
    }

    /**
     * the getCustomerName method returns the value from the customerName field
     *
     * @return value from the customerName field
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * the setCustomerName method sets a new value for the customerName field
     *
     * @param newCustomerName new value for the customerName field
     */
    public void setCustomerName(String newCustomerName) {
        customerName = newCustomerName;
    }

    /**
     * the getCustomerPackage method returns the value from the customerPackage
     * field
     *
     * @return the value from the customerPackage field
     */
    public char getCustomerPackage() {
        return customerPackage;
    }

    /**
     * the setCustomerName method sets a new value for the customerName field
     *
     * @param newCustomerPackage new value for the customerName field
     */
    public void setCustomerPackage(char newCustomerPackage) {
        customerPackage = newCustomerPackage;
    }

    /**
     * the getNumberOfMinutesUsed method returns the value from the
     * numberOfMinutesUsed field
     *
     * @return the value from the numberOfMinutesUsed field
     */
    public int getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    /**
     * the setCustomerName method sets a new value for the customerName field
     *
     * @param newNumberOfMinutesUsed new value for the customerName field
     */
    public void setNumberOfMinutesUsed(int newNumberOfMinutesUsed) {
        numberOfMinutesUsed = newNumberOfMinutesUsed;
    }

    /**
     * the totalCharges method returns the total monthly cost based on the
     * customer package and number of minutes used
     *
     * @return the total monthly cost based on the customer package and number
     * of minutes used
     */
    public double totalCharges() {
        double total = 0;                   // total monthly charge
        final double BASE_PRICE_A = 39.99;  // base price for package A
        final double BASE_PRICE_B = 59.99;  // base price for package B
        final double BASE_PRICE_C = 69.99;  // base price for package C
        final double EXTRA_CHARGE_A = 0.45; // extra charge for additional minutes for package A
        final double EXTRA_CHARGE_B = 0.40; // extra charge for additional minutes for package B
        final int MINUTES_PROVIDED_A = 450; // amount of minutes included in the base package A
        final int MINUTES_PROVIDED_B = 900; // amount of minutes included in the base package B

        switch (customerPackage) {
            case 'A':
            case 'a':
                if (numberOfMinutesUsed <= MINUTES_PROVIDED_A) {
                    total = BASE_PRICE_A;
                } else {
                    total = BASE_PRICE_A + (numberOfMinutesUsed - MINUTES_PROVIDED_A) * EXTRA_CHARGE_A;
                }
                break;
            case 'B':
            case 'b':
                if (numberOfMinutesUsed <= MINUTES_PROVIDED_B) {
                    total = BASE_PRICE_B;
                } else {
                    total = BASE_PRICE_B + (numberOfMinutesUsed - MINUTES_PROVIDED_B) * EXTRA_CHARGE_B;
                }
                break;
            case 'C':
            case 'c':
                total = BASE_PRICE_C;
                break;
            default:
            // there are only packages A, B, C!
        }

        return total;
    }

    /**
     * the toString method overrides the default toString method and returns a
     * formatted string listing the name, package, number of minutes used, and
     * total charges
     *
     * @return a formatted string listing the name, package, number of minutes
     * used, and total charges
     */
    @Override
    public String toString() {
        return "CellularServiceProvider name: " + customerName + ", package: " + customerPackage + ", minutes: " + numberOfMinutesUsed + ", total charges: " + totalCharges();
    }
}
