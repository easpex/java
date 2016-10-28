public class SubBase extends Base
{
private int _num3;
public SubBase()
{
super (1,1);
_num3 = 1;
}
public SubBase(int n1, int n2, int n3)
{
super (n1,n2);
_num3 = n3;
}
public int sum()
{
int s = super.sum();
return s+_num3;
}
}