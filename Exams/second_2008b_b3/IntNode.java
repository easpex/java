public class IntNode
{
private int _value;
private IntNode _next;
public IntNode(int val, IntNode n) {
_value = val;
_next = n;
}
public IntNode getNext() { return _next; }
public void setNext(IntNode node) { _next = node; }
public int getValue() { return _value; }
public void setValue(int v) { _value = v; }
}