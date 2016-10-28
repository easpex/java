public class B extends A
{
private int _y ;
public B (int x) {
super(x, x);
_y = x;
}
public B(int x, int y) {
this(x * y);
}
public B(String s) {
System.out.println (s + _y);
}
public String toString() {
return "BtoString" + _y ;
}
public static void main(String[] args) {
A c1 = new B("something");
System.out.println(c1);
}
}