package org.example.enums;

public enum Plan {
    BASIC("Temel", 150),
    SUPER("Süper", 220),
    DELUXE("Lüks", 350);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
