public class CharList {
private CharNode _head;
public CharList(CharNode n) {
_head = n;
}

public static boolean isTrans (CharList list1, CharList list2) {
    CharNode l1 = list1._head;
    CharNode l2 = list2._head;
    CharNode prev = l1;
    
    return isTrans(l1, l2, prev);
}

public static boolean isTrans (CharNode list1, CharNode list2, CharNode prev) {
    if(list1.getNext() == null && list1.getValue() == list2.getValue()) {
        return true;
    } else if(list2.getNext() == null) {
        return false;
    }
        
    if(list1.getValue() == list2.getValue()) {
        list1 = list1.getNext();
        list2 = list2.getNext();
        return isTrans(list1, list2, prev);
    }
    
    if(prev.getValue() == list2.getValue()) {
        list2 = list2.getNext();
        return isTrans(list1, list2, prev);
    }
    
    if(list1.getValue() != list2.getValue()) {
        return false;
    }
    
    return isTrans(list1, list2, prev);
}

public static void main(String[] args) {
    CharNode n1 = new CharNode('a', new CharNode('b', new CharNode('b', new CharNode('c', new CharNode('d',null)))));
    CharList l1 = new CharList(n1);
    //aaccbbdd"
    CharNode n2 = new CharNode('a',null);
    CharList l2 = new CharList(n2);
    System.out.println(isTrans(l1, l2));
}
}