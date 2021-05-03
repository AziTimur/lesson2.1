package com.company;

public class Shelter {
    private String name;
    private String adress;

    public Shelter(String name, String adress) {
        this.adress = adress;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
