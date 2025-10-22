package pt.uma.tpsi.ad.utils;

public class Car extends Vehicle {

    protected int nPortas;

    public Car(){
        super();
        nPortas = 0;
    }

    public Car (int year, String brand, String model, double price, String color, int nPortas){
        super(year, brand, model, price, color);
        this.nPortas = nPortas;
    }


}
