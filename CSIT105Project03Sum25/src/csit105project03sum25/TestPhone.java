/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csit105project03sum25;

/**
 * Tester for Phone Class
 *
 * @author Peter Leong
 */
public class TestPhone {

    public static void main(String[] args) {
        Phone myPhone;
        String model, newModel;
        int numOfCams, newNumOfCams;
        int returnResult = 0;

        // assign values
        model = "iPhone 12 mini";
        numOfCams = 2;

        newModel = "iPhone 16 pro max";
        newNumOfCams = 3;

        // instantiate Phone object
        myPhone = new Phone(model, numOfCams);

        // display values
        System.out.println("Object Instantiated:");

        // show and test model
        System.out.print("\tModel: " + myPhone.getModel());
        if (model.equals(myPhone.getModel())) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + model);
            returnResult++;
        }

        // show and test numOfCams
        System.out.print("\tNumber of cameras: " + myPhone.getNumOfCams());
        if (numOfCams == myPhone.getNumOfCams()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + numOfCams);
            returnResult++;
        }

        // check values ( check getters )
        if (returnResult == 0) {
            System.out.println("\nConstructor/Getters - good");
        } else {
            System.out.println("\nConstructor/Getters - \t\tissues - see above");
        }

        // whether or not the values return are as expected, let's call the setters, then check
        // change the object
        myPhone.setModel(newModel);
        myPhone.setNumOfCams(newNumOfCams);

        // display values
        System.out.println("\nObject changed:");

        // show and test model
        System.out.print("\tModel: " + myPhone.getModel());
        if (newModel.equals(myPhone.getModel())) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + model);
            returnResult++;
        }

        // show and test numOfCams
        System.out.print("\tNumber of cameras: " + myPhone.getNumOfCams());
        if (newNumOfCams == myPhone.getNumOfCams()) {
            System.out.println(" - good");
        } else {
            System.out.println("\t\t - issue - value not as expected...expected: " + numOfCams);
            returnResult++;
        }

        // check values ( check setters )
        if (returnResult == 0) {
            System.out.println("\nSetters - good");
        } else {
            System.out.println("\nSetters - \t\tissues - see above");
        }

        // display summary
        if (returnResult == 0) {
            System.out.println("\nAll tests good");
        } else {
            System.out.println("\nSomething went wrong...check above");
        }

        System.exit(returnResult); // throws a fit if returnResult is not 0
    }
}
