package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        if(giro < 0){
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if(giro < 0){
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index < 0){
            System.out.println("Index must be bigger than 0");
        } else if(developerNames[index] != null){
            System.out.println("Index already used.");
        } else {
            developerNames[index] = name;
        }
    }

    public String toString(){
        return "Id: " + this.id + ". Name: " + this.name + ". Giro: " + this.giro + ". Developer Names: " + String.join(", this.developerNames");
    }
}
