public class Q1 {
    public static int equalSum(int[] a, int i) {
        if(i == a.length)
        return -1;
       
        int suml = sum(a, 0, i);
        int sumr = sum(a, i + 1, a.length - 1); 
        if(suml == sumr)
        return i;
        
        return equalSum(a, i + 1);
    }
    
    public static int sum(int[] a, int start, int end) {
        if(start > end)
        return 0;
        
        return a[start] + sum(a, start + 1, end);
    }
}