public class A
{
protected int num;
public A(int n)
{
num = n;
}
public int getNum()
{
return num;
}
public boolean f(A a)
{
    System.out.println("I'm from A");
return num == a.num * 2;
}

public void stam() {
    System.out.println("I'm from A");
}
}