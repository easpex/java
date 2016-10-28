public class IntVector
{
private int []_arr;
/**
* Constructor for objects of class IntVector
*/
public IntVector(int size)
{
_arr= new int[size];
}


public static int what(int[] a)
{
int count = 0;
int I, J;
for(int i  = 0; i < a.length; i++) {
    boolean u = true;
    for(int j = i + 1; j < a.length; j++) {  
        I = i;
        J = j;
        if(a[i] == a[j])
        u = false;
    }
    if(u)
    count++;
}
return count;
}

public static int someMethod1 (int[] a) {
int temp = 0;
for (int i=0; i < a.length; i++)
for (int j=i+1; j < a.length; j++)
if (Math.abs(a[j]-a[i]) > temp)
temp = Math.abs(a[j]-a[i]);
return temp;
}
}