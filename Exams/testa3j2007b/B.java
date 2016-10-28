public class B extends A {
void g() {

f();
}

public static int calc (int n)
{
if (n <= 2)
return 1;
return calc(n/2) * (int) Math.log(n);
}

public static boolean isSubstring(String str, String target)
{   
    if (target.length() == 0)
        return false;

    if (str.equals(target))
        return true;

    else     
        return (isSubstring(str, target.substring(0,target.length()-1)) ||
        isSubstring(str, target.substring(1)));            
}
}