/*	Ice cream parlours have a name and amount of icecream, initially zero.
	The can accept deliveries of ice cream, which increases their stock level.
	They also can serve ice cream greedy children, which reduces their stock
	level. Greedy children ask for an amount of ice cream, which they will
	atempt to eat, unless parlour's stock level is less than that amount,
	in which case the children are served with as much ice cream as is left.
*/
public class IceCreamParlour
{
	// The name of the parlour.
	private final String name;
	
	// Amount of ice cream in the stock.
	private double iceCreamInStock = 0;

	// Constructor an icecream parlour -- given required name.
	public IceCreamParlour(String requiredName)
	{
		name = requiredName;
	} // IceCreamParlour

	// Accept delivery of ice cream.
	public void acceptDelivery(double amount)
	{
		iceCreamInStock += amount;
	} // acceptDelivery
	
	// Serve ice cream. Attepmpt to serve the amount desired
	// but as much as we can if stock is too low.
	// Return the amount served.
	public double tryToServe(double desiredAmount)
	{
		double amountServed = desiredAmount;
		if(amountServed > iceCreamInStock)
			amountServed = iceCreamInStock;
		
		iceCreamInStock -= amountServed;
		return amountServed;
	} // tryToServe
	
	// Return a String giveng the name and state.
	public String toString()
	{
		return name + " has " + iceCreamInStock + " in stock.";
	} // toString
} // class IceCreamParlour