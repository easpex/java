public class Q2 {
    public static String count(int[] a, int x) {
        int found=binary(a,x, 0, a.length - 1);
        int fl=found;
        int fu = found;
        int temp1 = - 1;
        int temp2 = - 1;
        int count = 0;
        if(found == - 1) 
        return "0";
        else {
            
            while(fl >= 0) {
                fl = binary(a, x, 0, fl - 1);
                
                if(fl == temp1 || fl == -1) break;
                temp1 = fl;
            }
            
            
            while(fu < a.length) {
                fu = binary(a, x, fu + 1, a.length - 1);
                if(fu == temp2 || fu == -1) break;
                temp2 = fu;
            }
            
        }
        if(temp1 == -1) temp1 = found;
        if(temp2 == -1) temp2 = found;
        
        count = temp2 - temp1 + 1;
        return temp1 + " " + temp2 + " " + count;
    }
    
    public static int binary (int[ ] data, int num, int lo, int up) {
// Binary search for num in an ordered array
int middle, lower = lo, upper = up;
do {
middle = ((lower + upper) / 2);
if (num < data[middle])
upper = middle - 1;
else lower = middle + 1;
} while ( (data[middle] != num) && (lower <= upper) );
//Postcondition: if data[middle] isn’t num, no
// component is
if (data[middle] == num)
return middle;
else return -1;
}
}