public class IntList {
public IntNode _head;
public IntList( ) {
_head = null;
}
public IntList (IntNode node) {
_head = node;
}

public String toString() {
    String s = "";
    IntNode curr = this._head;
    while(curr != null) {
        s += curr.toString() + "|";
        curr = curr.getNext();
    }
    return s;
}

public void addNumber (int num, int position) {
    IntNode temp = new IntNode(num, null);
    IntNode curr = this._head;
    int count = 1;
    if(position == 1) {
    temp.setNext(curr);
    this._head = temp;
    IntNode n = this._head;
    IntNode temp2 = this._head;
    while(n != null) {
        if(temp2.getValue() < n.getValue()) {
            temp2.setHowManyBig(temp2.getHowManyBig() + 1);
            
        }
        n = n.getNext();
    }
    this._head = temp2;
  }
    else {
    while(curr != null && position - 1 != count) {
        count++;
        if(curr.getValue() < temp.getValue()) {
            curr.setHowManyBig(curr.getHowManyBig() + 1);
            
        }
        curr = curr.getNext();
    }
    temp.setNext(curr.getNext());
    curr.setNext(temp);
  }
    
}

public static void main(String[] args) {
    IntNode n1 = new IntNode(1, new IntNode(2,
                                new IntNode(4,
                                new IntNode(3,
                                new IntNode(5,null)))));
    IntList list = new IntList(n1);
    list.addNumber(100, 3);
    System.out.println(list.toString());
    System.out.println(list._head.getNext().getHowManyBig());
}
}