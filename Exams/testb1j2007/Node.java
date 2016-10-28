public class Node
{
private int _number;
private Node _leftSon, _rightSon, _father;
public Node (int number, Node l, Node r, Node f)
{
_number = number;
_leftSon = l;
_rightSon = r;
_father = f;
}
public int getNumber()
{return _number; }
public Node getLeftSon()
{return _leftSon; }
public Node getRightSon()
{return _rightSon; }
public Node getFather()
{return _father; }
public void setF(Node n) {
    this._father = n;
}

public static Node f(Node root)
{
if (root.getLeftSon() == null)
return root;
return f (root.getLeftSon());
}

public static Node g (Node node)
{
if (node.getFather() == null)
return null;
if (node.getFather().getLeftSon() == node)
return node.getFather();
return g(node.getFather());
}

public static Node what (Node root)
{
if (root == null)
return null;
if (root.getRightSon() != null)
return f (root.getRightSon());
return g (root);
}

public static void main(String[] args) {
    
    Node n8 = new Node(8, null, null, null);
    Node n7 = new Node(7, null, n8, null);
    Node n10 = new Node(10, n7, null, null);
    Node n25 = new Node(25, null, null, null);
    Node n34 = new Node(34, n25, null, null);
    Node n15 = new Node(15, n10, n34, null);
    n8.setF(n7);
    n7.setF(n10);
    n10.setF(n15);
    n25.setF(n34);
    n34.setF(n15);
    System.out.println(f(n15).getNumber());
    System.out.println(g(n8).getNumber());
    System.out.println(what(n10).getNumber());
}
}