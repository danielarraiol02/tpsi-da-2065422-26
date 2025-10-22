package pt.uma.tpsi.ad.utils;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double getWidth(){
        return this.b.distance(this.c);
    }

    public double getHeight(){
        return this.a.distance(this.b);
    }

    public double getArea(){
        return (this.getHeight() * this.getWidth()) / 2;
    }
}
