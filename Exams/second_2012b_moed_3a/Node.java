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
public static boolean f (Node t)
{
if (t == null)
return true;
if (t.getLeftSon() == null && t.getRightSon() == null)
return true;
if (t.getLeftSon() == null)
return ((t.getNumber()==t.getRightSon().getNumber()) &&
f(t.getRightSon()));
if (t.getRightSon() == null)
return ((t.getNumber()==t.getLeftSon().getNumber()) &&
f(t.getLeftSon()));
return (((t.getNumber()== t.getRightSon().getNumber()) &&
f(t.getRightSon()))
||
((t.getNumber()== t.getLeftSon().getNumber()) &&
f(t.getLeftSon())));
}

public static void printTreePostOrder (Node current) {
        if (current.getLeftSon() != null)
        printTreePostOrder(current.getLeftSon());
        if (current.getRightSon() != null)
        printTreePostOrder(current.getRightSon());
        System.out.print(current.getNumber() + ","); 
    }

public static void main(String[] args) {
    Node n4 = new Node(4, null, null);
    Node n44 = new Node(4, null, n4);
        Node n5 = new Node(5, null, null);
    Node n6 = new Node(6, n5, null);
    Node n8 = new Node(8, n6, null);
    Node n444 = new Node(4, n44, n8);
    
    
    Node n88 = new Node(8, null, null);
    Node n888 = new Node(8, n88, null);
    Node n14 = new Node(14, null, null);
    Node n55 = new Node(5, n888, n14);
    Node n18 = new Node(18, null, null);
    Node n20 = new Node(20, n18, null);
    Node n8888 = new Node(8, n55, n20);
    Node n88888 = new Node(8, n444, n8888);
    printTreePostOrder(n88888);
    
    
    
    System.out.println(f(n55));
}
}