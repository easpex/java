
public class Helper {

	/**
	 * @param args
	 */
	public static int agencyID = 0; //<YourAgencyID>
	private static long rand;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void writer(String caption, String value)
	{
		System.out.println(caption + " = " + value);
	}

	public static void writer(String value)
	{
		System.out.println(value);
	}

	public static void SetRand(long randNumber)
	{
		rand = randNumber;
	}

	public static String GetRand()
	{
		return Long.toString(rand);
	}

	public static String CreateUniqueName(String Name)
	{
		return Name + "_" + rand++;
	}	
}
