public class Q1 {
    public static void crossSort2(int[] arr) {
        int[] even, uneven;
        int[] temp = new int[arr.length];

        if( (arr.length) % 2 ==0) {
            even = new int[arr.length/2];
            uneven = new int[arr.length/2];
        } else if( (arr[arr.length - 1] % 2) == 0) {
            even = new int[(arr.length/2) + 1];
            uneven = new int[arr.length/2];
        } else {
            even = new int[(arr.length/2) + 1];
            uneven = new int[arr.length/2];
        }
        
        int e = 0, u = 0;
        for(int i = 0; i < arr.length; i++) {
            
            if( (i % 2) == 0) {
                even[e] = arr[i];
                e++;
            } else {
                uneven[u] = arr[i];
                u++;
            }
        }
        
        System.out.println("even");
        for(int i = 0; i < even.length; i++) {
            System.out.println(even[i] + " ");
        }
        
        System.out.println();
        System.out.println("uneven");
        for(int i = 0; i < uneven.length; i++) {
            System.out.println(uneven[i] + " ");
        }
        
        
    }
    
    public static void crossSort (int[] arr) {
        int[] temp = new int [arr.length];
        int i=0;
        int j;
        if (arr.length % 2 == 0)
            j = arr.length-1;
        else
            j = arr.length-2;

        for (int k=0; k<temp.length; k++) {
          if (i<arr.length && j>-1) {
            if (arr[i]<=arr[j]) {
                temp[k] = arr[i];
                i+=2;
            } else {
                temp[k] = arr[j];
                j-=2;
            }
          } else if (i>=arr.length) {
              temp[k] = arr[j];
              j-=2;
            } else {
                temp[k] = arr[i];
                i+=2;
            }
        }

        for (int ind = 0; ind < temp.length; ind++) {
            arr[ind]=temp[ind];
        }
    }
    
    public static int crossSearch2(int[] array, int num) {
        int middle;
        int lower = 0;
        int upper;
        if( (array.length % 2) == 0) {
            upper = array.length - 2;
        } else {
            upper = array.length - 1;
        }
        
        do { 
            middle = (lower + upper) / 2;
            if( (middle % 2) == 1)
            middle--;
            
            if (num < array[middle])
            upper = middle - 2; 
            else 
            lower = middle + 2; 
        } while ( (array[middle] != num) && (lower <= upper) ); 
        
        if (array[middle] == num) 
        return middle; 
        else 
        return -1; 
    }
}