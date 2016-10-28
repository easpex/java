public class B extends A
{
public B(int n)
{
super(n);
}
public boolean f(B b)
{
    System.out.println("I'm from B");
return num == b.num;
}

public void stam() {
    System.out.println("I'm from B");
}
}