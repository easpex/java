public class Main
{
public static void main(String[] args)
{
int [] arr = {3, 7};
System.out.print (arr[0] + "\t");
g(arr);
System.out.print (arr[1] + "\t");
}
public static void g(int [] arr)
{
arr[0] = arr[0] + arr[1];
arr[1] = arr[0] - arr[1];
arr[0] = arr[0] - arr[1];
System.out.print (arr[0] + "\t");
System.out.print (arr[1] + "\t");
}

public static int gg(int a, int b)
{
if(a == 0)
{
return b;
}
return gg(a-1, b+1);
}
}