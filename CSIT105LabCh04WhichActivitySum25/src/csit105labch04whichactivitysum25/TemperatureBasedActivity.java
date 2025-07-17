package csit105labch04whichactivitysum25;

/**
 * Class for Lab 4
 *
 * @author Stephen T. Brower ( put your name in the javadoc comment block for
 * the recommendedActivity method ) Note: normally, I ask for you to put your
 * name with an author tag at the Javadoc comment block before the class header
 * – but for this lab, put your name in the Javadoc comment block for the
 * recommendedActivity() method below
 */
public class TemperatureBasedActivity {

    private int outdoorTemperature;

    /**
     * Constructor
     *
     * @param initialOutdoorTemperature initial value for the outdoorTemperature
     * field.
     */
    public TemperatureBasedActivity(int initialOutdoorTemperature) {
        outdoorTemperature = initialOutdoorTemperature;
    }

    /**
     * getOutdoorTemperature method returns the value from the
     * outdoorTemperature field
     *
     * @return value from the outdoorTemperature field
     */
    public int getOutdoorTemperature() {
        return outdoorTemperature;
    }

    /**
     * setOutdoorTemperature method assigns a new value for the
     * outdoorTemperature field
     *
     * @param newOutdoorTemperature new value for the outdoorTemperature field
     */
    public void setOutdoorTemperature(int newOutdoorTemperature) {
        outdoorTemperature = newOutdoorTemperature;
    }

    /**
     * the recommendedActivity method returns a suggested activity based on the
     * value currently in outdoorTemperature
     *
     * Peter Leong
     *
     * Note: normally, I ask for you to put your name with an author tag at the
     * Javadoc comment block before the class header – but for this lab, put
     * your name in this block
     *
     * @return a String with the recommended activity
     */
    public String recommendedActivity() {
        String recommendedActivityToReturn;

        // write an if-else-if chain based on outdoorTemperature here
        if (outdoorTemperature <= 10) {
            recommendedActivityToReturn = "Checkers";
        } else if (outdoorTemperature >= 11 && outdoorTemperature <= 32) {
            recommendedActivityToReturn = "Skiing";
        } else if (outdoorTemperature >= 32 && outdoorTemperature <= 50) {
            recommendedActivityToReturn = "Golf";
        } else if (outdoorTemperature >= 51 && outdoorTemperature <= 80) {
            recommendedActivityToReturn = "Tennis";
        } else if (outdoorTemperature >= 81 && outdoorTemperature <= 100) {
            recommendedActivityToReturn = "Swimming";
        } else {
            recommendedActivityToReturn = "Move north";
        }

        return recommendedActivityToReturn;
    }
}
