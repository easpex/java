public class A
{
protected int _x;
public A(){
_x = 1;
}
public A(int x) {
_x = x;
}
public void f(int x) {
_x += x;
}
public String toString() {
return "" + _x;
}
}