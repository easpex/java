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

public static double p(int n) {
    return Math.pow(5, n);
}

}