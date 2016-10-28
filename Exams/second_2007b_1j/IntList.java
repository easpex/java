public class IntList {
private IntNode _head;
public IntList( ) {
_head = null;
}
public IntList (IntNode node) {
_head = node;
}
public IntNode getHead () {
return _head;
}

public IntNode findMaxSuffix (IntNode other) {
    IntNode n1 = this._head, n2 = other,
    res1 = null, res2 = null;
    int count1 = 0, count2 = 0;
    boolean count1on = true;
    
    while(n1 != null || n2 != null) {
        if(n1.getValue() == n2.getValue() && count1on) {
            
            if( count1 == 0)
            res1 = new IntNode(n1.getValue(), null);
            count1++;
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        
        
        if(n1.getValue() != n2.getValue() && count1 > 0 && count1on) {
            count1on = false;
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        
        if(n1.getValue() != n2.getValue() && count1 == 0) {
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        
        if(!count1on) {
            if(n1.getValue() == n2.getValue()) {
                
                
                if(count2 == 0)
                res2 = new IntNode(n1.getValue(), null);
                
                count2++;
                n1 = n1.getNext();
                n2 = n2.getNext();
                
            } else {
                count1on = true;
                if(count1 < count2) {
                    res1 = null;
                    count1 = 0;
                } else {
                    res2 = null;
                    count2 = 0;
                }
            }
        }
    }
    if(count1 < count2)
    return res2;
    else
    return res1;
}

public static void main(String[] args) {
    IntNode list = new IntNode(1, new IntNode(-5, new IntNode(4, new IntNode(6, new IntNode(4, new IntNode(2,
    new IntNode(1, null)))))));
    IntNode other = new IntNode(1, new IntNode(-5, new IntNode(3, new IntNode(6, new IntNode(4, new IntNode(2,
    new IntNode(1, null)))))));
    IntList i1 = new IntList(list);
    int n = i1.findMaxSuffix(other).getValue();
    System.out.println(n);
}
}