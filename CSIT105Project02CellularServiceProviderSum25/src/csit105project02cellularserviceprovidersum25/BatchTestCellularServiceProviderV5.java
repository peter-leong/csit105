package csit105project02cellularserviceprovidersum25;

/**
 * Batch Tester for testing CellularServiceProvider class. 
 *** See bottom of file for expected output *** 
 * 10/20/2021 - added exit with results 
 * 10/9/2022 - added 2 test cases and removed 'Breaking Bad' reference 
 * 11/9/2023 - removed toString() reference
 * 6/22/2025 - Changed class name added back toString() reference
 *
 * @author Stephen T. Brower
 */
public class BatchTestCellularServiceProviderV5 {

    private static final double EPSILON = 0.000001;

    /**
     * starting point
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int returnResults = 0;
        String customerName, newCustomerName;
        char customerPackage, newCustomerPackage;
        int minutesUsed, newMinutesUsed;
        double expectedCharges, newExpectedCharges;

        CellularServiceProvider testObject;

        System.out.println("*** CellularServiceProvider batch tester V5 ***\n");
        System.out.println("*** tests constructor/setters/getters - The tests are not meant to be exhaustive tests ***");

        // assign starting values
        customerName = "Test 0-A";
        customerPackage = 'a';
        minutesUsed = 451;
        expectedCharges = 39.99 + 0.45 * (minutesUsed - 450); // assumes package A

        // create a test object using starting values`
        testObject = new CellularServiceProvider(customerName, customerPackage, minutesUsed);

        System.out.println("\ntest constructor/getters:");
        System.out.print("\tCustomer Name: " + testObject.getCustomerName());
        if (customerName.equals(testObject.getCustomerName())) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + customerName);
            returnResults++;
        }

        System.out.print("\tCustomer Package: " + testObject.getCustomerPackage());
        if (customerPackage == testObject.getCustomerPackage()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + customerPackage);
            returnResults++;
        }

        System.out.print("\tMinutes Used: " + testObject.getNumberOfMinutesUsed());
        if (minutesUsed == testObject.getNumberOfMinutesUsed()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + minutesUsed);
            returnResults++;
        }

        System.out.printf("\tCharges: %6.2f", testObject.totalCharges());
        if (Math.abs(expectedCharges - testObject.totalCharges()) < EPSILON) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + expectedCharges);
            returnResults++;
        }

        // assign update values
        newCustomerName = "Test 0-B";
        newCustomerPackage = 'B';
        newMinutesUsed = 901;
        newExpectedCharges = 59.99 + 0.40 * (newMinutesUsed - 900); // assumes package B

        // change testObject using setters
        testObject.setCustomerName(newCustomerName);
        testObject.setCustomerPackage(newCustomerPackage);
        testObject.setNumberOfMinutesUsed(newMinutesUsed);

        System.out.println("test setters:");
        System.out.print("\tCustomer Name: " + testObject.getCustomerName());
        if (newCustomerName.equals(testObject.getCustomerName())) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newCustomerName);
            returnResults++;
        }

        System.out.print("\tCustomer Package: " + testObject.getCustomerPackage());
        if (newCustomerPackage == testObject.getCustomerPackage()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newCustomerPackage);
            returnResults++;
        }

        System.out.print("\tMinutes Used: " + testObject.getNumberOfMinutesUsed());
        if (newMinutesUsed == testObject.getNumberOfMinutesUsed()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newMinutesUsed);
            returnResults++;
        }

        System.out.printf("\tCharges: %6.2f", testObject.totalCharges());
        if (Math.abs(newExpectedCharges - testObject.totalCharges()) < EPSILON) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + newExpectedCharges);
            returnResults++;
        }

        System.out.println("\nmultiple tests to test totalCharges():");

        //                                                      /-expected charges
        returnResults += displayObject(new CellularServiceProvider("Test01", 'a', 449), (39.99));
        returnResults += displayObject(new CellularServiceProvider("Test02", 'A', 450), (39.99));
        returnResults += displayObject(new CellularServiceProvider("Test03", 'a', 451), (39.99 + 0.45 * (451 - 450)));

        returnResults += displayObject(new CellularServiceProvider("Test04", 'A', 501), (39.99 + 0.45 * (501 - 450)));

        returnResults += displayObject(new CellularServiceProvider("Test05", 'b', 899), (59.99));
        returnResults += displayObject(new CellularServiceProvider("Test06", 'B', 900), (59.99));
        returnResults += displayObject(new CellularServiceProvider("Test07", 'b', 901), (59.99 + .40 * (901 - 900)));

        returnResults += displayObject(new CellularServiceProvider("Test08", 'b', 1020), (59.99 + 0.40 * (1020 - 900)));

        returnResults += displayObject(new CellularServiceProvider("Test09", 'c', 1), 69.99);
        returnResults += displayObject(new CellularServiceProvider("Test10", 'C', 500), 69.99);
        returnResults += displayObject(new CellularServiceProvider("Test11", 'c', 2000), 69.99);
        returnResults += displayObject(new CellularServiceProvider("Test12", 'C', 60 * 24 * 30), 69.99);
        returnResults += displayObject(new CellularServiceProvider("Test13A", 'j', 1313), 0);
        returnResults += displayObject(new CellularServiceProvider("Test13B", 'K', 1313), 0);

        if (returnResults == 0) {
            System.out.print("\nAll automated tests good");
        } else {
            System.out.print("\n*** automated tests off***");
        }

        System.out.println(" - visually inspect toString(): " + testObject);

        System.exit(returnResults); // throws a fit if not 0
    }

    /**
     * displayObject method displays a CellularServiceProvider object using
     * getters and compares to an expected value
     *
     * @param passedObject an instance of CellularServiceProvider class
     * @param expected a double value for the expected charges
     * @return 0 if totalCharges() == expected charges, otherwise 1
     */
    public static int displayObject(CellularServiceProvider passedObject, double expected) {
        int result = 0;
        // display object using getters
        System.out.printf("Name: %-8ss Pack: %s Min: %,6d Expected: %,6.2f Charges: %,6.2f",
                passedObject.getCustomerName(),
                passedObject.getCustomerPackage(),
                passedObject.getNumberOfMinutesUsed(),
                expected,
                passedObject.totalCharges());

        // test to see if value is as expected
        if (Math.abs(expected - passedObject.totalCharges()) > EPSILON) {
            System.out.println("\t\t<===");
            result++;
        } else {
            System.out.println();
        }
        return result;
    }
}
/*
Sample Output:
*** CellularServiceProvider batch tester V5 ***

*** tests constructor/setters/getters - The tests are not meant to be exhaustive tests ***

test constructor/getters:
	Customer Name: Test 0-A - good
	Customer Package: a - good
	Minutes Used: 451 - good
	Charges:  40.44 - good
test setters:
	Customer Name: Test 0-B - good
	Customer Package: B - good
	Minutes Used: 901 - good
	Charges:  60.39 - good

multiple tests to test totalCharges():
Name: Test01  s Pack: a Min:    449 Expected:  39.99 Charges:  39.99
Name: Test02  s Pack: A Min:    450 Expected:  39.99 Charges:  39.99
Name: Test03  s Pack: a Min:    451 Expected:  40.44 Charges:  40.44
Name: Test04  s Pack: A Min:    501 Expected:  62.94 Charges:  62.94
Name: Test05  s Pack: b Min:    899 Expected:  59.99 Charges:  59.99
Name: Test06  s Pack: B Min:    900 Expected:  59.99 Charges:  59.99
Name: Test07  s Pack: b Min:    901 Expected:  60.39 Charges:  60.39
Name: Test08  s Pack: b Min:  1,020 Expected: 107.99 Charges: 107.99
Name: Test09  s Pack: c Min:      1 Expected:  69.99 Charges:  69.99
Name: Test10  s Pack: C Min:    500 Expected:  69.99 Charges:  69.99
Name: Test11  s Pack: c Min:  2,000 Expected:  69.99 Charges:  69.99
Name: Test12  s Pack: C Min: 43,200 Expected:  69.99 Charges:  69.99
Name: Test13A s Pack: j Min:  1,313 Expected:   0.00 Charges:   0.00
Name: Test13B s Pack: K Min:  1,313 Expected:   0.00 Charges:   0.00

All automated tests good - visually inspect toString(): CellularServiceProvider name: Test 0-B, package: B, minutes 901, total charges: 60.39
 */
