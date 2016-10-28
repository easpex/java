public class D extends C {
public D(int n)
{
super(n);
for (int i=0; i<n; i++)
new D(i);
}

public static int foo (int a, int b)
{
if (a>3)
return 2 + foo (b-1, a+1);
if (b<=4)
return 1 + foo (a-1, b+1);
return 0;
}

public static void main (String [] args) {
    C c = new C(3);
}
}