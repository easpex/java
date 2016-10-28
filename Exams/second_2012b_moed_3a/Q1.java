public class Q1 {
    public static void crossSort(int[] arr) {
        for(int i = 0; i < arr.length/2 - 1; i++) {
            
            int tempOut = arr[i+1];
            int tempIn = arr[arr.length - 1];
            if(arr[arr.length - 1] < arr[i+2]) {
                arr[i+1] = arr[arr.length - 1];
            } else {
                arr[i+1] = arr[i+2];
            }
            arr[arr.length - i - 2] = tempIn;
            arr[arr.length - i - 1] = tempOut;
            
            print(arr);
            System.out.println();
        }
    }
    
    public static void print(int[] a) {
        for(int i =0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    public static void main(String[] args) {
        int a[] = {1,9,2,8,3,4};
        print(a);
        crossSort(a);
        print(a);
    }
}