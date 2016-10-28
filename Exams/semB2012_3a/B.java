public class B extends A
{

public B(int n)
{
super(n);

}
public boolean f(B b)
{
return num == b.num;
}

public void stam(B b) {
    System.out.println("method from class B");
}
public void stam(A a) {
    System.out.println("method from class B");
}
}