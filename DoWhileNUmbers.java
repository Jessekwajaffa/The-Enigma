public class DowhileNumbers
{
	public static void main (string [] args)
	{
		scanner scan = new scanner (system.in);
		sytem.out.println("Enter any number");

		int yourAge = scan.nextInt ();

		do{
		yourAge++;
		system.out.println(yourAge);
		}
		while(yourAge < 18)
	}
}