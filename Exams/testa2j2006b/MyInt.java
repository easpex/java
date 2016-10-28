public class MyInt
{
private int _v;
public MyInt(int v) {
_v = v;
}
public void set(int v) {
_v = v;
}
public int get() {
return _v;
}
public static void doIt1(MyInt x, int v) {
x.set(v);
}
public static void doIt2(int x, int v) {
x = v;
}
}