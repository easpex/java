public class Node
{
private int _number;
private Node _leftSon, _rightSon;
public Node (int number, Node left, Node right) {
_number = number;
_leftSon = left;
_rightSon = right;
}
public int getNumber() {return _number; }
public Node getLeftSon() {return _leftSon; }
public Node getRightSon() {return _rightSon; }

public static void postOrder(Node current) {
    if (current.getLeftSon() != null) 
    postOrder(current.getLeftSon());
    
    if (current.getRightSon() != null)
    postOrder(current.getRightSon()); 
    
    System.out.print(current.getNumber() + ","); 
}

public static int max(int a, int b) {
    return (a>b) ? a:b;
}

public static int max(int a, int b, int c) {
    return(max(a, max(b,c)));
}

public static int f (Node t)
{
if (t == null)
return 0;
return 1 + max (f (t.getLeftSon()), f (t.getRightSon()));
}

public static int g (Node t)
{
return (f (t.getLeftSon()) + f (t.getRightSon()));
}

public static int what (Node t)
{
if (t == null)
return -1;
if ((t.getLeftSon() == null ) && (t.getRightSon() == null))
return 0;
return max (g(t),
what (t.getLeftSon()),
what (t.getRightSon()));
}

public static void main(String[] args) {
    Node n60 = new Node(60, null, null);
    Node n45 = new Node(45, null, n60);
    Node n30 = new Node(30, n45, null);
    Node n50 = new Node(50, null, null);
    Node n15 = new Node(15, null, null);
    Node n25 = new Node(25, n15, null);
    Node n5 = new Node(5, n50, n25);
    Node n20 = new Node(20, n30, n5);
    Node n10 = new Node(10, null, null);
    Node n40 = new Node(40, n20, n10);
    
    postOrder(n40);
    System.out.println();
    System.out.println("f(n40) = " + f(n40) + " g(n40) = " + g(n40) + " what(n40) = " + what(n40));
}
}