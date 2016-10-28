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

public static int f (int a, int b)
{
if (a<b)
return a;
return b;
}
public static int f (int a, int b, int c)
{
return f (a, f(b, c));
}

private static int what (Node t, int m)
{
if (t == null)
return 0;
if ((t.getLeftSon()== null) && (t.getRightSon()== null))
return m;
if (t.getLeftSon() == null)
return f (m, what(t.getRightSon(),
Math.abs(t.getNumber()-t.getRightSon().getNumber())));
if (t.getRightSon() == null)
return f (m, what(t.getLeftSon(),
Math.abs(t.getNumber()-t.getLeftSon().getNumber())));
return f(m, what(t.getLeftSon(),
Math.abs(t.getNumber()-t.getLeftSon().getNumber())),
what(t.getRightSon(),
Math.abs(t.getNumber()-t.getRightSon().getNumber())));
}

public static void main(String[] args) {
    System.out.println(f(5,4,1));
    
    Node n45 = new Node(45, null, null);
    Node n30 = new Node(30, n45, null);
    Node n50 = new Node(50, null, null);
    Node n25 = new Node(25, null, null);
    Node n5 = new Node(5, n50, n25);
    Node n20 = new Node(20, n30, n5);
    Node n10 = new Node(10, null, null);
    Node n40 = new Node(40, n20, n10);
    System.out.println(what(n40,Integer.MAX_VALUE));
}
}