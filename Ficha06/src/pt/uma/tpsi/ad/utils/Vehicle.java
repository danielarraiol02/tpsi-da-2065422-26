package pt.uma.tpsi.ad.utils;

public class Vehicle {

    protected int year;
    protected String brand;
    protected String model;
    protected double price;
    protected String color;

    public Vehicle(){
        this.year = 0;
        this.brand = "";
        this.model = "";
        this.price = 0;
        this.color = "";
    }
    public Vehicle (int year, String brand, String model, double price, String color){
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "(" + getBrand() + " " + getModel() + " " + getYear() + " " + getColor() + " " + getPrice() + "€" + ")";
    }

}
