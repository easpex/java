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
public int getNumber() {
return _number;
}

public Node getLeftSon() {
return _leftSon;
}
public Node getRightSon() {
return _rightSon;
}
public void setNumber(int number) {
_number = number;
}
public void setLeftSon(Node node) {
_leftSon = node;
}

public void setRightSon(Node node) {
_rightSon = node;
}

public static void what (Node n, int value)
{
if (n == null)
return;
else
{
n.setNumber( value);
what (n.getLeftSon(), value+1);
what (n.getRightSon(), value+1);
}
}

public static void main(String[] args) {
    Node n1 = new Node(1, null, null);
    Node n5 = new Node(5, n1, null);
    Node n4 = new Node(4, n5, null);
    Node n3 = new Node(3, null, null);
    Node n12 = new Node(12, null, n3);
    Node n32 = new Node(32, n12, n4);
    what(n32, 0);
    System.out.println(n32.getNumber()+" "+n12.getNumber()+" "+n3.getNumber()+" "+n4.getNumber()+" "+n5.getNumber()+" "+n1.getNumber());
    //n32.getNumber(),n12.getNumber(),n3.getNumber(),n4.getNumber(),n5.getNumber(),n1.getNumber()
}
}