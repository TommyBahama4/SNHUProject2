package com.tommyBohama4.animals;

import java.util.Scanner;

public class Monkey extends RescueAnimal {
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    /**
     * Default constructor for monkey
     * 
     * @param name
     * @param gender
     * @param age
     * @param weight
     * @param acquisitionDate
     * @param acquisitionCountry
     * @param trainingStatus
     * @param reserved
     * @param inServiceCountry
     * @param species
     * @param tailLength
     * @param height
     * @param bodyLength
     */
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
     * @return the species of monkey
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

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
}
