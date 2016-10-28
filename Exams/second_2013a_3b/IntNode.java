public class IntNode { 
    private int _value;
    private IntNode _next; // the tail
    public IntNode(int val, IntNode next) { 
        _value = val; _next = next; 
    } 
    
    public int getValue() {return _value;}
    
    public void setValue(int val) {_value = val;} 
    
    public IntNode getNext() {return _next;}
    
    public void setNext(IntNode node) {_next = node;} 

}