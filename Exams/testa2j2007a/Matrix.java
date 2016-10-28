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

public void fill() {
    for(int i = 0; i < _mat.length; i++) {
        for(int j = 0; j < _mat[0].length; j++) {
            _mat[i][j] = i + j;
        }
    }
}

public void print() {
    for(int i = 0; i < _mat.length; i++) {
        for(int j = 0; j < _mat[0].length; j++) {
            System.out.print(_mat[i][j] + "|");
        }
        System.out.println();
    }
}

public int rowSum(int row) {
    return rowSum(this._mat[row].length - 1, row);
}

public int rowSum(int i, int row) {
    if(i == 0) {
        return this._mat[row][i];
    } else {
        return this._mat[row][i] + rowSum(i - 1, row);
    }
}

public int maxRow() {
    //int max = rowSum(0);
    int row = 0;
    return maxRow(row);
}

public int maxRow(int row) {
    if(row == this._mat.length - 1) {
        
        return row;
    } else {
        System.out.println(this._mat.length);
        int r0 = rowSum(row), r1 = rowSum(row + 1);
        if(rowSum(row) < rowSum(row + 1))
        row = row + 1;
        return maxRow(row);
    }
}

    

        
    
    



public static void main(String[] args) {
    Matrix a = new Matrix(10,10);
    a.fill();
    a.print();
    
    System.out.println(a.rowSum(1));
    System.out.println(a.maxRow());
}

}