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
public void setNumber(int n) {this._number = n;}
public static IntList what (Node root, int i)
{
IntList level = new IntList();
if (root != null)
what (level, i, root);
return level;
}

public static void change(Node old) {
    Node n100 = new Node(100, null, null);
    old.setNumber(100);
}

private static void what (IntList level, int i, Node t)
{
if (t != null)
{
if (i>0)
{
what (level, i-1, t.getRightSon());
what (level, i-1, t.getLeftSon());
}
else
level.addHead(t.getNumber());
}
}

public static void main(String[] args) {
    Node n8 = new Node(8, null, null);
    Node n5 = new Node(5, null, n8);
    Node n1 = new Node(1, null, null);
    Node n6 = new Node(6, n1, null);
    Node n7 = new Node(7, n6, null);
    Node n4 = new Node(4, n5, n7);
    
    Node n0 = new Node(0, null, null);
    Node n77 = new Node(7, n0, null);
    Node n2 = new Node(2, null, null);
    Node n11 = new Node(1, null, n2);
    Node n3 = new Node(3, n7, n11);
    Node n9 = new Node(9, null, null);
    
    Node n66 = new Node(6, n9, null);
    Node n22 = new Node(2, n3, n66);
    Node n88 = new Node(8, n4, n22);
    IntList list = what(n88, 3);
    System.out.println (list);
    
    Node test = new Node(555, null, null);
    change(test);
    System.out.println(test.getNumber());
}













}