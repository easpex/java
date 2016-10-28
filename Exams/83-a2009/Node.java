public class Node
{
private int _number;
private Node _leftSon, _rightSon;
public static int count;
public Node (int number, Node l, Node r) {
_number = number;
_leftSon = l;
_rightSon = r;
}
public int getNumber() {return _number; }
public Node getLeftSon() {
   // System.out.println(this.getNumber());
    return _leftSon; 
}
public Node getRightSon() {
    //System.out.println(this.getNumber());
    return _rightSon; 
}

public static int f( Node t)
{
if (t == null)
return 0;

return (1 + f(t.getLeftSon()) + f(t.getRightSon()));
}

public static void f2( Node t)
{
if (t == null) {
    System.out.println("0");
    return;
}


System.out.println(t.getNumber() + " | ");
f2(t.getLeftSon());
f2(t.getRightSon());
}

public static int what (Node t, int k)
{
if (t == null)
return -99999;
int n = 0;
if (t.getRightSon() != null)
n = f(t.getRightSon());
if ( n >= k)
return what(t.getRightSon(), k);
else if (n + 1 == k)
return t.getNumber();
else
return what (t.getLeftSon(), k-n-1);
}

public static void main(String[] args) {
    Node n9 = new Node(9, null, null);
    Node n10 = new Node(10, n9, null);
    Node n14 = new Node(14, null, null);
    Node n12 = new Node(12, n10, n14);
    Node n18 = new Node(18, null, n14);
    Node n20 = new Node(20, n18, null);
    Node n15 = new Node(12, n12, n20);
    Node n5 = new Node(5, null, null);
    Node n6 = new Node(6, n5, null);
    Node n7 = new Node(7, n6, null);
    Node n3 = new Node(3, null, null);
    Node n2 = new Node(2, null, n3);
    Node n4 = new Node(4, n2, n7);
    Node n8 = new Node(8, n4, n15);
    System.out.println(what(n8,10));
    //f2(n12);
}


}