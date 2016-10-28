public class Q2 {
    public static void what(int[] _arr)
{
int x = _arr[0];
int y = _arr[0];
for (int i=1; i<_arr.length; i++)
{
if (_arr[i] < x)
x = _arr[i];
else if (_arr[i] > y)
y = _arr[i];
}
System.out.println (x + " " + y);
}

public static void main(String[] args) {
    int[] a = {5,7,8,9,1};
    what(a);
}
}