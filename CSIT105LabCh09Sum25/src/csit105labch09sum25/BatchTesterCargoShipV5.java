package csit105labch09sum25;

/**
 * Lab for Ch 9 - tester for CargoShip
 *
 * @author Stephen T. Brower
 */
public class BatchTesterCargoShipV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // values for instantiation of object
        String shipName1 = "Old Rusty Hauler";
        String yearBuilt1 = "1896";
        String shipRegistry1 = "Location1";
        int tonage1 = 3200;

        // values for changing object
        String shipName2 = "Oversized Barge";
        String yearBuilt2 = "2019";
        String shipRegistry2 = "Over There";
        int tonage2 = 1700;

        // object to create
        Ship myCargoShip;

        // for testing
        int returnValue = 0;

        // display tester header
        System.out.println("\nShip as CargoShip Class Tester  Version 5\n");

        // announce creation of CargoShip object
        System.out.println("Creating Ship as CargoShip using values: " + shipName1 + " " + yearBuilt1 + " " + shipRegistry1
                + " " + tonage1);

        // create CargoShip object
        myCargoShip = new CargoShip(shipName1, yearBuilt1, shipRegistry1, tonage1);

        // display ship name
        System.out.printf("ship getShipName() : %25s", myCargoShip.getShipName());

        // test ship name
        if (myCargoShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCargoShip.getShipName().equals(shipName1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display year built
        System.out.printf("ship getYearBuilt(): %25s", myCargoShip.getYearBuilt());

        // test year built
        if (myCargoShip.getYearBuilt() == yearBuilt1) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // dislay ship registry (home port locatuon)
        System.out.printf("ship getShipRegistry(): %25s", myCargoShip.getShipRegistry());

        // test ship regitry
        if (myCargoShip.getShipRegistry() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCargoShip.getShipRegistry().equals(shipRegistry1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // make sure myCargoShip is a CargoShip
        if (myCargoShip instanceof CargoShip) {
            // it is a CargoShip...check capacity
            // display cargo capacity
            System.out.printf("ship getCargoCapacity(): %25s", ((CargoShip) myCargoShip).getCargoCapacity());

            // test  cargo capacity
            if (((CargoShip) myCargoShip).getCargoCapacity() == tonage1) {
                System.out.println(" -good");
            } else {
                System.out.println(" \t\t<== issue");
                returnValue++;
            }
        } else {
            // oops! not a CargoShip
            System.out.println("\n*** not a CargoShip ship - can't get tonage***\t<== issue");
            returnValue++;
        }

        // announce we are changing the CargoShip object
        System.out.println("\nchanging ship via setters\nnew values: " + shipName2 + " " + yearBuilt2 + " " + shipRegistry2
                + "\n");

        // change the CargoShip object
        myCargoShip.setShipName(shipName2);
        myCargoShip.setYearBuilt(yearBuilt2);
        myCargoShip.setShipRegistry(shipRegistry2);

        // change the cargo capacity
        if (myCargoShip instanceof CargoShip) {

            ((CargoShip) myCargoShip).setCargoCapacity(tonage2);
        } else {
            System.out.println("\n*** not a CargoShip ship - can't change tonage***\t<== issue");
            returnValue++;
        }

        // display ship name
        System.out.printf("ship getShipName()     : %25s", myCargoShip.getShipName());

        // test ship name
        if (myCargoShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCargoShip.getShipName().equals(shipName2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display year built
        System.out.printf("ship getYearBuilt()    : %25s", myCargoShip.getYearBuilt());

        // test year built
        if (myCargoShip.getYearBuilt() == yearBuilt2) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // display ship registry (home port locatuon)
        System.out.printf("ship getShipRegistry(): %25s", myCargoShip.getShipRegistry());

        // test ship regitry
        if (myCargoShip.getShipRegistry() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myCargoShip.getShipRegistry().equals(shipRegistry2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        // test the cargo capacity
        if (myCargoShip instanceof CargoShip) {
            System.out.printf("ship getCargoCapacity(): %25s", ((CargoShip) myCargoShip).getCargoCapacity());

            if (((CargoShip) myCargoShip).getCargoCapacity() == tonage2) {
                System.out.println(" -good");
            } else {
                System.out.println(" \t\t<== issue");
                returnValue++;
            }
        } else {
            System.out.println("\n*** not a cargo ship - can't get tonage***\t<== issue");
            returnValue++;
        }

        // were there any error detected?
        if (returnValue == 0) {
            // functionally, looks good
            System.out.print("\nAll tests of CargoShip Good\t\t");
        } else {
            // something went wrong
            System.out.println("\n\t\t\t*** issues  -- 'Ship' Happened - see issues above -- ***\treturn value: " + returnValue);
        }

        // display cargo ship using toString() method
        System.out.printf("ship toString(): %s\t\t%s\n\n", myCargoShip, "<-- toString() requires visual inspection");

        //if returnValue is not 0, this throws a fit
        System.exit(returnValue);
    }

}
