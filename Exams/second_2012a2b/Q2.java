public class Q2 {
    public void  count (int[ ] data, int num) {



}

public static int fSearch(int[] source, int needle) {
    int low = 0;
    int high = source.length - 1;
    int firstOccurrence = Integer.MIN_VALUE;
    int lastOccurrence = Integer.MAX_VALUE;
    int link = -1;
    

    while (low <= high) {
        int middle = ((high + low) / 2);

        if (source[middle] == needle) {
            // key found and we want to search an earlier occurrence
            firstOccurrence = middle;
            
            if(link == -1 && firstOccurrence != Integer.MIN_VALUE) {
                link = firstOccurrence;
            }
            
            high = middle - 1;
        } else if (source[middle] < needle) {
            low = middle + 1;
        } else {
            high = middle - 1;
        }
        
        
    }
   
    
    
    if(link > -1) {
        int middle2;
        low = link + 1;
        high = source.length - 1;
      while(low <= high) {
        middle2 = ((high + low) / 2);
       if (source[middle2] == needle) {
            // key found and we want to search an earlier occurrence
            lastOccurrence = middle2;
            low = middle2 + 1;

        } else if (source[middle2] < needle) {
            low = middle2 + 1;
        } else {
            high = middle2 - 1;
        } 
      }
    }
    
    
        if (firstOccurrence != Integer.MIN_VALUE && lastOccurrence != Integer.MAX_VALUE) {
           System.out.println("link - firstOccurrence");
        return lastOccurrence - firstOccurrence + 1;
    } else if(firstOccurrence != Integer.MIN_VALUE && lastOccurrence == Integer.MAX_VALUE) {
        System.out.println("link - firstOccurrence");
        return link - firstOccurrence + 1;
        
    } else if(link != -1){
        System.out.println("link");
        return 1;
    } else {
        return -1;
    }

    
}

public static void main(String[] args) {
    int[] a = {1,1,1,1,5,5,5};
    int res = fSearch(a, 1);
    
    System.out.println(res + " len = " + a.length);
}

}