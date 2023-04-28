import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*	Ice cream parlours have a name and amount of ice cream, initially zero.
	The can accept deliveries of ice cream, which increases their stock level.
	They also can serve ice cream greedy children, which reduces their stock
	level. Greedy children ask for an amount of ice cream, which they will
	attempt to eat, unless parlour's stock level is less than that amount,
	in which case the children are served with as much ice cream as is left.
*/
public class IceCreamParlour
{
	// Class variable responsible for assigned number.
	private static int createdItems = 0;

	// Index of the parlour.
	private final int index;

	// The name of the parlour.
	private final String name;
	
	// Amount of ice cream in the stock.
	private double iceCreamInStock = 0;

	// Constructor an ice cream parlour -- given required name.
	public IceCreamParlour(String requiredName) throws IceCreamParlourException
	{
		if(requiredName == null)
			 throw new IceCreamParlourException("Name can't be set to null");
		name = requiredName;
		index = ++createdItems;
	} // IceCreamParlour

	// Construct an ice cream parlour from the input file.
	public IceCreamParlour(DataInputStream inputStream) throws IceCreamParlourException, IOException
	{
		// Passing to constructor.
		name = inputStream.readUTF();
		iceCreamInStock = inputStream.readDouble();
		index = inputStream.readInt();
	} // IceCreamParlour

	// Accept delivery of ice cream.
	public void acceptDelivery(double amount) throws IceCreamParlourException
	{
		if(amount <= 0)
			throw new IceCreamParlourException("Delivery amount: " + amount + " is incorrect");
		iceCreamInStock += amount;

	} // acceptDelivery

	// Serve ice cream. Attempt to serve the amount desired
	// but as much as we can if stock is too low.
	// Return the amount served.
	public double tryToServe(double desiredAmount) throws IceCreamParlourException
	{
		if(desiredAmount <= 0)
			throw new IceCreamParlourException("Desired amount: " + desiredAmount + " is incorrect");

		if(iceCreamInStock == 0)
			throw new IceCreamParlourException("Can't serve as stock has: " + iceCreamInStock);

		double amountServed = desiredAmount;
		if(amountServed > iceCreamInStock)
			amountServed = iceCreamInStock;
		
		iceCreamInStock -= amountServed;
		return amountServed;
	} // tryToServe
	
	// Return a String giving the name and state.
	public String toString()
	{
		return name + " has " + iceCreamInStock + " in stock.";
	} // toString

	// Saves state of a parlour in given output.
	public void saveIceCreamParlour(DataOutputStream output) throws IOException
	{
		output.writeUTF(name);
		output.writeDouble(iceCreamInStock);
		output.writeInt(index);
	} // saveIceCreamParlour

	// Return Index of the parlour.
	public int getIndex()
	{
		return index;
	} // getIndex

} // class IceCreamParlour