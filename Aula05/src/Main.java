import pt.uma.tpsi.ad.utils.Point;
import pt.uma.tpsi.ad.utils.Triangle;
import pt.uma.tpsi.ad.utils.Rectangle;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 10);
        Point p3 = new Point(10,0);
        System.out.println(p1.distance(p2));
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1.getArea());
        Rectangle ret = new Rectangle(p3,10,10);
        System.out.println(ret.contains(p3));

        }
    }
