public class Node
{
private int _number;
private Node _leftSon, _rightSon;
public Node (int number, Node l, Node r)
{
_number = number;
_leftSon = l;
_rightSon = r;
}
public int getNumber()
{return _number; }
public Node getLeftSon()
{return _leftSon; }
public Node getRightSon()
{return _rightSon; }
public static boolean f(Node t, int num)
{
if(t==null)
return true;
return t.getNumber() > num &&
f(t.getLeftSon(), t.getNumber()) &&
f(t.getRightSon(), t.getNumber());
}

public static void main(String[] args) {
    System.out.println(Integer.MIN_VALUE);
    Node n19 = new Node(19, null, null);
    Node n14 = new Node(14, null, n19);
    Node n13 = new Node(13, null, null);
    Node n12 = new Node(12, n13, n14);
    Node n122 = new Node(12, null, null);
    Node n11 = new Node(11, n12, n122);
    Node n25 = new Node(25, null, null);
    Node n15 = new Node(15, n25, null);
    Node n1222 = new Node(12, null, n15);
    Node n8 = new Node(8, n11, n1222);
    System.out.println(f(n8, Integer.MIN_VALUE));
    
}
}