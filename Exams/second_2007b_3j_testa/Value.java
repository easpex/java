public class Value
{
private int _i;
public Value(int i)
{
_i = i;
}
public int getI ()
{
return _i;
}
public void setI (int i)
{
_i = i;
}
public static void main(String[] args)
{
Value[] arr = new Value[4];
for(int i=0; i<arr.length; i++)
arr[i] = new Value(i);
Value t = arr[0];
arr[0] = arr[3];
arr[3] = t;
t.setI(arr[0].getI());
for(int i=0; i<arr.length; i++)
System.out.print(arr[i].getI()+ " ");
}
}