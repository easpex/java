public class Q2 {
    public static boolean what (int [] a, int [] b) {
        if (a.length != b.length)
           return false;
           
        for (int i= 0; i<a.length; i++)
            for (int j=0; j<b.length; j++)
               if (b[j] < a[i])
                  return false;
                  
        return true;
    }
    
    public static boolean what2 (int[] a, int[] b) {
        if (a.length != b.length)
           return false;
           
        int aMax = a[0];
        for(int i = 1; i < a.length - 1; i++) {
            if(aMax < a[i])
            aMax = a[i];
        }
        
        int bMin = b[0];
        for(int j = 1; j < b.length; j++) {
            if(bMin > b[j])
            bMin = b[j];
        }
        
        if(aMax > bMin)
        return false;
        
        return true;
    }
}