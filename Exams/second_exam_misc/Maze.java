public class Maze {
    public static boolean solve(int[][] a, int i, int j) {
        if(i < 0 || j < 0 || i == a.length || j == a[0].length)
        return false;
        
        if(i == a.length - 1 && j == a[0].length - 1 && a[i][j] == 1)
        return true;
        
        if(a[i][j] == 0)
        return false;
        
        if(a[i][j] == 2)
        return false;
        
        int temp = a[i][j];
        a[i][j] = 2;
        print(a);
        
        if(solve(a, i + 1, j) ||
        solve(a, i - 1, j) ||
        solve(a, i, j + 1) ||
        solve(a, i, j - 1))
        return true;
        
        a[i][j] = temp;
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
        int[][] a = {{1,0,0,0,1},
                     {1,1,0,0,1},
                     {0,1,1,1,1}};
                     print(a);
                     System.out.println(solve(a, 0, 0));
                     print(a);
    }
}