package io.zipcoder.polymorphism;

public class Dragon extends Pet{
    public Dragon(String petsName) {
        super(petsName);
    }

    public Dragon() {
    }

    @Override
    public String speak() {
        return "bring me gold";
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
