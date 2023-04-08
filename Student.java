/**
 * Representation of the student.
 *
 * @author Adrian Chmielewski
 */
public class Student
{
	// Not changeable name.
	private final String name;

	// Mobile phone owned by the student.
	private Phone phone = null;

	// Mark of the student.
	private int mark = 0;

	/**
	 * Constructs a student with mark assigned.
	 *
	 * @param name The required, full name of the student.
	 * @param mark Mark the student got.
	 */
	public Student(String name, int mark)
	{
		this.name = name;
		this.mark = mark;
	} // Student

	/**
	 * Constructs a student.
	 *
	 * @param name The required, full name of the student.
	 */
	public Student(String name)
	{
		this.name = name;
	} // Student

	/**
	 * Acquisition of a new phone by the student.
	 * If student already has a phone, old one will be discarded.
	 *
	 * @param model Required name of the phone model.
	 * @param serviceProvider Required name of the service provider.
	 * Used to created account assigned to the phone.
	 */
	public void getNewPhone(String model, String serviceProvider)	
	{
		this.phone = new Phone(model, serviceProvider);
	} // getNewPhone;

	/**
	 * Student takes action to make a call for given duration (in seconds)
	 * Action is used to make a requestCall by phone, the student is owning.
	 * @see Phone#requestCall(int)
	 * If student does not have a phone, nothing will happen.
	 *
	 * @param requiredDuration Required length of the call (in second).
	 */
	public void makeACall(int requiredDuration)
	{
		// Case when person has no phone
		if(phone == null)
			return;

		phone.requestCall(requiredDuration);

	} // makeACall

	/**
	 * Student takes action to pop up the phone owned by this student by given amount of pounds.
	 * Action is used to make a topUp by phone, the student is owning.
	 * @see Phone#topUp(int)
	 * If student does not have a phone, nothing will happen.
	 *
	 * @param pounds Required amount to top up the phone (in pounds).
	 */
	public void topUp(int pounds)
	{
		// Case when person has no phone
		if(phone == null)
			return;
		phone.topUp(pounds);

	} // topUp

	/**
	 * Returns phone owned by the student.
	 *
	 * @return Phone owned by the student.
	 */
	public Phone getPhone()
	{
		return phone;
	} // getPhone

	/**
	 * Provides the Student( full name, phone) representation of this student.
	 *
	 * @return String representing this student.
	 */
	public String toString()
	{
		return "Student( " + name + "," + phone + ")";
	} // toString
	/**
	 * Provides the Student( full name, mark) representation of this student.
	 *
	 * @param specifier - required for other signature of toString, which collides with
	 * toString method from different task in the books.
	 *
	 * @return Formatted string representing this student.
	 */
	public String toString(String specifier)
	{
		return String.format("%-10s got %3d",name, mark);
	} // toString

	/**
	 * Provides the full name of this student.
	 *
	 * @return String name.
	 */
	public String getName()
	{
		return this.name;
	} // getName

	/**
	 * Provides the mark of this student.
	 *
	 * @return int mark.
	 */
	public int getMark()
	{
		return this.mark;
	} // getMark

	public int compareTo(Student other)
	{
		if(this.mark == other.getMark())
			return this.name.compareTo(other.getName());
		else
			return this.mark - other.getMark();
	} // getName

} // class Student