package com.tommyBohama4.animals;

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
            String weight, String acquisitionDate, String acquisitionCountry,
            String trainingStatus, boolean reserved, String inServiceCountry) {
        super(name, "dog", gender, age, weight,
                acquisitionDate, acquisitionCountry,
                trainingStatus, reserved, inServiceCountry);
        setBreed(breed);
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
