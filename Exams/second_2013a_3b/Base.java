public class Base
{
private int _num1, _num2;
private static int dif = 0;
public Base(int num)
{
this(num, num+1);
System.out.println ("Base constructor1");
}
public Base(int num1, int num2)
{
System.out.println ("Base constructor2");
_num1 = num1;
_num2 = num2;
dif = num2 - num1;
}
public int sum()
{
return _num1+_num2;
}
public static int getDif()
{
return dif;
}
}
