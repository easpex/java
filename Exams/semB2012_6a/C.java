public class C extends B
{
public C(int i)
{
super(i);
}
public boolean equals (Object other)
{
    System.out.println("method from C");
return ((other!=null) &&
(other instanceof C) &&
(_i==((C) other)._i));
}
}