public class C extends B
{
public C(int i)
{
super(i);
}
public boolean equals (Object other)
{
return ((other!=null) &&
(other instanceof C) &&
(_i==((C) other)._i));
}
}