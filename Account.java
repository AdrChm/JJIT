/**
 * Representation of the phone account.
 *
 * @author Adrian Chmielewski
 */
public class Account
{
	// Service provider name.
	private final String serviceProvider;
	
	// Current balance of the account (in pennies).
	private int currentPenniesBalance = 0;

	/**
	 * Constructs an account.
	 *
	 * @param serviceProvider The required name of service provider.
	 */
	public Account(String serviceProvider)
	{	
		this.serviceProvider = serviceProvider;
	} // Account

	/**
	 * Request a call for given duration (in seconds).
	 * When called compares requested connection length with current account balance.
	 * Successful connection is paid with rate 1 penny per second. Account balance is reduced by
	 * length of successful connection (to reflect payment for it).
	 *
	 * @param requestedSeconds The requested length of the connection.
	 * When account balance is bigger than requested length when connection lasts its requested
	 * length. When account balance is less, then this value is used as successful connection.
	 *
	 * @return int - length of successful connection (in seconds).
	 */
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

	/**
	 * Increases current account balance by given amount (in pounds)
	 *
	 * @param pounds value represents amount pounds being added to account balance.
	 * As balance is kept in pennies, this parameter is multiplied by 100.
	 */
	public void topUp(int pounds)
	{
		currentPenniesBalance += pounds*100;
	} // topUp	


	/**
	 * Returns account service provider name.
	 *
	 * @return  String representing service provider name.
	 */
	public String getServiceProvider()
	{
		return serviceProvider;
	} // getServiceProvider

	/**
	 * Returns current account balance (in pennies).
	 *
	 * @return  integer representing account balance.
	 */
	public int getCurrentBalance()
	{
		return currentPenniesBalance;
	} // getServiceProvider

	/**
	 * Provides the Account(serviceProvider, currentPenniesBalance) representation of this account.
	 *
	 * @return  String representing this account.
	 */
	public String toString()
	{
		return "Account(" + serviceProvider + "," + currentPenniesBalance + ")";
	} // toString	

} // class Account