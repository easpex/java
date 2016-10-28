public class RecursionQuestion {
public static int max (int a, int b) {
if(a < b)
return b;
else
return a;
}
public static int differ (int a, int b) {
    return(Math.abs(a-b));
}
public static int secret1 (int[] a, int i, int j)
//Assuming i ≤ j < a.length
{
if (i==j)
return 0;
return (max (differ(a[i], a[j]), secret1(a, i+1, j)));
}
public static int secret2 (int[] a, int i, int j)
//Assuming i ≤ j < a.length
{
if (i==j)
return 0;
return (max (differ(a[i], a[j]), secret2(a, i, j-1)));
}
public static int secret3 (int[] a, int k)
//Assuming k < a.length
{
return (max (secret1(a, 0, k),
secret2(a, k, a.length-1)));
}
public static int secret4 (int[] a)
{
int m = secret3(a, 0);
for (int i= 1; i<a.length; i++)
{
int t = secret3 (a, i);
if (t > m)
m = t;
}
return m;
}

public static void main(String[] args) {
    int[] b = {4,3,7,6,10};
    System.out.println(secret4(b));
    
}
}