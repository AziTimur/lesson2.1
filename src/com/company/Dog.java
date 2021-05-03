package com.company;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog() {

    }

    public Dog(String name, String breed, Shelter shelter, Color color) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);

    }

    public Dog(String name, String breed, Shelter shelter, Color color, String[] commands) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
        this.commands = commands;
    }
    public void makeVoice(String voice,int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
  public void makeVoice(int number,String voice){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }
  public void makeVoice(String voice) {
      System.out.println(voice);
  }

  public  String getInfo(){
        return super.getInfo()+ "\n Name:"+name+"\n Breed:"+ breed+"\nCommands:"+getCommands();
  }
}
