public class CharList {
private CharNode _head;
public CharList( ) {
_head = null;
}

public CharList(CharNode c) {
_head = c;
}

public static void main(String[] args) {
    CharNode a = new CharNode('a', null);
    CharNode b = new CharNode('b', new CharNode('b', null));
    CharList s = new CharList(a);
    CharList t = new CharList(b);
    System.out.println(isTrans(s, t));
}

/*
public static boolean isTrans (CharList s, CharList t) {
    isTrans(CharList s, CharList t, int si, int ti);
}
*/

 public static boolean isTrans (CharList s, CharList t) {
     if(s._head != null || t._head.getNext() != null) {
         if(t._head.getNext() != null && t._head.getValue() == t._head.getNext().getValue()) {
             t._head = t._head.getNext();
             isTrans(s, t);
            
         } else if(t._head.getValue() == s._head.getValue()) {
             s._head = s._head.getNext();
             return true;
             
         }
     }
     return isTrans(s, t);
 }

 
public static boolean isTrans(CharList t) {
    if(t._head.getNext() != null && t._head.getValue() == t._head.getNext().getValue()) {
             t._head = t._head.getNext();
             return false;
    } else {
        return true;
    }

}
}


