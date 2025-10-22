package pt.uma.tpsi.ad.utils;


public abstract class Shape {
    protected Point position;

    public Shape(){
        this.position = new Point();
    }
    public Shape(Point point){
        this.position = point;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    public Point getPosition(){
        return this.position;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
