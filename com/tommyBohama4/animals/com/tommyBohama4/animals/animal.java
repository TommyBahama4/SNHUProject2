package com.tommyBohama4.animals;

public class animal {
    private String animalType;
    private String gender;
    private String age;
    private String weight;

    // constructor
    public animal(String animalType, String gender, String age, String weight) {
        this.animalType = animalType;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
