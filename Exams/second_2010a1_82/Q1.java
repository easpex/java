public class Q1 {
    public static int maximalDrop (int [] a) {
        int temp, // for initial diff
        diff = -1, 
        min = 1000000000, //we'll give a huge unreal number so any realistic min will win
        max = -1, //we'll give a negative unreal number so any realistic max will win
        minT, //temp min
        maxT, //temp max
        posMin = 0, //position of the min
        posMax = 0; //position of the max
        boolean changed = false; // every time there's a new min this becomes true in order to initiate new max
        for(int i = 1; i < a.length - 1; i++) {
            minT = a[a.length - i];
            maxT = a[a.length - i - 1];
            
            if(minT < min) {
                min = minT;
                posMin = a.length - i;
                changed = true; //each time we find new min we need to reset new max
            }
            
            if( (maxT > max) || changed) {
                max = maxT;
                posMax = a.length - i - 1;
            }
            
            temp = max - min;
            if((temp > diff) && posMin > posMax) //finds biggest difference; also the max needs to be before min
            diff = temp;
        }    
               
        return diff;
    }
    
    public static void main(String[] args) {
        int[] a = {5,21,3,27,12,24,7,6,4};
        int[] b = {5,21,3,22,12,7,26,14};
        int[] c = {5,15,3,22,12,7,27,14};
        System.out.println(maximalDrop(a));
    }
}