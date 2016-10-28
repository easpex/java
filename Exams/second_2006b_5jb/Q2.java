public class Q2 {
    public static int what(int [] vec)
{
int m = 0;
for (int i=0; i<vec.length; i++)
{
int c = 0;
int n =i;
do
{
n = find (vec, vec[n]+1);
c ++;
} while (n!= -1);
if (c > m)
m = c;
}
return m;
}
public static int find (int [] vec, int value)
{
for (int i=0; i< vec.length; i++)
if (vec[i] == value)
return i;
return -1;
}

public static void main(String[] args) {
    int[] a = {1,1,2,1,1,1};
    System.out.println(what(a));
}
}