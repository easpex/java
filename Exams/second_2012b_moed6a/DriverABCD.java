public class DriverABCD {
    public static void main(String[] args) {
        A a = new A(1);
        B b = new B(1);
        C c = new C(1);
        D d = new D(1);
        B b1 = new D(1);
        Object c1 = new C(1);
        Object d1 = new D(1);
        //a = c;
        //b = a;
        //c = (C)b1;
        //System.out.println (b1.equals(b));
        //System.out.println (c1.equals(c));
        //System.out.println (d1.equals(d));
    }
}