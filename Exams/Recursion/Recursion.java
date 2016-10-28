public class Recursion {

        public static boolean recSubset(int[] a, int target, int i, int sumSoFar) {
//basecases
if (sumSoFar == target) 
return true; 
//we reached the end and sum is not equal to target
if (i == a.length) 
return false;


//recursive case: try next element both in and out of the sum
System.out.println("i+1 = " + (i+1) + "sumSoFar + a[i] = " + (sumSoFar + a[i]));
boolean with = recSubset(a, target, i+1, sumSoFar + a[i]); 

System.out.println("i+1 = " + (i+1) + "sumSoFar = " + sumSoFar);
boolean without = recSubset(a, target, i+1, sumSoFar);
return (with || without);
}

public static boolean slope (int[][] data, int i) {
    // end of array – last cell, if it’s 0 than it’s OK 
    if (i == data.length - 1) 
    return data[i][i] == 0 ? true : false; 
    
    //return (slope(data, i+1) && data[i][i]==0 && check(data,i,i+1)); 
    return (slope(data, i+1) && check(data,i,i+1)); 
} 

private static boolean check(int[][] data, int i, int j) {
    // end of “dimension”: finish checking to the “right” and “bottom” 
    if (j == data.length) return true; 
    
    // check the two “mirror” elements 
    if (data[i][j] <= 0 || data[j][i] >= 0) 
    return false; 
    
    return check(data, i, j+1); 
}

public static void main(String[] args) {
    int[][] a = {{0,1,2},
                 {-1,0,2},
                  {-2,-3,1}};
    System.out.println(slope(a,0));
    
    int[][] b = {{0,1},
                 {3,4}};
    print(b);
    printPathWeights(b, 0,0,0);
}

private static void printPathWeights(int[][]m, int i, int j, int sum) {
if (i<0 || i>=m.length || j<0 || j>=m[0].length)
return;
if (m[i][j] == -1)
return;
if (i==m.length-1 && j==m[0].length-1)
System.out.println (sum + m[m.length-1][m[0].length-1]);
int temp = m[i][j];
m[i][j] = -1;

print(m);

printPathWeights (m, i+1, j, sum+temp);
printPathWeights (m, i, j+1, sum+temp);
printPathWeights (m, i-1, j, sum+temp);
printPathWeights (m, i, j-1, sum+temp);
m[i][j] = temp;
}

public static void print(int[][] a) {
    System.out.println();
    for(int i = 0; i < a.length; i++) {
        for(int j = 0; j < a[0].length; j++) {
            System.out.print(a[i][j] + "|");
        }
        System.out.println();
    }
}
    
}