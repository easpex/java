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
    
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{0,1,1}};
        Maze m = new Maze(a);
        m.solvemaze(0,0);
        System.out.println(m.toString());
    }
}