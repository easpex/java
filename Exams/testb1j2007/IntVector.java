public class IntVector
{
private int []_arr;
public IntVector(int size)
{
_arr= new int[size];
}

public void fill(int[] a) {
    for(int i = 0; i < a.length; i++) {
        this._arr[i] = a[i];
    }
}

public void print() {
    for(int i = 0; i < this._arr.length; i++) {
        System.out.print(this._arr[i] + "|");
    }
}

public void what()
{
int x = _arr[0];
int y = _arr[0];
for (int i=1; i<_arr.length; i++)
{
if (_arr[i] < x)
x = _arr[i];
else 
y = _arr[i];
}
System.out.println (x + " " + y);
}

public static void main(String[] args) {
    IntVector a = new IntVector(5);
    int[] b = {1,2,3,4,5};
    a.fill(b);
    a.print();
    System.out.println();
    a.what();
}
}