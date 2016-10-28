public class Q5 {
    public static void insert1 (int[] a, int i)
{
int value = a[i];
while (i>0 && a[i-1] >value)
{
a[i]= a[i-1];
i--;
}
a[i] = value;
}

public static void print(int[] a) {
  for(int i = 0; i < a.length; i++) {
      System.out.print(a[i] + ",");
    }
}

public static void print(int[][] a) {
    for(int i = 0; i < a.length; i++) {
        for(int j = 0; j < a[0].length; j++) {
            System.out.print(a[i][j] + ",");
        }
        System.out.println();
    }
}

public static void changeArr1 (int [] arr) {
int[] tmp = {10, 20};
System.out.print(arr);
System.out.print(tmp);
arr = tmp;
print(arr);
System.out.print(arr);
System.out.print(tmp);
}
public static void changeArr2 (int [][] arr, int x) {
if (x < arr.length) {
int [] tmp = {10, 20, 30};
arr[x] = tmp;
}
}

public static void main(String[] args) {

    
    int [] arr1 = {-4, -3, -2, -1, 0};
   
int [][] arr2 = {{2,4,6}, {4,5,6}, {2,4,6}, {1,2,3}};
 System.out.print(arr1);
changeArr1 (arr1);
System.out.print(arr1);
print(arr1);
print(arr2);
changeArr2 (arr2, 2);
System.out.println();
print(arr2);
int[] a ={1,2};
int[] b = {3,4};
a=b;
print(a);
b = null;
print(a);
}
}