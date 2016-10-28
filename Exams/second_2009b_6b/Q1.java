public class Q1 {
    public static boolean same(String s1, String s2) {
        if(s2 == "*" || s1 == s2)
        return true;
        
        if(s1 == "")
        return false;
        
        if(s1.charAt(0) == s2.charAt(0))
        return same(s1.substring(1), s2.substring(1));
        
        if(s2.charAt(0) == '*')
        return same(s1, s2.substring(1)) ||
               same(s1.substring(1), s2);
               
        return false;
    }
    
     public static boolean match(String first, String second) {
 
    // If we reach at the end of both strings, we are done
    if(first.length() == 0 && second.length() == 0)
        return true;
 
    // Make sure that the characters after '*' are present
    // in second string. This function assumes that the first
    // string will not contain two consecutive '*'
    if(first.length() > 1 && first.charAt(0) == '*' && second.length() == 0)
        return false;
 
    // If the first string contains '?', or current characters
    // of both strings match
    if(first.length() != 0 && second.length() !=0 && first.charAt(0) == second.charAt(0)) {
        return match(first.substring(1), second.substring(1));
    }
 
    // If there is *, then there are two possibilities
    // a) We consider current character of second string
    // b) We ignore current character of second string.
    if(first.length() !=0 && first.charAt(0) == '*')
    return match(first.substring(1),second) || match(first,second.substring(1));
 
    return false;
  }
    
    public static void main(String[] args) {
        String s1 = "The*xamIs*y";
        String s2 = "Th*mIsEasy*";
        String s3 = "*";
        String s4 = " TheExamIsEasy";
        String s5 = " The*IsHard";
        String test = "TheExamIsEasy";
        
        //System.out.println(same(s2, test));
        System.out.println(match(s1, test));
        
    }
}