public class Node { 
    private int _number;
    private Node _leftSon, _rightSon; 
    
    public Node (int number, Node left, Node right) {
        _number = number;
        _leftSon = left;
        _rightSon = right;
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
    
    public static int f( Node t)
{
if (t == null)
return 0;
return (1 + f(t.getLeftSon()) + f(t.getRightSon()));
}
    
    public static void printTreePostOrder (Node current) {
        if (current.getLeftSon() != null)
        printTreePostOrder(current.getLeftSon());
        if (current.getRightSon() != null)
        printTreePostOrder(current.getRightSon());
        System.out.print(current.getNumber() + ","); 
    }
    
    public static int what (Node t, int k)
{
if (t == null)
return -99999;
int n = 0;
if (t.getRightSon() != null)
n = f(t.getRightSon());
if ( n >= k)
return what(t.getRightSon(), k);
else if (n + 1 == k)
return t.getNumber();
else
return what (t.getLeftSon(), k-n-1);
}
    
    public static void main(String[] args) {
        Node n5 = new Node(5, null, null);
        Node n6 = new Node(6, n5, null);
        Node n7 = new Node(7, n6, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, null, n3);
        Node n4 = new Node(4, n2, n7);
        Node n9 = new Node(9, null, null);
        Node n10 = new Node(10, n9, null);
        Node n14 = new Node(14, null, null);
        Node n12 = new Node(12, n10, n14);
        Node n18 = new Node(18, null, null);
        Node n20 = new Node(20, n18, null);
        Node n15 = new Node(15, n12, n20);
        Node n8 = new Node(8, n4, n15);
        printTreePostOrder(n8);
        System.out.println();
        System.out.println(f(n8));
        System.out.println();
        System.out.println(what(n8, 3));
    }
}