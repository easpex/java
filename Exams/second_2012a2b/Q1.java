public class Q1 {
    public static boolean isSumOf(int[] s, int n, int i, int j, int sum) {
        
        
        if(n == sum) {
            return true;
        }
        
        if(i == s.length) {
            j++;

            i = j;
            sum = 0;
        }
        
        if(j == s.length) {
            return false;
        }
 
        
        
        sum += s[i];

        return isSumOf(s, n, i + 1, j, sum);
    }
    
    public static boolean isSumOf(int[] s, int n) {
        int sum = s[0];
        return isSumOf(s, n, 1, 0, sum);
    }
    
    public static boolean find(int[] A, int curr, int index, int sum) {
		if (curr == sum) {
			return true;

		} else if (index == A.length) {
			return false;
		} else {
		    int c = curr;
		    int i = index;
		    System.out.println("curr + A[index] = " + c + " index + 1 = " + i);
			return(find(A, curr + A[index], index + 1, sum) || find(A, curr, index + 1, sum));
		}

    }
    
    
    
    public static void main(String[] args) {
        int[] a = {1,52};
        //boolean res = isSumOf(a, 7, 1, 0,1);
     
        boolean res = find(a, 0, 0, 52);
           System.out.println(res);
           System.out.println();
           System.out.println((double) 2/7);
    }
}