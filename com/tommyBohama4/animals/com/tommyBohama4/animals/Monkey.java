package com.tommyBohama4.animals;

public class Monkey extends RescueAnimal {
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor
    public Monkey(String name, String gender, String age,
            String weight, String acquisitionDate, String acquisitionCountry,
            String trainingStatus, boolean reserved, String inServiceCountry,
            String species, String tailLength, String height, String bodyLength) {
        super(name, "monkey", gender, age, weight,
                acquisitionDate, acquisitionCountry,
                trainingStatus, reserved, inServiceCountry);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    /**
     * @return String returns the species of monkey
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species of monkey
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * 
     * @return length of monkey tail
     */
    public String getTailLength() {
        return tailLength;
    }

    /**
     * 
     * @param tailLength the length of the tail
     */
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    /**
     * 
     * @return Monkey height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height height of the monkey
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 
     * @return the monkey's body length
     */
    public String getBodyLength() {
        return bodyLength;
    }

    /**
     * 
     * @param bodyLength length of the body
     */
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
}
