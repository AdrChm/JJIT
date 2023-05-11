/**
 * Representation of the student.
 *
 * @author Adrian Chmielewski
 */
public class Student implements Comparable<Student>
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

	/**
	 * 	Compares this student's value with another, returning
	 * 	< 0 if this student's mark is smaller than the other's,
	 * 	> 0 if it is greater, or if the values are equal then
	 * 	compare the @name of the colours instead. If these are
	 * 	equal as well, student's phones is compared with other's.
	 * 	@see Phone, returning
	 * 	< 0 if this student's phone model has smaller value than
	 * 	the other's, > 0 if it has greater, or if the values are
	 * 	equal then return 0;
	 *
	 * 	The way this method is required to work unables proper implemention
	 * 	of hashCode funtion, thus Student class must rely on super.hashCode()
	 * 	which is not consistent with equals method for this class.
	 *
	 * @param other Student compared with this.
	 *
	 * @return int representing comparing outcome.
 	 */

	@Override
	public int compareTo(Student other)
	{
		if(this.mark == other.getMark())
			if(this.name.compareTo(other.getName()) == 0)
				return this.phone.getModelName().compareTo(other.getPhone().getModelName());
			else
				return this.name.compareTo(other.getName());
		else
			return this.mark - other.getMark();
	} // getName

	/**
	 * Indicates whether other Student is "equal to" this one.
	 * To be considered equal compared Students must return 0 in
	 * compareTo method.
	 *
	 * @param other Student compared with this.
	 *
	 * @return boolean, true if equal and false if not.
	 */
	@Override
	public boolean equals(Object other)
	{
		if(other instanceof Student)
			return this.compareTo((Student) other) == 0;
		else
			return super.equals(other);
	} // equals

	/**
	 * 	Returns hashCode of this student.
	 * 	Due to requirements for compareTo class, this is only partially correct
	 * 	implementation as it doesn't provide proper values when marks of compared
	 * 	students are equal, thus considers mark as the only parameter. This implementation
	 * 	discourages the use of hashmap, as chance for collision is almost certain.
	 * 	Regardless this drawback, it must be done as part of coffee 21.4.4 task.
	 *
	 * 	@return int representing this date.
	 */
	@Override
	public int hashCode()
	{
		return (11 * mark) % 5;
	} // hashCode

} // class Student