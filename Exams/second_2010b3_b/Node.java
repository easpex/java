public class Node
{
private int _number;
private Node _leftSon, _rightSon;
public Node (int number, Node l, Node r) {
_number = number;
_leftSon = l;
_rightSon = r;
}
public int getNumber() {return _number; }
public Node getLeftSon() {return _leftSon; }
public Node getRightSon() {return _rightSon; }

public static int min (int a, int b) { 
    return a < b ? a : b;
}

public static boolean isLeaf (Node t) {
    return t.getLeftSon() == null && t.getRightSon() == null;
}

public static int f (Node t)
{
if (t == null)
return 0;
return 1 + min (f (t.getLeftSon()),f (t.getRightSon()));
}

public static Node what(Node t)
{
    return what (t, f(t));
}
public static Node what (Node t, int num)
{
if ((t == null) || ((num == 1) && (isLeaf(t))))
return t;
Node temp = what(t.getLeftSon(), num-1);
if (temp != null)
return temp;
return what(t.getRightSon(), num-1);
}

  public static void main(String[] args) {
    Node n45 = new Node(45, null, null);
    Node n50 = new Node(50, null, null);
    Node n25 = new Node(25, null, null);
    Node n5 = new Node(5, n50, n25);
    Node n30 = new Node(30, n45, null);
    Node n20 = new Node(20, n30, n5);
    Node n10 = new Node(10, null, null);
    Node n40 = new Node(40, n20, n10);
 
    System.out.println(f(n40));
    System.out.println(what(n20).getNumber());
  }
}