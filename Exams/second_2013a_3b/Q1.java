public class Q1 {
    public static boolean match(int[] a, int s, int[] pattern, int p) {
        if(s == a.length - 2)
        return false;
        
        if(pat(a, s, pattern, p) &&
           pat(a, s + 1, pattern, p + 1) &&
           pat(a, s + 2, pattern, p + 2))
           return true;
           else
           return(match(a, s + 1, pattern, p));
        
    }
    
    public static boolean pat(int[] a, int s, int[] pattern, int p) {
        if(pattern[p] == 1 && a[s] < 10)
        return true;
        else if(pattern[p] == 2 && a[s] < 100 && a[s] >= 10) 
        return true;
        else if(pattern[p] == 0 && a[s] < 100)
        return true;
        else
        return false;
    }
    
    public static void main(String[] args) {
        int[] a = {2,22,9,4,1,35};
        int[] pattern = {1,1,1};
        boolean result = match(a, 0, pattern, 0);
        System.out.println(result);
    }
}