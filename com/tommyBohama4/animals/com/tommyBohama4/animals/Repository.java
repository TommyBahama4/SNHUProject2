package com.tommyBohama4.animals;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Dog> dogList;
    private List<Monkey> monkeyList;

    public Repository() {
        this.dogList = new ArrayList<Dog>();
        this.monkeyList = new ArrayList<Monkey>();
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public List<Monkey> getMonkeyList() {
        return monkeyList;
    }
}
