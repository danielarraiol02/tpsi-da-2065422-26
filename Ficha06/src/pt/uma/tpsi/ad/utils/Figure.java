package pt.uma.tpsi.ad.utils;

import java.util.ArrayList;

public class Figure  {

    protected ArrayList<Shape> shapes;

    public Figure(){
        shapes = new ArrayList<Shape>();
    }
    public Figure(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
}
