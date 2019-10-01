package snackBarApp;

public class Customer
{
	public static int maxId = 0;
	public int id;
	public String name;
	public double cashOnHand;

	public Customer(String name, double cashOnHand)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public void addCash(double cash)
	{
		this.cashOnHand = this.cashOnHand + cash;
	}

	public void buy(double givenCash)
	{
		this.cashOnHand = this.cashOnHand - givenCash;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	@Override
	public String toString()
	{
		String rtnStr = "Customer " + id + " cashOnHand: " + cashOnHand;
		return rtnStr;
	}
}