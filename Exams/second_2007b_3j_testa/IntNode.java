public class IntNode
{
private int _data;
private IntNode _next;
public IntNode (int data, IntNode n)
{
_data = data;
_next = n;
}
public static boolean what (IntNode node)
{
IntNode t = node;
IntNode h = node._next;
int sum = 0;
boolean ok = false;
if (t != null)
sum = t._data;
while (h != null)
{
if (sum != h._data)
return false;
sum += h._data;
t = h;
h = h._next;
}
return true;
}

public static void g(String str, int i, int j)
{
if(i < str.length())
{
g(str, i+1, -1*j);
if(j==1)
System.out.print(str.charAt(i));
}
}



public static void main(String[] args) {
    IntNode n1 = new IntNode(3, new IntNode(3, new IntNode(6, new IntNode(12, new IntNode(24, null)))));
    
    //System.out.println(what(n1));
    
    String s1 = "abc";
    String s2 = "abc";
    
    System.out.println(s1.equals(s2));
}
}