public class B extends A
{
public B() {
System.out.println ("B");
}
public void arik () {
System.out.println("Arik_B");
}
public void yosef () {
System.out.println ("Yosef");
}
public void superYosef(){
super.yosef();
}

public static void main (String [] args)
{
    A a = (A) new B();
    A aa = new A();
    A ab = new B();
    //B ba = new A();
    B bb = new B();
    //aa.yosef();
    //ab.yosef();
    //bb.yosef();
    //((A) aa).yosef();
    //((A) bb).yosef();
    //((A) bb).superYosef();
    //((B) aa).superYosef();
    ((B) ab).superYosef();
}
}