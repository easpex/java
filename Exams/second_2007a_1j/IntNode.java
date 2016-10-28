public class IntNode {
private int _value;
private int _howManyBig;
private IntNode _next;
public IntNode(int val, IntNode n) {
_value = val;
_next = n;
_howManyBig = 0;
}
public int getValue() {
return _value;
}
public int getHowManyBig() {
return _howManyBig;
}
public IntNode getNext() {
return _next;
}
public void setValue(int v) {
_value = v;
}
public void setHowManyBig(int num) {
_howManyBig = num;
}

public void setNext(IntNode node) {
_next = node;
}


}