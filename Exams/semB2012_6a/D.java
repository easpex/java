public class D extends B
{
public D(int i)
{
super(i+1);
}
public boolean equals (D other)
{
System.out.println("method from D");
return ((other!=null) &&
 (_i==((D) other)._i));


}
}