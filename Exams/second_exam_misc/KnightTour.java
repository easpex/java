public class KnightTour {
    
    static int count = 1;
    public static void knight(int[][] a, int i, int j, int count) {
        if(i > a.length - 1|| j > a[0].length -1 ||
        i < 0 || j < 0)
        return;
        
        if(a[i][j] > 0)
        return;
        else {
            a[i][j] = count;
            count++;
            print(a);
        }
 
        
        
        knight(a, i + 2, j + 1, count);
        knight(a, i + 1, j + 2, count);
        knight(a, i - 2, j - 1, count);
        knight(a, i - 1, j - 2, count);
        knight(a, i - 1, j + 2, count);
        knight(a, i - 2, j - 1, count);
        knight(a, i + 1, j - 2, count);
        knight(a, i + 2, j - 1, count);
        //a[i][j] = temp;
        
    }
    
    public static boolean knight2(int[][] a, int i, int j, int index, int count) {
        if(i > a.length - 1|| j > a[0].length -1 ||
        i < 0 || j < 0)
        return false;
        
        if(a[i][j] != 0)
        return false;
        
            a[i][j] = count++;

            print(a);
        
                       
        
        
        if(index == a.length * a.length - 1)
        return true;
        
        if(  knight2(a, i + 2, j + 1, index + 1, count) ||
        knight2(a, i + 1, j + 2, index + 1, count) ||
        knight2(a, i - 2, j - 1, index + 1, count) ||
        knight2(a, i - 1, j - 2, index + 1, count) ||
        knight2(a, i - 1, j + 2, index + 1, count) ||
        knight2(a, i - 2, j - 1, index + 1, count) ||
        knight2(a, i + 1, j - 2, index + 1, count) ||
        knight2(a, i + 2, j - 1, index + 1, count))
        return true;
        
        a[i][j] = 0;
        count--;
        return false;
        
    }
    
    public static boolean move(int[][] a, int x, int y, int m) {
        if( (x < 0) || (x >= a.length) || (y < 0) || (y >= a.length) ) 
        return false;
        
        if(a[x][y] != 0)
        return false;
        
        if(m == a.length * a.length - 1) {
            a[x][y] = count;
            count++;
            return true;
        } else {
            boolean result = false;
            result = (result || move(a, x+2, y+1, m+1));
            result = (result || move(a, x+2, y-1, m+1));
            result = (result || move(a, x-2, y+1, m+1));
            result = (result || move(a, x-2, y-1, m+1));
            result = (result || move(a, x+1, y+2, m+1));
            result = (result || move(a, x+1, y-2, m+1));
            result = (result || move(a, x-1, y+2, m+1));
            result = (result || move(a, x-1, y-2, m+1));
            
            if(result = true)
            return true;
            else {
                a[x][y] = 0;
                return false;
            }
            
        }
        
        
        
        
        
    }
    
    public static void print(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                if(a[i][j]<10)
                System.out.print("0" + a[i][j] + ",");
                else
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        //move(a, 0, 0, count);
        //knight2(a, 0, 0, 0, count);
        knight(a, 0, 0, count);
        print(a);
        
    }
}