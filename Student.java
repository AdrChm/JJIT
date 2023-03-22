// Representation of the student.
public class Student
{
	// Not changable name.
	private final String name;

	// Mobile phone owned by the student.
	private Phone phone = null;
	
	// Student constructor
	public Student(String name)
	{
		this.name = name;
	} // Student
	
	// Aquiring phone 
	public void getNewPhone(String model, String serviceProvider)	
	{
		this.phone = new Phone(model, serviceProvider);
	} // getNewPhone;

	// Make a call for given duration (in seconds)
	public void makeACall(int requiredDuration)
	{
		// Case when person has no phone
		if(phone == null)
			return;

		phone.requestCall(requiredDuration);

	} // makeACall
	
	// Tops up the phone with given amount of pounds.
	public void topUp(int pounds)
	{
		// Case when person has no phone
		if(phone == null)
			return;
		phone.topUp(pounds);

	} // topUp

	// Returns student phone. 
	public Phone getPhone()
	{
		return phone;
	} // getPhone

	public String toString()
	{
		return "Student( " + name + "," + phone + ")";
	} // toString
} // class Student