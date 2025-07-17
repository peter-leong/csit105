package csit105labch04whichactivitysum25;

/**
 * Driver for Lab Ch 4. For this lab, you are ONLY modifying the
 * TemperatureBasedActivity.java file
 *
 * @author Stephen T. Brower
 */
public class BatchTestActivityLabCh4V3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temperatureTested;
        int[] extraTests = {11, 12, 32, 33, 51, 81, -200};

        final int STARTING_VALUE = -15; // initial outdoor temperature

        // create TemperatureBasedActivity object using a starting value for outdoor temperature
        TemperatureBasedActivity activity = new TemperatureBasedActivity(STARTING_VALUE);

        System.out.printf("At %d degrees I recommend: %s\n",
                STARTING_VALUE, activity.recommendedActivity());

        for (temperatureTested = -10; temperatureTested <= 115; temperatureTested += 5) {
            // change outdoor temperature
            activity.setOutdoorTemperature(temperatureTested);

            System.out.printf("At %d degrees I recommend: %s\n",
                    temperatureTested, activity.recommendedActivity());
        }
		
		System.out.println("\nExtra Tests\n");

        for (int testValue : extraTests) {
            // change outdoor temperature
            activity.setOutdoorTemperature(testValue);

            System.out.printf("At %d degrees I recommend: %s\n",
                    testValue, activity.recommendedActivity());

        }

    }

}
