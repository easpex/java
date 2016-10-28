public class Maze {
    private int [][] _maze;
    public Maze(int[][] maze) {
        _maze = maze;
    }
    
    public boolean solvemaze(int i, int j) {
        if (_maze[i][j] == 0)
        return false; 
        
        if (_maze[i][j] == 2) 
        return false; 
        
        _maze[i][j] = 2;
        
        if (i==_maze.length-1 && j==_maze.length-1) 
        return true; 
        
        if ( ((i <_maze.length-1) && solvemaze(i+1,j)) ||
        ((i > 0) && solvemaze(i-1,j)) ||
        ((j < _maze.length-1) && solvemaze(i,j+1)) ||
        ((j > 0) && solvemaze(i,j-1)))
        return true; 
        
        _maze[i][j] = 1; 
        
        return false; 
    }
    
    public String toString() { 
        String output = ""; 
        for (int i = 0; i <_maze.length ; i++) {
            for (int j = 0; j < _maze[i].length ; j++)
            output += _maze[i][j] + " "; 
            
            output += "\n"; 
        }
        return output; 
    }
    
    public static void print(int[][] a) { 
  
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++)
            System.out.print(a[i][j] + ",");
            
            System.out.println();
        }
        
    }
    
    public static void printPathWeights(int [][] m)
{
printPathWeights (m, 0, 0, 0);
}

private static void printPathWeights(int [][]m, int i, int j,
int sum)
{
if (i<0 || i>=m.length || j<0 || j>=m[0].length)
return;
if (m[i][j] == -1)
return;
if (i==m.length-1 && j==m[0].length-1)
System.out.println (sum + m[m.length-1][m[0].length-1]);
int temp = m[i][j];
m[i][j] = -1;
print(m);
System.out.println();
printPathWeights (m, i+1, j, sum+temp);
printPathWeights (m, i, j+1, sum+temp);
printPathWeights (m, i-1, j, sum+temp);
printPathWeights (m, i, j-1, sum+temp);
m[i][j] = temp;
}
    
    public static void main(String[] args) {
        int[][] a = {{1,0,0},
                     {1,1,1},
                     {0,0,1}};
                     //System.out.println(a[0][1]==5);
        Maze m = new Maze(a);
        System.out.println(m.toString());
        System.out.println();
        System.out.println(m.solvemaze(0,0));
        System.out.println(m.toString());
        
        int[][] p = {{1,1,1},{1,1,1}};

        printPathWeights(p);
        print(p);
        
    }
}
