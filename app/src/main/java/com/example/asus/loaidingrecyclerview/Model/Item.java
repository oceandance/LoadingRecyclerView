package com.example.asus.loaidingrecyclerview.Model;


public class Item {
    private String name;
    private int lenght;

    public Item(String name, int lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}