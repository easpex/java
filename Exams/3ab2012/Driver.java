public class Driver
{
public static void main(String[] args)
{
A y1 = new B(10);
B y2 = new B(10);
A z1 = new C(10);
C z2 = new C(10);
// System.out.println(y1.num == y2.num);
//System.out.println(y1.f(y2));
//System.out.println(z1.f(z2));
System.out.println(z2.f((C)y2));
}
}