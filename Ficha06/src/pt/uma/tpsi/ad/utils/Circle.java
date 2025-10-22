package pt.uma.tpsi.ad.utils;


public class Circle extends Shape{
    protected double radius;

    public Circle(){
        super();
        this.radius = 0;
    }
    public Circle(Point position, double radius){
        super(position);
        this.radius = radius;
    }

    @Override
    public void setPosition(Point position) {
        super.setPosition(position);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Point getPosition() {
        return super.getPosition();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [Position=" + getPosition() + ", Radius=" + radius +
                ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
    }
}
