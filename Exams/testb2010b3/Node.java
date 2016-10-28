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

public static int f (Node t)
{
if (t == null)
return 0;
return 1 + min (f (t.getLeftSon()),f (t.getRightSon()));
}

public static boolean isLeaf(Node n) {
    return (n.getLeftSon() == null && n.getRightSon() == null);
}

public static int min(int a, int b) {
    if(a < b) {
        return a;
    } else {
        return b;
    }
}

public static Node what(Node t)
{
return what (t, f(t));
}
private static Node what (Node t, int num)
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
    Node n19 = new Node(19, null, null);
    Node n10 = new Node(10, null, n19);
    Node n30 = new Node(30, n45, null);
    Node n5 = new Node(5, n50, n25);
    Node n20 = new Node(20, n30, n5);
    Node n40 = new Node(40, n20, n10);
    
    
    Node n12 = new Node(12, null,  null);
    Node n13 = new Node(13, null,  null);
    Node n11 = new Node(11, n12,  n13);
    //System.out.println(what(n40).getNumber());
    //System.out.println(isLeaf(n45));
    String s = "abcd";
    System.out.println(s.substring(0,1));
}
}