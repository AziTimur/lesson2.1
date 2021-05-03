package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog=new Dog();
        dog.setName("Juchka");
        dog.setBreed("laika");
        dog.setCommands(new String[]{"run","voice"});
        dog.setColor(Color.BLACK);
        Shelter shelter=new Shelter("Shelter1","4mkr");
        dog.setShelter(shelter);

        dog.makeVoice("gav",2);
        System.out.println(dog.getInfo());
    }
}
