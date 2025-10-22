package pt.uma.tpsi.ad.utils;

public class Rectangle {

    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        this.topLeftPoint = new Point(0, 0);
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }


    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (height + width);
    }

    public boolean contains(Point p) {
        double x = p.getX();
        double y = p.getY();

        double left = topLeftPoint.getX();
        double right = topLeftPoint.getX() + width;
        double top = topLeftPoint.getY();
        double bottom = topLeftPoint.getY() - height;

        return (x >= left && x <= right && y <= top && y >= bottom);
    }
}
