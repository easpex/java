public class Second extends First
{
private int _num3 = 0;
public Second(int num)
{
super (num);
_num3 = num;
System.out.println ("Second constructor1");
}
public Second (int num1, int num2, int num3)
{
super (num1, num2);
_num3 = num3;
System.out.println ("Second constructor2");
}
public int sum ()
{
return super.sum() + _num3;
}
public void setNum3 (int num)
{
_num3 = num;
}

public static void main(String[] args) {
    First f1 = new First (10);
    System.out.println ("sum1 = " + f1.sum());
    System.out.println ("count = " + First.getCount());
    First f3 = new First (10, 20);
    System.out.println ("count = " + f3.getCount());
    Second s1 = new Second (1);
    First f4 = new Second (2);
    System.out.println ("count = " + f4.getCount());
    f3 = s1;
    System.out.println ("sum = " + f3.sum());
    s1.setNum3 (2);
    System.out.println ("sum = " + s1.sum());
System.out.println ("sum = " + s1.sum());
}
}