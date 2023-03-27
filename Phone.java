/**
 * Representation of the mobile phone.
 *
 * @author Adrian Chmielewski
 */
public class Phone
{
	// Phone model.
	private final String model;
	
	// Fixed account assigned to the phone
	private final Account account;
	
	// Total amount of second the phone has called.
	private int secondsCalled = 0;

	/**
	 * Constructs a phone. During this process also account is created for this phone.
	 *
	 * @param model The required model of the phone.
	 * @param serviceProvider name of serviceProvider for account assigned to this phone.
	 */
	public Phone(String model, String serviceProvider)
	{	
		this.model = model;
		this.account = new Account(serviceProvider);
	} // Phone

	/**
	 * Request sent to account for a call with requested duration (in seconds).
	 * @see Account#requestCall(int)
	 * If successful (connection made is bigger than 0) legnth of the connection is added to total
	 * amount of seconds, this phone had a connection.
	 *
	 * @param requestedSecond The duration of requested connection. Used to provide value to
	 * requestCall method.
	 */
	public void requestCall(int requestedSecond)
	{	
		// As result amount of second recorded on the phone is increased.
		secondsCalled += account.requestCall(requestedSecond);
	} // requestCall

	/**
	 * Tops up the account with given amount of pounds.
	 * @see Account#topUp(int)
	 * @param pounds Required amount to top up the account (in pounds).
	 */
	public void topUp(int pounds)
	{
		account.topUp(pounds);
	} // topUp

	/**
	 * Returns current account balance (in pennies).
	 *
	 * @return integer representing current pennies held by the account.
	 */
	public int getAccountBalance()
	{
		return account.getCurrentBalance();
	} // getAccountBalance

	/**
	 * Returns model name.
	 *
	 * @return String representing model name.
	 */
	public String getModelName()
	{
		return model;
	} // getModelName

	/**
	 * Provides the Phone( model, second called, Account) representation of this phone.
	 *
	 * @return String representing this student.
	 */
	public String toString()
	{
		return "Phone(" + model + "," + secondsCalled + "," + account + ")";
	} // toString	

} // class Phone 