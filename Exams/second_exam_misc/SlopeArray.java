public class SlopeArray {
    public static boolean slope(int[][] a, int i, int j) {
       
        
        if(i < 0 || j < 0 || i == a.length || j == a[0].length)
        return false;
        
        
        if(i == a.length - 1 && j == a[0].length - 1 && a[i][j] == 0)
        return true;
        
        
       
         
        if(!(a[i][i] != 0) && !(i > j && a[i][j] > 0) && !(i < j && a[i][j] < 0) ) {
           return(slope(a, i + 1, j) ||
           slope(a, i - 1, j) ||
           slope(a, i, j + 1) ||
           slope(a, i, j - 1));
        }
  

           
        
        return false;
        
    }
    
    public static void print(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] a = {{0,1,2,3},
                     {-1,0,3,4},
                     {-2,-4,0,1},
                     {-1,-9,-3,0}};
                     
                     print(a);
                     System.out.println(slope(a, 0, 0));
    }
}