public class CharList
{
private CharNode _head;
public CharList(CharNode ch ) {
_head = ch;
}

public int what (char start, char end)
{
int count=0;
CharNode i= _head;
while (i!=null)
{
if (i.getValue() == start)
{
CharNode j = i.getNext();
while (j != null)
{
if (j.getValue() == end)
count++;
j = j.getNext();
}
}
i = i.getNext();
}
return count;
}

public int what2(char start, char end) {
    int sum = 0;
    int startCount = 0, endCount = 0;
    CharNode i = this._head;
    //boolean increment = true;
    
    while(i != null) {
        if(i.getValue() == start ) {
            startCount++;
            
            
        }
            if(i.getValue() == end && startCount > 0) {
                endCount++;
            
            sum += (endCount * startCount);
            endCount = 0;
           
        }
        i = i.getNext();
    }
    
    return sum;
}

public static void main(String[] args) {
    CharNode e = new CharNode('c', null);
    CharNode d = new CharNode('c', e);
    CharNode c2 = new CharNode('b', d);
    CharNode c1 = new CharNode('b', c2);
    CharNode b = new CharNode('c', c1);
    CharNode a = new CharNode('c', b);
    
    CharList list = new CharList(a);
    int count1 = list.what('b','c');
    int count2 = list.what2('b','c');
    System.out.println("what1 = " + count1 + "; what2 = " + count2);

}


}