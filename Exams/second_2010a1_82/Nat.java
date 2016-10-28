public class Nat {
private Nat _pre;
public Nat() {
_pre = null;
}
public Nat(Nat pre){
_pre = pre;
}

public boolean isZero () {
if (_pre == null)
return true;
else
return false;
}
public Nat succ() {
return new Nat(this);
}

public boolean equals(Nat other){ 
    if(this.isZero() && other.isZero())
    return true;
    
    if((this.isZero() && !other.isZero()) || (!this.isZero() && other.isZero()))
    return false;
    else {
        return(this._pre.equals(other._pre));
    }
    
  
    
}

public static void main(String[] args) {
    Nat n = new Nat();
    Nat n1 = new Nat(n);
    Nat n2 = new Nat(n1);
    
    Nat b = new Nat();
    Nat b1 = new Nat(b);
    Nat b2 = new Nat(b1);
    System.out.println(b2.equals(n2));
    
    
    int count = 0;
    Nat tmp = n2;
    while(tmp != null) {
        count++;
        tmp = tmp._pre;
    }

    
    System.out.println(count);
}
}