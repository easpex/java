public class D extends C
{
public void foo(C c)
{
System.out.println("dc");
}
public void foo(D d)
{
System.out.println("dd");
}
public int get() {
    return 1;
}

public static void main(String[] args) {
    C cd = new D();
    D dd = (D)cd;
    //dd.foo(dd);
    //dd.foo(cd);
    //cd.foo(dd);
    cd.foo(cd);
}
}