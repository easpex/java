public class B extends A
{
public void f()
{
System.out.println (" B.f");
}
public void g()
{
System.out.println (" B.g");
}
public void superG()
{
super.g();
}

public static void main (String [] args)
{
B b = new B();
A x = new B();
((A)b).g();
}
}