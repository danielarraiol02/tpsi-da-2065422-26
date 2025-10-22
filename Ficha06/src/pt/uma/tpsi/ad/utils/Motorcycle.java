package pt.uma.tpsi.ad.utils;

public class Motorcycle extends Vehicle {

    protected int nPassageiros;

    public Motorcycle(){
        super();
        nPassageiros = 0;
    }
    public Motorcycle (int year, String brand, String model, double price, String color, int nPassageiros){
        super(year, brand, model, price, color);
        this.nPassageiros = nPassageiros;
    }
}
