package csit105project04sum25;

/**
 * Simple tester for Sector. (Does not check overloaded gather() method)
 * @author Stephen Brower
 */
public class SimpleSectorTest {
    public static void main(String[] args) {
        //                                  t1  t2  t3
        int startingValue = 333;        // 900 700 333
        int exectedGathered = 266;      // 720 560 266
        int expectedRemaining = 67;     // 180 140  67
        int numGathered;
        int returnResult = 0;
        Sector sector1 = new Sector(startingValue);
        
        System.out.println("==== Simple test for Sector Class ====\n");
        
        // display value from object - number in sector
        System.out.print("sector1 = " + sector1.getNumBushelsOfWheatGrains());

        // test value from object
        if (sector1.getNumBushelsOfWheatGrains() == startingValue) {
            System.out.println(" <- good");
        } else {
            System.out.println("\t\t<-- issue - expected value was " + startingValue);
            returnResult++;
        }
        
        // call gather()
        numGathered = sector1.gather();
        
        // display number gathered
        System.out.print("gathered = " + numGathered);
        
        // test number gathered
        if (numGathered == exectedGathered) {
            System.out.println(" <- good");
        } else {
            System.out.println("\t\t<-- issue - expected value was " + exectedGathered);
            returnResult++;
        }
        
        // display remaining number in sector
        System.out.print("remaining = " + sector1.getNumBushelsOfWheatGrains());

        // test remaining number in sector
        if (sector1.getNumBushelsOfWheatGrains() == expectedRemaining) {
            System.out.println(" <- good");
        } else {
            System.out.println("\t\t<-- issue - expected value was " + expectedRemaining);
            returnResult++;
        }
        
        // summary
        if (returnResult == 0) {
            System.out.println("\nFunctional tests good");
        } else {
            System.out.println("\n***Funtional tests failed***");
        }
        System.exit(returnResult); // throws a fit if not 0
        
    }
    
}
/* 

expected output:
==== Simple test for Sector Class ====

sector1 = 333 <- good
gathered = 266 <- good
remaining = 67 <- good

Functional tests good

*/