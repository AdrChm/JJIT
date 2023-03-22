// Representation of the mobile phone.
public class Phone
{
	// Phone model.
	private final String model;
	
	// Fixed account assigned to the phone
	private final Account account;
	
	// Total amount of second the phone has called.
	private int secondsCalled = 0;
	 
	// Constructor 
	public Phone(String model, String serviceProvider)
	{	
		this.model = model;
		this.account = new Account(serviceProvider);
	} // Phone 
	
	// Request a call for given duration (in seconds)
	public void requestCall(int requestedSecond)
	{	
		// As result amount of second recorded on the phone is increased.
		secondsCalled += account.requestCall(requestedSecond);
	} // requestCall

	// Tops up the account with given amount of pounds.
	public void topUp(int pounds)
	{
		account.topUp(pounds);
	} // topUp

	// Returns students account balance. 
	public int getAccountBalance()
	{
		return account.getCurrentBalance();
	} // getAccountBalance

	// Returns phone model name. 
	public String getModelName()
	{
		return model;
	} // getModelName

	public String toString()
	{
		return "Phone(" + model + "," + secondsCalled + "," + account + ")";
	} // toString	

} // class Phone 