public class Q1 {
    public static void specialPrint (String s) {
        if(s.length() > 0) {
            if(s.charAt(0) == 'a') {
                System.out.println(s.toString());
                s = s.substring(1);
                specialPrint(s);
            } else {
                s = s.substring(1);
                specialPrint(s);
            }
        }
    }

    
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.substring(0));
        
        System.out.println(s1.substring(1));
    }
}