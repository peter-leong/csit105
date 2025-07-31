package csit105labch09sum25;

/**
 * Lab for Ch 9 - Inheritance a.k.a. Ship Happens!
 * @author Stephen Brower
 */
public class CSIT105LabCh09Sum25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalNumberOfPassengers = 0;
        int totalCargoCapacity = 0;

        // *****************************************************************//
        // create an array of ships
        Ship[] arrayOfShips = {new Ship("Black Pearl", "1725", "London"),
            new CruiseShip("Titanic", "1911", "Liverpool, UK", 3327),
            new CargoShip("SS Edmund Fitzgerald", "1958", "Milwaukee, WI", 26000),
            new CruiseShip("SS Minnow", "1964", "Gilligan's Island", 7),
            new CargoShip("Maersk Alabama", "1998", "Norfolk, VA", 17375),
            new CruiseShip("Costa Concordia", "2005", "Genoa, Italy", 3780),
            new Ship("Leif Erikson's Ship", " 999", "Iceland"), // The exact name of Leif Erikson's ship is not known...Knarr?
            new Ship("Argo","1300 BC","Iolcus")};   

        // *****************************************************************//
        System.out.println("<>".repeat(35));
        System.out.println("In addition to this driver, manually run and visually Inspect the results of each of the three testers:");
        System.out.println("\tTo test Ship, run BatchTesterShipV5.java (right-click, run-file)");
        System.out.println("\tTo test CruiseShip, run BatchTesterCruiseShipV5.java (right-click, run-file)");
        System.out.println("\tTo test CargoShip, run BatchTesterCargoShipV5.java (right-click, run-file)");
        System.out.println("<>".repeat(35));
        // *****************************************************************//
        // display Array of Ships
        System.out.println("\nArray of Ships");
        System.out.printf("%2s %-20s %-10s %-20s  %5s\t%7s\t%-9s\n", "#", "Ship name", "Yr Built", "Registry","Pass.","Cargo.","Neither?");
        
        for (int i = 0; i < arrayOfShips.length; i++) {
            System.out.printf("%2d %-20s %-10s %-20s ", i, arrayOfShips[i].getShipName(),
                    arrayOfShips[i].getYearBuilt(), arrayOfShips[i].getShipRegistry());

            // replace the .println on the next line with an if/else-if/else block
            if (arrayOfShips[i] instanceof CruiseShip) {
                System.out.printf("%,6d\n", ((CruiseShip) arrayOfShips[i]).getNumPassengers());
                totalNumberOfPassengers += ((CruiseShip) arrayOfShips[i]).getNumPassengers();
            } else if (arrayOfShips[i] instanceof CargoShip) {
                System.out.printf("%,15d\n", ((CargoShip) arrayOfShips[i]).getCargoCapacity());
                totalCargoCapacity += ((CargoShip) arrayOfShips[i]).getCargoCapacity();
            } else {
                System.out.printf("%23s\n", "neither");
            }

        }

        System.out.println("\nFor array of Ships");
        System.out.printf("\tTotal number of passengers: %,d\n", totalNumberOfPassengers);
        System.out.printf("\tTotal cargo capacity: %,d\n", totalCargoCapacity);

    }

}

/*
 * Note: years, tonnage, and passenger capacities pillaged from wikipedia
 *      https://en.wikipedia.org/wiki/Titanic
 *      https://en.wikipedia.org/wiki/MV_Tygra  ( previously Maersk Alabama)
 *      https://en.wikipedia.org/wiki/Costa_Concordia
 *      https://en.wikipedia.org/wiki/S._S._Minnow
 *      https://en.wikipedia.org/wiki/Black_Pearl
 *      https://en.wikipedia.org/wiki/SS_Edmund_Fitzgerald
 *          ** immortalized in song "The Wreck of the Edmund Fitzgerald" by Gordon Lightfoot
 *				https://en.wikipedia.org/wiki/The_Wreck_of_the_Edmund_Fitzgerald
 *      https://en.wikipedia.org/wiki/Leif_Erikson
 *      https://en.wikipedia.org/wiki/Argo
 *      Please sail responsibly.
*/