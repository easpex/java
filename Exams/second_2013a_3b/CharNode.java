public class CharNode
{
private char _value;
private CharNode _next;
public CharNode(char val, CharNode n) {
_value = val;
_next = n;
}
public CharNode(char val) {
_value = val;
_next = null;
}

public CharNode getNext( ) { return _next; }
public void setNext(CharNode node) { _next = node; }
public char getValue() { return _value; }
public void setValue(char v) { _value = v; }
}