public class printWeight {
    public static void printWeights(int[][] a, int i, int j, int sum) {
        if(i > a.length - 1 || i < 0 ||
           j > a[0].length - 1 || j < 0)
           return;
           
        if(a[i][j] == -1)
        return;
        
        if(i == a.length - 1 && j == a[0].length - 1)
        System.out.println(sum + a[a.length - 1][a[0].length - 1]);
        
        int temp = a[i][j];
        a[i][j] = - 1;
        
        printWeights(a, i + 1, j, sum + temp);
        printWeights(a, i, j + 1, sum + temp);
        printWeights(a, i - 1, j, sum + temp);
        printWeights(a, i, j - 1, sum + temp);
        
        a[i][j] = temp;
    }
    
    public static String stringMingle(String s1, String s2, String join) {
        if(s1.length() == 0)
        return join;
        
        join += s1.charAt(0) + "" + s2.charAt(0);
        return(stringMingle(s1.substring(1), s2.substring(1), join));
    }
    
    public static int superDigit(int n, boolean helper) {
        if(n < 10)
        return n;
        
        return( (n % 10) + superDigit(n/10, helper));
    }
    
    public static int superDigit(int n) {

        int newn = superDigit(n, true);
        
        if(newn < 10)
        return newn;
        else
        return superDigit(newn);
    }
    
    public static void main(String[] args) {
        int[][] b = {{1,2},{3,4}};
        //System.out.println(b.length);
        printWeights(b, 0, 0, 0);
        
        String s1 = "abcde";
        String s2 = "fghij";
        
        System.out.println(stringMingle(s1, s2, ""));
        System.out.println(superDigit(148148148));
    }
}