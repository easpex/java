public class Driver
{
public static void main (String [] args)
{
    Base b1 = new Base(10);
    Base b2 = new Base(4,7);
    System.out.println ("sum1 = " + b1.sum());
    System.out.println ("dif1 = " + b1.getDif());
    System.out.println ("sum2 = " + b2.sum());
    System.out.println ("dif2 = " + b2.getDif());
    Base bs = new Base(10, 20);
    SubBase sub = new SubBase (1, 2, 3);
    //sub = bs;
    System.out.println ("sub_sum = " + sub.sum());
    bs = sub;
    System.out.println ("bs_sum = " + bs.sum());
    System.out.println ("dif = " + sub.getDif());
}

}