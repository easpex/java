public class Question4a
{
public static void main (String []args)
{
Tomato y1 = new Tomato (10);
Object y2 = new Tomato (10);
Pepper z1 = new Pepper (10);
Object z2 = new Pepper (10);
//System.out.println (y1._weight);
//System.out.println (((Pepper)y2).getWeight());
//System.out.println (y2.equals(y1));
//System.out.println (z1.equals(z2));
System.out.println (z1.equals((Tomato)y2));
}
}