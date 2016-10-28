public class Q1 {
    public static int maximalDrop (int[] a) {
        int max = a[0];
        int min = a[0];
        int minCount = 0;
        int d = 0;
        boolean newMax = false;
        int dOld = 0;
        for(int i = 0; i < a.length - 1; i++) {
            if(max > a[i + 1]) {
                if(a[i + 1] < a[i]) {
                    min = a[i + 1];
                    minCount++;
                    d = max - min;
                }
                
                
            } else {
                max = a[i + 1];
            }
            

                
                if(minCount > 0 && dOld < d) {
                    dOld = d;
                }

            
            
            
        }
        return dOld;
    }
}