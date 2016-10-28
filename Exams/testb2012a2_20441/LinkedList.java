public class LinkedList
{
private IntNode _head;
private IntNode _tail;
public LinkedList() {
_head = null;
_tail = null;
}

public String toString() {
    String s = "";
    IntNode curr = _head;
    while(curr != null) {
        s+= curr.toString() + "|";
        curr = curr.getNext();
    }
    
    return s;
}

public void foo(int num) {
if (_head == null)
{
_head = new IntNode (num, null);
_tail = _head;
}
else
{
_tail.setNext(new IntNode(num, null));
_tail = _tail.getNext();
}
}

public LinkedList what() {
return what (this);
}

public void concat(LinkedList other)
{
    System.out.println(other.toString());
if (other._head == null)
return;
if (_head == null)
_head = other._head;

System.out.println(other._head==null);
System.out.println(_tail==null);
//_tail=other._head;
_tail.setNext(other._head);
_tail = other._tail;
}

private LinkedList what(LinkedList list)
{
IntNode n = list._head;
if (n==null)
return list;
int val = n.getValue();
LinkedList list1 = new LinkedList();
LinkedList list2 = new LinkedList();
IntNode temp = n.getNext();
while (temp != null)
{
int v = temp.getValue();
if (v < val)
list1.foo(v);
else
list2.foo(v);
temp = temp.getNext();
}
list1 = what (list1);
list1.foo(val);
list2 = what(list2);
list1.concat(list2);
return list1;
}

public static void main (String [] args)
{
LinkedList list = new LinkedList();
list.foo (100);
list.foo (51);
//list.foo (10);
//list.foo (3);

System.out.println(list);
list = list.what();
System.out.println(list);
}
}