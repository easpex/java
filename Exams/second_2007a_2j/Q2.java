public class Q2 {
    public static int what(int[] arr)
{
int c = 1;
for (int i=1; i<arr.length; i++)
{
boolean u = true;
for (int j=0; (j<i) && u; j++)
{
if (arr[i] == arr[j])
u = false;
}
if (u)
c++;
}
return c;
}

public static void main(String[] args) {
    int[] a = {4,2,3,4};
    System.out.println(what(a));
}
}