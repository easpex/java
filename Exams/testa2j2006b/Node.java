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

public static int f(Node n)
{
if (n == null)
return 0;
return (n.getNumber() +
f(n.getLeftSon()) + f(n.getRightSon()));
}

public static boolean mystery (Node t)
{
int y;
if (t == null)
return true;
y = t.getNumber();
return (((f(t) - y) <= y) &&
(mystery (t.getLeftSon())) &&
(mystery (t.getRightSon())));
}

public static void main(String[] args) {
    Node n1 = new Node(1, null, null);
    Node n5 = new Node(5, n1, null);
    Node n4 = new Node(4,  n5, null);
    Node n3 = new Node(3, null, null);
    Node n12 = new Node(12, null, n3);
    Node n32 = new Node(32, n12, n4);
    
    System.out.println(f(n32));
    System.out.println(mystery(n32));
}
}