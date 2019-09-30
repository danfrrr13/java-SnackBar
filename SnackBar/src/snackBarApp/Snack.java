// id
// name
// quantity
// cost
// vending machine id

// set and get id
// set and get name
// set and get cost
// set and get vending machine id
// get quantity
// add quantity when given how many to add
// buy snack when given how many to buy
// get total cost given a quantity

package snackBarApp;

public class Snack{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public double getCost()
	{
		return cost;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void addQuantity(int quantity)
	{
		this.quantity = this.quantity + quantity;
	}

	public void buySnack(int quantity)
	{
		this.quantity = this.quantity - quantity;
	}

	public double getCost(int quantity)
	{
		double cost;
		cost = this.cost * quantity;
		return cost;
	}

	@Override
	public String toString()
	{
		String rtnStr = "Quantity of " + name + ": " + quantity;
		return rtnStr;
	}
}

// add quantity when given how many to add
// buy snack when given how many to buy
// get total cost given a quantity