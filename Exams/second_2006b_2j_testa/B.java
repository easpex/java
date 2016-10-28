public class B extends A {
private String str;
public B()
{
System.out.println ("I'm B's constructor");
}

public static void main(String[] args) {
    A a1 = new B();
}
}