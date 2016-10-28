public class Aleph2009_83 {
    public static int count1 = 0;
    
    public static void recCheck (String a1, String a2)
{
    
     
if (a2.length() == 1)
{
System.out.println (a1+a2);
System.out.println (a1);

}
else
{
String a3 = new String (a1 + a2.charAt(0));
String a4 = new String (a2.substring (1));
recCheck (a3, a4);
count1++;
recCheck (a1, a4);
count1++;
}

System.out.println(count1);
}


}