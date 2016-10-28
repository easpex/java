public class IntVector
{
private int []_arr;
/**
* Constructor for objects of class IntVector
*/
public IntVector(int[] arr)
{
_arr= arr;

}

public void print() {
    for(int i = 0; i < _arr.length; i++) {
        System.out.print(_arr[i] + " ");
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

public int what2 ()
{
int m =_arr[0];
for (int i=0; i<_arr.length; i++)

{
int s=_arr[i];
for (int k=i+1; k<=i; k++)
s += _arr[k];
if (s > m)
m=s;
}
return m;
}

public int what3() {
    int leftSum = 0, rightSum = 0, leftMax = 0, rightMax = 0;
    for(int i = 0; i < _arr.length; i++) {
        leftSum += this._arr[i];
        if(leftSum > leftMax) {
            leftMax = leftSum;
        }
        
        rightSum += this._arr[_arr.length - 1 - i];
        if(rightSum > rightMax) {
            rightMax = rightSum;
        }
    }
    
    return rightMax > leftMax ? rightMax : leftMax;
}

public static void main(String[] args) {
    int[] b = {202,2,-10,11,-1,-111};
    IntVector a = new IntVector(b);
    a.print();
    System.out.println();
    System.out.println(a.what());
    System.out.println();
    System.out.println(a.what3());
}
}