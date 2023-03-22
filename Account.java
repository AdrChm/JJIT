// Representation of the phone account.
public class Account
{
	// Serive provider.
	private final String serviceProvider;
	
	// Current balance of the account (in pennies).
	private int currentPenniesBalance = 0;
	 
	// Constructor 
	public Account(String serviceProvider)
	{	
		this.serviceProvider = serviceProvider;
	} // Account
	
	// Request a call for given duration (in seconds)
	// Returns lenght of successfull connection.
	public int requestCall(int requestedSeconds)
	{	
		int callDuration;
		// When requested call exceeded current balance.
		if(requestedSeconds > currentPenniesBalance)
		{
			callDuration = currentPenniesBalance;
			currentPenniesBalance = 0;
			return callDuration;
		} // if
		else
		{
			currentPenniesBalance -= requestedSeconds;
			return requestedSeconds;
		} // else
	} // requestCall

	// Tops up current balance with given amount of pounds.
	public void topUp(int pounds)
	{
		currentPenniesBalance += pounds*100;
	} // topUp	

	// Returns service provider name. 
	public String getServiceProvider()
	{
		return serviceProvider;
	} // getServiceProvider

	// Returns students account balance. 
	public int getCurrentBalance()
	{
		return currentPenniesBalance;
	} // getServiceProvider

	public String toString()
	{
		return "Account(" + serviceProvider + "," + currentPenniesBalance + ")";
	} // toString	

} // class Account