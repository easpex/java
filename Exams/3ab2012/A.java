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
    System.out.println("num = " + num + " a.num = " + a.num);
return num == a.num * 2;
}
}