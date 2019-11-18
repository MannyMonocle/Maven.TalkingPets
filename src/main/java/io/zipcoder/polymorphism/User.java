package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class User {
    ArrayList<Pet> pets = new ArrayList();
    Console console = new Console(System.in, System.out);


    public User(Integer numberOfPets){
        for(int i = 0; i <= numberOfPets; i++){
            pets.add(new Pet());
        }
    }

    public User(Integer numberOfPets, String[] names){
        for(int i = 0; i <= numberOfPets; i++){
            Integer petType = console.getInteger("What type of animal is " + names[i]);
            String nameChoice = names[i];
            addNewPet(petType,nameChoice);
        }
    }

    private boolean addNewPet(Integer type, String nameChoice){
        Pet newGuy;
        switch (type) {
            case 1 :
                newGuy = new Dog(nameChoice);
                pets.add(newGuy);
                return true;
            case 2 :
                newGuy = new Cat(nameChoice);
                pets.add(newGuy);
                return true;
            case 3 :
                newGuy = new Dragon(nameChoice);
                pets.add(newGuy);
                return true;
            default :
                return false;
        }
    }



}
