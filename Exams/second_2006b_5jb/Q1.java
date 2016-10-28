public class Q1 {
    public static int myCompare (String s1, String s2) {
        
        if(s1.charAt(0) < s2.charAt(0))
        return 1;
        else if(s1.charAt(0) > s2.charAt(0))
        return -1;
        else if(s1.charAt(0) == s2.charAt(0) && (s1.length() == 1 && s2.length() == 1) )
        return 0;
        else if(s1.charAt(0) == s2.charAt(0) && (s1.length() == 1 && s2.length() > 1))
        return 1;
        else if(s1.charAt(0) == s2.charAt(0) && (s2.length() == 1 && s1.length() > 1))
        return -1;
        else 
        return myCompare(s1.substring(1), s2.substring(1));
        
    }
    
    public static void main(String[] args) {
        String s1 = "a";
        
    }
    

}