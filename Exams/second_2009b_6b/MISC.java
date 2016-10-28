public class MISC {
    public static boolean g (int n, int x)
{
if (n> x*x)
return false;
if (n< x*x)
return g(n, x-1);
return true;
}
}