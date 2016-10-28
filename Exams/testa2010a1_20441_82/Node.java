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

public static int max (int a, int b, int c) {
    int[] arr = {a,b,c};
    int max = arr[0];
    for(int i = 0; i < arr.length - 1; i++) {
        if(max < arr[i + 1])
        max = arr[i + 1];
    }
    
    return max;
}

public static int max (int a, int b) {
    if(a < b)
    return b;
    else
    return a;
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
    System.out.println(f(n20));
    System.out.println(g(n20));
    System.out.println(what(n20));
}
}