public class Driver
 {
 public static void main (String [] args)
 {
     int size = 1;
 Vehicle [] s = new Vehicle[size];
 //[0] = new Truck(); +
 s[0] = new Car(); 
 //s[1] = new Vehicle(); +
 //s[0] = new Sedan();
 
 //s[4] = new Bus(); +
 for (int i = 0; i < s.length; i++)
 s[i].sketch();
 System.out.println();
 for (int i = 0; i < s.length; i++)
 s[i].move();
 }
}