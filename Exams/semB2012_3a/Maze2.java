public class Maze2 {
    
    public static boolean solvemaze(int[][] arr) {
        return(solvemaze(arr, 0,0));
    }
    
    public static boolean solvemaze(int[][] arr, int i, int j) {
        if (arr[i][j] == 0) 
        return false;
        if (arr[i][j] == 2)
        return false; 
        arr[i][j] = 2; 
        if (i==arr.length-1 && j==arr.length-1)
        return true; 
        if ( ((i <arr.length-1) && solvemaze(arr,i+1, j)) ||
        ((i > 0) && solvemaze(arr, i-1,j)) ||
        ((j < arr.length-1) && solvemaze(arr, i,j+1)) ||
        ((j > 0) && solvemaze(arr, i,j-1)))
        return true;
        
        return false; 
    }
    
    public static void printPathWeights(int[][] m)
    {
         printPathWeights (m, 0, 0, 0);
    }
    
    private static void printPathWeights(int [][]m, int i, int j, int sum)
    {
        if (i<0 || i>=m.length || j<0 || j>=m[0].length)
        return;
        if (m[i][j] == -1)
        return;
        if (i==m.length-1 && j==m[0].length-1)
        System.out.println (sum + m[m.length-1][m[0].length-1]);
        int temp = m[i][j];
        m[i][j] = -1;
        printPathWeights (m, i+1, j, sum+temp);
        printPathWeights (m, i, j+1, sum+temp);
        printPathWeights (m, i-1, j, sum+temp);
        printPathWeights (m, i, j-1, sum+temp);
        m[i][j] = temp;
    }
    
    public static void main(String[] args) {
        int[][] a = {{1,2},{4,5}};
        //System.out.println(solvemaze(a));
        System.out.println(toString(a));
        printPathWeights(a);
    }
    
    public static String toString(int[][] a) {
        String output = ""; 
        for (int i = 0; i <a.length ; i++) { 
            for (int j = 0; j < a[i].length ; j++)
            output += a[i][j] + " "; 
            output += "\n"; 
        } 
        return output; 
    }
}