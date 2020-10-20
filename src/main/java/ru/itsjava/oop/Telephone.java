package ru.itsjava.oop;

public class Telephone {
    private final String brand;
    private boolean isHommie;

    public Telephone(String brand){
        this.brand = brand;
    }
    public Telephone(String brand, boolean isHommie){
        this.brand = brand;
        this.isHommie = isHommie;
    }

    public String toString(){
       return "{" + brand + " , " + isHommie + "}";
    }

}
