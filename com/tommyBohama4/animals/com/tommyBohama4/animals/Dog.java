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

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() == this.getClass())
            return this.getName().toLowerCase().equals(((Dog) obj).getName().toLowerCase());
        else if (obj.getClass() == String.class)
            return this.getName().toLowerCase().equals(((String) obj).toLowerCase());
        return false;
    }
}
