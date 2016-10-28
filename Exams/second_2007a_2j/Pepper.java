public class Pepper
{
private int _weight;
public Pepper(int w)
{
_weight = w;
}
public int getWeight()
{
return _weight;
}
public boolean equals (Object other)
{
return ((other!=null) && (other instanceof Pepper) &&
(_weight == ((Pepper) other)._weight));
}

public static void main (String []args)
{
Tomato y1 = new Tomato (10);
Object y2 = new Tomato (10);
Pepper z1 = new Pepper (10);
Object z2 = new Pepper (10);
System.out.println (z1.equals((Tomato)y2));
}
}