package io.zipcoder.polymorphism;

public class Pet {
    String name;

    public Pet(){
        this.name = "";
    }

    public Pet(String petsName){
        name = petsName;
    }

    public String speak(){
        return "I'm sorry Jon";
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
