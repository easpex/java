public class Q1 {
    public static boolean isSubstring (String s1, String s2) {
        if(s2.length() > s1.length()) {
            return false;
        }
        
        if(s2.length() == 1 && s2.charAt(0) == s1.charAt(0))
        return true;
        
        if(s2.charAt(0) == s1.charAt(0)) {
            return(isSubstring(s1.substring(1), s2.substring(1)));
        } else {
            return(isSubstring(s1.substring(1), s2));
        }
    }
    
    public static boolean isSubStr (String s1, String s2) {
        if(s1.length() == 1 && s2.length() ==1 && s1.charAt(0) == s2.charAt(0)) 
        return true;
        
        if(s2.length() > s1.length()) {
            return false;
        }
        
        if(s1.length() == 0 && s2.length() > 0)
        return false;
        
        if(s2.length() == 0 && s1.length() > 0)
        return false;
       
        
        if(s2.charAt(0) == s1.charAt(0)) {
            return( (isSubStr(s1.substring(1), s2)) ||
                    (isSubStr(s1, s2.substring(1))) );
        } else {
            return(isSubStr(s1.substring(1), s2));
        }
        

    }
    
    public static void main(String[] args) {
        String s1 = "afbc";
        String s2 = "abc";
        System.out.println(isSubstring(s1, s2));
        System.out.println(isSubStr(s1, s2));
        
        
    }
}