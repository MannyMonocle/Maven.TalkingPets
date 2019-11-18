package io.zipcoder.polymorphism;

public class Cat extends Pet{

    public Cat(String petsName) {
        super(petsName);
    }

    public Cat() {
    }

    @Override
    public String speak() {
        return "purrr";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
