package com.tommyBohama4.animals;

import java.util.List;
import java.util.Scanner;

public class Driver {

    static char displayDogList = '4';
    static char displayMonkeyList = '5';
    static char displayAllAnimals = '6';

    public static void main(String[] args) {
        Repository data = new Repository();

        Scanner input = new Scanner(System.in); // scanner class object
        char option;

        do // loop until user exits application
        {

            displayMenu();
            option = input.next().charAt(0);
            if (option == '1') { // intakeNewDog method is called
                intakeNewDog(input, data);
            }

            else if (option == '2') { // intakeNewMonkey method is called
                intakeNewMonkey(input, data);
            }

            else if (option == '3') { // reserveAnimal method is called
                reserveAnimal(input, data);
            }

            else if (option == displayDogList) { // printAnimals method is called to print the dog list
                printAnimals(option, data);
            }

            else if (option == displayMonkeyList) { // printAnimals method is called to print the monkey list
                printAnimals(option, data);
            }

            else if (option == displayAllAnimals) { // printAnimals method is called to print all available animals
                printAnimals(option, data);
            }

            else if (option == 'q') { // exit message prints and application stops running
                System.out.print("You have exited the application.");
                break;
            }

            else { // in the event of an invalid input, tells user and prompts for a new input
                System.out.print("You have entered an invalid input. Please enter a valid input.");
            }
        } while (option != 'q');
    }

    static String getResponse(String inputRequested, Scanner scanner) {
        System.out.println(inputRequested);
        return scanner.nextLine();
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[" + displayDogList + "] Print a list of all dogs");
        System.out.println("[" + displayMonkeyList + "] Print a list of all monkeys");
        System.out.println("[" + displayAllAnimals + "] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList(Repository data) {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
                "Canada");
        List<Dog> dogList = data.getDogList();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    public static void initializeMonkeyList(Repository data) {
        Monkey monkey1 = new Monkey("Alan", "male", "2", "8.5", "03-26-2020", "United States", "in service", false,
                "United States", "Squirrel Monkey", "14.8", "15.6", "17.2");
        Monkey monkey2 = new Monkey("Lucas", "male", "1", "7.2", "09-12-2021", "Argentina", "Phase 4", true,
                "United States", "Capuchin", "19", "21.2", "18.5");
        Monkey monkey3 = new Monkey("Sasha", "female", "3", "18.2", "07-07-2019", "Colombia", "in service", true,
                "Colombia", "Tamarin", "15.2", "11", "12.2");

        List<Monkey> monkeyList = data.getMonkeyList();
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner, Repository data) {
        String name = getResponse("What is the dog's name?", scanner);
        for (Dog dog : data.getDogList()) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }

        String breed = getResponse("What is the dog's breed?", scanner);
        String gender = getResponse("What is the dog's gender?", scanner);
        String age = getResponse("What is the dog's age?", scanner);
        String weight = getResponse("What is the dog's weight?", scanner);
        String acquisitionDate = getResponse("What is the dog's acquisition date?", scanner);
        String acquisitionCountry = getResponse("What is the dog's acquisition country?", scanner);
        String trainingStatus = getResponse("What is the dog's training status?", scanner);
        boolean reserved = Boolean.getBoolean(getResponse("Is this dog reserved?", scanner));
        String inServiceCountry = getResponse("Which country is the dog in service?", scanner);

        Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry);
        data.getDogList().add(dog4);
        System.out.println("Your entry has been added to the Dog List.");
    }

    // Complete intakeNewMonkey
    // Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner, Repository data) {
        String name = getResponse("What is the monkey's name?", scanner);
        for (Monkey monkey : data.getMonkeyList()) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;
            }
        }
        System.out.println("What is the monkey's gender?"); // the following is to add a new monkey to the system
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the monkey's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is this monkey reserved?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Which country is the monkey in service?");
        String inServiceCountry = scanner.nextLine();
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        System.out.println("What is the tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the height?");
        String height = scanner.nextLine();
        System.out.println("What is the body length?");
        String bodyLength = scanner.nextLine();

        Monkey monkey4 = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
                reserved, inServiceCountry, species, tailLength, height, bodyLength);
        data.getMonkeyList().add(monkey4);
        System.out.println("Your entry has been added to the Monkey List.");
    }

    public static void reserveAnimal(Scanner scanner, Repository data) { // how to reserve a monkey
        scanner.nextLine();
        System.out.println("Enter animal type: ");
        String animalType = scanner.nextLine();
        if (animalType.equalsIgnoreCase("Monkey")) {
            System.out.println("Enter the monkey's acquisition country: ");
            String country = scanner.nextLine();
            for (Monkey obj : data.getMonkeyList()) {
                if (obj.getAcquisitionCountry().equalsIgnoreCase(country)) {
                    obj.setReserved(true);
                    System.out.println("This monkey is now reserved.");
                    return;
                }
            }
            System.out.println("The monkey entered is not in the list.");
        } else if (animalType.equalsIgnoreCase("Dog")) { // how to reserve a dog
            System.out.println("Enter the dog's acquisition country: ");
            String country = scanner.nextLine();
            for (Dog obj : data.getDogList()) {
                if (obj.getAcquisitionCountry().equalsIgnoreCase(country)) {
                    obj.setReserved(true);
                    System.out.println("This dog is now reserved.");
                    return;
                }
            }
            System.out.println("The dog entered is not in the list.");
        } else {
            System.out.println("Animal type not found.");
        }
    }

    public static void printAnimals(char option, Repository data) { // print options for dogList, monkeyList, all

        List<Dog> dogList = data.getDogList();
        List<Monkey> monkeyList = data.getMonkeyList();
        // available animals
        if (option == displayDogList) {
            System.out.println(dogList);
        } else if (option == displayMonkeyList) {
            System.out.println(monkeyList);
        } else if (option == displayAllAnimals) {
            for (int i = 0; i < dogList.size(); i++) {
                if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved() == false) {
                    System.out.println(dogList.get(i));
                }
            }
            for (int i = 0; i < monkeyList.size(); i++) {
                if (monkeyList.get(i).getTrainingStatus().equals("in service")
                        && monkeyList.get(i).getReserved() == false) {
                    System.out.println(monkeyList.get(i));
                }
            }
        }

    }
}