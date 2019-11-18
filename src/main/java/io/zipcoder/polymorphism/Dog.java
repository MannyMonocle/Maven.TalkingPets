package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(String petsName) {
        super(petsName);
    }

    public Dog() {
    }

    @Override
    public String speak() {
        return "woofizzle";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
