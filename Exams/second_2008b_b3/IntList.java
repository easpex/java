public class IntList
{
private IntNode _head;
public IntList() { _head = null; }
// Adds an item to the beginning of the list
public void addHead(int val) {
_head = new IntNode(val, _head);
}
public String toString() {
String str = "";
for (IntNode tmp=_head; tmp!=null; tmp=tmp.getNext())
str += tmp.getValue() + "\t";
return str;
}
}