package csit105labch09sum25;

/**
 * Lab for Ch 9 - tester for CruiseShip
 *
 * @author Stephen T. Brower
 */
public class BatchTesterCruiseShipV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // values for instantiation of object
        String shipName1 = "Nautilus King of the Sea";
        String yearBuilt1 = "1492";
        String shipRegistry1 = "Location1";
        int passengers1 = 62;

        // values for changing object
        String shipName2 = "Nau Sea";
        String yearBuilt2 = "2017";
        String shipRegistry2 = "Over There";
        int passengers2 = 5;

        // object to create
        Ship myCruiseShip;

        // for testing
        int returnValue = 0;

        // display tester header
        System.out.println("\nShip as CruiseChip Class Tester version 5\n");

        // announce creation of CruiseShip object
        System.out.println("Creating Ship as CruiseShip using values: " + shipName1 + " " + yearBuilt1
                + " " + shipRegistry1 + " " + passengers1);

        // create CruiseShip object
        myCruiseShip = new CruiseShip(shipName1, yearBuilt1, shipRegistry1, passengers1);

        // display ship name
        System.out.printf("ship getShipName()     : %25s", myCruiseShip.getShipName());

        // test ship name
        if (myCruiseShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCruiseShip.getShipName().equals(shipName1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display year built
        System.out.printf("ship getYearBuilt(): %25s", myCruiseShip.getYearBuilt());

        // test year built
        if (myCruiseShip.getYearBuilt() == yearBuilt1) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // dislay ship registry (home port locatuon)
        System.out.printf("ship getShipRegistry(): %25s", myCruiseShip.getShipRegistry());

        // test ship regitry
        if (myCruiseShip.getShipRegistry() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCruiseShip.getShipRegistry().equals(shipRegistry1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // make sure myCruiseShip is a CruiseShip
        if (myCruiseShip instanceof CruiseShip) {
            // it is a CruiseShip...check num passengers
            // display num passengers
            System.out.printf("ship getNumPassengers(): %25s", ((CruiseShip) myCruiseShip).getNumPassengers());

            // test num passengers
            if (((CruiseShip) myCruiseShip).getNumPassengers() == passengers1) {
                System.out.println(" -good");
            } else {
                System.out.println(" \t\t<== issue");
                returnValue++;
            }
        } else {
            // oops! not a CruiseShip
            System.out.println("\n*** not a cruise ship - can't get passengers***\t<== issue");
            returnValue++;
        }

        // announce we are changing the CruiseShip object
        System.out.println("\nchanging ship via setters\nnew values: " + shipName2 + " " + yearBuilt2 + " " + shipRegistry2
                + "\n");

        // change the CruiseShip object
        myCruiseShip.setShipName(shipName2);
        myCruiseShip.setYearBuilt(yearBuilt2);
        myCruiseShip.setShipRegistry(shipRegistry2);

        // change the number of passengers
        if (myCruiseShip instanceof CruiseShip) {

            ((CruiseShip) myCruiseShip).setNumPassengers(passengers2);
        } else {
            System.out.println("\n*** not a cruise ship - can't get passengers***\t<== issue");
            returnValue++;
        }

        // display ship name
        System.out.printf("ship getShipName()     : %25s", myCruiseShip.getShipName());

        // test ship name
        if (myCruiseShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCruiseShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCruiseShip.getShipName().equals(shipName2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display year built
        System.out.printf("ship getYearBuilt()    : %25s", myCruiseShip.getYearBuilt());

        // test year built
        if (myCruiseShip.getYearBuilt() == yearBuilt2) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display ship registry (home port locatuon)
        System.out.printf("ship getShipRegistry(): %25s", myCruiseShip.getShipRegistry());

        // test ship regitry
        if (myCruiseShip.getShipRegistry() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCruiseShip.getShipRegistry().equals(shipRegistry2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // test the number of passengers
        if (myCruiseShip instanceof CruiseShip) {
            System.out.printf("ship getNumPassengers(): %25s", ((CruiseShip) myCruiseShip).getNumPassengers());

            if (((CruiseShip) myCruiseShip).getNumPassengers() == passengers2) {
                System.out.println(" -good");
            } else {
                System.out.println(" \t\t<== issue");
                returnValue++;
            }
        } else {
            System.out.println("\n*** not a cruise ship - can't get passengers***\t<== issue");
            returnValue++;
        }

        // were there any error detected?
        if (returnValue == 0) {
            // functionally, looks good
            System.out.print("\nAll tests of CruiseShip Good\t\t`");
        } else {
            // something went wrong
            System.out.println("\n\t\t\t*** issues -- CruiseShip Happened -- ***\treturn value: " + returnValue);
        }

        // display cruise ship using toString() method
        System.out.printf("ship toString(): %s\t\t%s\n\n", myCruiseShip, "<-- toString() requires visual inspection");

        //if returnValue is not 0, this throws a fit
        System.exit(returnValue);

    }

}
