public class Driver
{
public static void main(String[] args)
{
        A y1 = new B(10);
        B y2 = new B(10);
        A z1 = new C(10);
        C z2 = new C(10);
        System.out.println(y1.f(y2));
        System.out.println(y2.f(y1)); //because y2 doesn't have an f() which can deal with A param, so it calls
        //parent's f()
        
        y1.stam(y2);// because y2 is of class B and class B overrides stam(A a)
        y2.stam(y1); //because y1 is of class A so stam(A a) from class B will called
        System.out.println(z1.f(y1));
        System.out.println(z2.f((C)y2)); //complilation error
}
}