public class IntList {
private IntNode _head;
public IntList( ) {
_head = null;
}
public IntList (IntNode node) {
_head = node;
}

public String bigToString() {
    String s = "";
    IntNode curr = _head;
    while(curr != null) {
        s += curr.getHowManyBig() + ",";
        curr = curr.getNext();
    }
    return s;
}
public String toString() {
    String s = "";
    IntNode curr = _head;
    while(curr != null) {
        s += curr.getValue() + ",";
        curr = curr.getNext();
    }
    return s;
}
public IntList addNumber (int num, int position) {
    int count = 0;
    IntNode curr = _head;
    IntNode newNode = new IntNode(num, null);
    while(count != position - 1) {
        count++;
        if(curr.getValue() < num)
        curr.setHowManyBig(curr.getHowManyBig() + 1);
        
        curr = curr.getNext();
    }
    IntNode next = curr.getNext();
    curr.setNext(newNode);
    newNode.setNext(next);
    
    IntNode curr2 = newNode.getNext();
    int countBig = 0;
    while(curr2 != null) {
        
        if(curr2.getValue() > newNode.getValue())
        countBig++;
        
        
        curr2 = curr2.getNext();
    }
    newNode.setHowManyBig(countBig);
        
    IntList list = new IntList(_head);
    return list;
}

public static void main(String[] args) {
    //524871
    IntNode n10 = new IntNode(10, null);
    IntNode n7 = new IntNode(7, n10);
    IntNode n8 = new IntNode(8, n7);
    IntNode n4 = new IntNode(4, n8);
    IntNode n2 = new IntNode(2, n4);
    IntNode n5 = new IntNode(5, n2);
    
    IntList list = new IntList(n5);
    System.out.println(list.toString());
    list.addNumber(3,5);
    System.out.println(list.toString());
    System.out.println(list.bigToString());
        
}
}