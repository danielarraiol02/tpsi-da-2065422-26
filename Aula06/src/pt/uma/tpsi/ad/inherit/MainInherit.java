package pt.uma.tpsi.ad.inherit;

public class MainInherit {
    public static void main(String[] args) {
        Base b0 = new Base();
        Base b1 = new Base(10);

        Derived d0 = new Derived();
        Derived d1 = new Derived(10, 2);

    }
}
