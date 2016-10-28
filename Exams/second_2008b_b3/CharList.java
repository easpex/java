public class CharList
{
private CharNode _head;
public CharList() {
_head = null;
}
public CharList(CharNode node){
_head = node;
}

public boolean parent() {
    CharNode n = this._head;
    return parent(n, 0, 0, 0);
}

public boolean parent(CharNode n, int left, int right, int count) {
    if(n == null)
    return left == right ? true : false;
    
    if(count == 0 && n.getData() == ')')
    return false;
    
    if(n.getData() == '(') {
        left++;
        count++;
    }
        
    if(n.getData() == ')')
    right++;
    
    n = n.getNext();
    return parent(n, left, right, count);
}

public static void main(String[] args) {
    //  (a((b+c))
    CharNode c1 = new CharNode('(', new CharNode('a', new CharNode('(', new CharNode('(', new CharNode('b',
    new CharNode('+', new CharNode('c', new CharNode(')', new CharNode(')',null)))))))));
    CharList list = new CharList(c1);
    System.out.println(list.parent());
}
}