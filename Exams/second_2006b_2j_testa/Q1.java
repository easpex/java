public class Q1 {
    public static void specialPrint (String s) {
        if(s.length() == 1)
        return;
        
        if(s.charAt(0) == 'a') {
            System.out.println(s);
        }
        
        specialPrint(s.substring(1));
    }
    
    public static boolean what2 (int [] a, int [] b) {
        if (a.length != b.length)
        return false;
        
        //find the min
        int min = b[0];
        for(int i = 1; i < b.length - 1; i++) {
            if(b[i] < min) {
                min = b[i];
            }
        }
        
        //find the max
        int max = a[0];
        for(int j = 1; j < b.length - 1; j++) {
            if(b[j] > max) {
                max = b[j];
            }
        }
        
        if(max < min)
        return false;
        else
        return true;
    }
    
    public static boolean what (int [] a, int [] b)
{
if (a.length != b.length)
return false;
for (int i= 0; i<a.length; i++)
for (int j=0; j<b.length; j++)
if (b[j] < a[i])
return false;
return true;
}
    
    public static void main(String[] args) {
        String str = "Java is a good language!";
        
        specialPrint(str);
    }
}