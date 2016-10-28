public class Matrix
{
private int [][] _mat;
/**
* Constructor for objects of class MaxLineRecursion
*/
public Matrix(int sizeRow, int sizeCol)
{
_mat = new int[sizeRow][sizeCol];
}

public void create() {
    for(int i = 0; i < _mat.length; i++) {
        for(int j = 0; j < _mat[0].length; j++) {
            _mat[i][j] = i + 1;
        }
    }
}

public String toString() {
    String s = "";
    
    for(int i = 0; i < _mat.length; i++) {
        for(int j = 0; j < _mat[0].length; j++) {
            s += _mat[i][j] + ",";
        }
        
        s += "\n";
    }
    
    return s;
}

public int rowSum(int row, int col, int sum) {
    if(col == _mat.length)
    return sum;
    
    sum += _mat[row][col];
    
    return(rowSum(row, col + 1, sum));
}

public int maxRow(int row, int col, int bestRow) {
    if(row == _mat.length - 1)
    return bestRow;
    
    if(rowSum(row, col, 0) < rowSum(row + 1, col, 0))
    bestRow = row + 1;
    else
    bestRow = row;
    
    
    return(maxRow(row + 1, col, bestRow));
}

public static void main(String[] args) {
    Matrix m = new Matrix(5,5);
    m.create();
    System.out.println(m.toString());
    
    System.out.println(m.rowSum(2,0,0));
    System.out.println(m.maxRow(0,0,0));
}

}