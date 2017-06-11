public static void main (string [] args)
{
	scanner scan = new scanner(system.in);
	system.out.println("enter any number");
	
	int yourAge = scan.nextInt ();
	while (yourAge < 18)
	{
		system.out.println("Do you want to continue? YES OR NO");
		string conditionFactor = scan.nextLine();
		if (conditionFactor.equals("NO"))
			break;
		system.out.println("YOU ARE WAY TOO YOUNG FOR THIS");
		//yourAge++;
	}
}