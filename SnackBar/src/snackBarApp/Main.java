package snackBarApp;

public class Main
{
	public static void main (String[] args)
	{
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine vm1 = new VendingMachine("Food");
		VendingMachine vm2 = new VendingMachine("Drink");
		VendingMachine vm3 = new VendingMachine("Office");

		Snack s1 = new Snack("Chips", 36, 1.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2);

		System.out.println("*** Processing ***");

		c1.buy(7.50);
		s4.buySnack(3);
		System.out.println(c1);
		System.out.println(s4);
		
		c1.buy(2.00);
		s3.buySnack(1);
		System.out.println(c1);
		System.out.println(s3);
		
		c2.buy(5.00);
		s4.buySnack(2);
		System.out.println(c2);
		System.out.println(s4);

		c1.addCash(10.00);
		System.out.println(c1);

		c1.buy(1.00);
		s2.buySnack(1);
		System.out.println(c1);
		System.out.println(s2);

		s3.addQuantity(12);
		System.out.println(s3);

		c2.buy(6.00);
		s3.buySnack(3);
		System.out.println(c2);
		System.out.println(s3);
	}
}