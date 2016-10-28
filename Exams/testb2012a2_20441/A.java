public class A
{
private int _x;
public A(){
_x = 5;
}
public A(int x) {
_x = x;
}
public A(int x, int y) {
this(x + y);
}
public String toString() {
return _x + " ";
}

public static void main(String[] args) {
    //A a = new A(1,2);
    //System.out.println(a);
}
}