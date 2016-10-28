public class IntQueue {
    private IntNode _front;
    private IntNode _rear; 
    
    public IntQueue () { _front = null; }
    
    public boolean isEmpty () { return( _front == null); }
    
    public void enqueue (IntNode newItem) { 
        
        if(isEmpty()) { _rear = new IntNode(newItem.getValue(), null); 
            
            _front = _rear; 
        } else {
            _rear.setNext(new IntNode(newItem.getValue(), null)); 
            _rear = _rear.getNext(); 
        } 
    }
    
    public int dequeue () { // or retrieve
        
        if (isEmpty())
        return 0;
        else {
            IntNode temp = _front;
            _front = _front.getNext(); 
            temp.setNext(null); 
            return temp.getValue(); 
        } 
    } 
    public void remove () { _front = null; } 
    
    public int size() {
        int count = 1;
        
        if(this.isEmpty())
        return 0;
        
        IntNode curr = this._front;
        while(curr.getNext() != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }
    
    public static int what (IntQueue q) {
int len = q.size();

IntNode temp = new IntNode(q.dequeue(), null);
q.enqueue(temp);
for (int i=1; i<len; i++)
{
IntNode curr = new IntNode(q.dequeue(), null);
q.enqueue(curr);
if (curr.getValue() > temp.getValue())
temp = curr;
}
return temp.getValue();
}
public static boolean something (IntQueue x, IntQueue y){
if (x.size() == 0)
return false;
int temp = what(x);
for (int j=0; j<y.size(); j++)
{
//int curr = y.dequeue();
IntNode curr = new IntNode(y.dequeue(), null);
y.enqueue(curr);
if (temp <= curr.getValue())
return false;
}
return true;
}

public static void main(String[] args) {
    IntNode n1 = new IntNode(1, null);
    IntNode n2 = new IntNode(2, n1);
    IntNode nOne = new IntNode(1, n2);
    IntNode n3 = new IntNode(3, nOne);
    IntQueue a = new IntQueue();
    a.enqueue(n3);
    System.out.println(what(a));
    
    IntNode y3 = new IntNode(3, null);
    IntQueue b = new IntQueue();
    b.enqueue(y3);
    System.out.println(something(a,b));
}
}
    