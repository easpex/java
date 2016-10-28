public class Q1 {
    public static int sum(int[] a, int curr, int end, int sum) {
        if(curr == end)
        return a[end];
        
        return(sum + a[curr] + sum(a, curr + 1, end, sum));
    }
    
    public static int equalSum(int[] a, int i) {
        if(i == a.length - 1)
        return -1;
        
        if(sum(a, 0, i, 0) == sum(a, i + 1, a.length - 1, 0))
        return i;
        else
        return(equalSum(a, i + 1));
    }
    
    public static void main(String[] args) {
        int[] a = {2,13,6,9};
        System.out.println("sum(a, 0, 1, 0) = " + sum(a, 0, 1, 0) + "equalSum() = " + equalSum(a, 0));
        
    }
}