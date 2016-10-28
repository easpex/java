public class Node
{
private int _number;
private Node _leftSon, _rightSon;
public Node (int number, Node left, Node right)
{
_number = number;
_leftSon = left;
_rightSon = right;
}
public int getNumber()
{return _number; }
public Node getLeftSon()
{return _leftSon; }
public Node getRightSon()
{return _rightSon; }
public static int f (int a, int b)
{
return (a>b) ? a:b;
}

public static int what (Node root)
{
if (root == null)
return -1;
return (f (what (root.getLeftSon()),
what (root.getRightSon())) +1);
}

public static void main(String[] args) {
    Node n3 = new Node(3, null, null);
    Node n12 = new Node(12, null, n3);
    Node n1 = new Node(1, null, null);
    Node n5 = new Node(5, n1, null);
    Node n4 = new Node(4, n5, null);
    Node n32 = new Node(32, n12, n4);
    
    System.out.println(what(n32));
}
}