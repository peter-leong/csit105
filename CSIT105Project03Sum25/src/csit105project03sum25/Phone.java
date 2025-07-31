/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csit105project03sum25;

/**
 * Phone class
 *
 * @author Peter Leong
 */
public class Phone {

    private String model;
    private int numOfCams;

    /**
     * Constructor takes model and number of cameras
     * @param newModel phone model
     * @param newNumOfCams number of cameras
     */
    public Phone(String newModel, int newNumOfCams) {
        model = newModel;
        numOfCams = newNumOfCams;
    }

    /**
     * Gets the phone's model
     * @return the phone's model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the phone's model
     * @param newModel the new phone model
     */
    public void setModel(String newModel) {
        model = newModel;
    }

    /**
     * Gets the number of cameras on the phone
     * @return the number of cameras on the phone
     */
    public int getNumOfCams() {
        return numOfCams;
    }

    /**
     * Sets the number of cameras on the phone
     * @param newNumOfCams the new number of cameras on the phone
     */
    public void setNumOfCams(int newNumOfCams) {
        numOfCams = newNumOfCams;
    }

}
