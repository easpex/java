public class IntVector
{
private int []_arr;
/**
* Constructor for objects of class IntVector
*/
public IntVector(int[] arr)
{
_arr= new int[arr.length];
for(int i = 0; i < arr.length; i++) {
    _arr[i] = arr[i];
}
}

public int what ()
{
int m =_arr[0];
for (int i=0; i<_arr.length; i++)
for (int j=i; j<_arr.length; j++)
{
int s=_arr[i];
for (int k=i+1; k<=j; k++)
s += _arr[k];
if (s > m)
m=s;
}
return m;
}

public String toString() {
    String s = "";
    for(int i = 0; i < this._arr.length; i++) {
        s+= this._arr[i] + " ";
    }
    return s;
}

public static void main(String[] args) {
    int[] arr = {100,2,3,4};
    IntVector b = new IntVector(arr);
    System.out.println(b);
    System.out.println(b.what());
}
}