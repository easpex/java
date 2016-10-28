public class B extends A
{
public B() {
super(3);
}
public B(int x) {
super.f(x);
f(x);
}
public void f(int x)
{
_x -= x;
super.f(x);
}

public static void main(String[] args) {
    A[] arr = new A[3];
arr[0] = new B();
arr[1] = new A();
arr[2] = new B(5);
System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

for(int i=0; i<arr.length; i++)
{
arr[i].f(2);
System.out.print(arr[i] + " ");
}
System.out.print("\n");
int k=0;
for(int i = 0; i<arr.length; i++)
if(arr[i] instanceof B)
k++;
k = arr.length - k;
System.out.print(k);
}
}