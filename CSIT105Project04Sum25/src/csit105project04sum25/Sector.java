/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csit105project04sum25;

/**
 *
 * @author Peter Leong
 */
public class Sector {
    
    private int numBushelsOfWheatGrains;

    public Sector(int initialNumBushelsOfWheatGrains) {
        numBushelsOfWheatGrains = initialNumBushelsOfWheatGrains;
    }

    public int getNumBushelsOfWheatGrains() {
        return numBushelsOfWheatGrains;
    }

    public int gather() {
        int numBushelsGathered;
        
        numBushelsGathered = (int) (numBushelsOfWheatGrains * 0.8);
        numBushelsOfWheatGrains -= numBushelsGathered;
        
        return numBushelsGathered;
    }    
    
    public int gather(double proportion) {
        int numBushelsGathered;
        
        numBushelsGathered = (int) (numBushelsOfWheatGrains * proportion);
        numBushelsOfWheatGrains -= numBushelsGathered;
        
        return numBushelsGathered;
    }
}
