// Program telling story about some Students using their Accounts on their Phones
// to make some call.
public class StudentsCalling
{
	// Private helper method for students creation.
	private static Student createStudent(String name)
	{
		System.out.println("Creating student " + name);
		System.out.println("Result:");		
		return new Student(name);

	} // createStudent

	// Private helper method for students calling.
	private static void studentMakesACall(Student s, int requestedDuration)
	{

		if(s.getPhone() == null)
			System.out.println("This next call has no effect, as has no phone!");	
		else
		if(s.getPhone().getAccountBalance() < requestedDuration)
			System.out.println("This next call should be truncated to "
					   + s.getPhone().getAccountBalance() + " seconds.");
					  
		System.out.println(s);
		System.out.println("is making a call for desired " + requestedDuration
				   + " seconds");
		System.out.println("Result:");	
		s.makeACall(requestedDuration);
		System.out.println(s);

	} // studentMakesACall

	// Private helper method for students toppinng up their phones.
	private static void studentTopsUpThePhone(Student s, int topUpAmount)
	{

		if(s.getPhone() == null)
			System.out.println("This next top up has no effect, as has no phone!");	
	
		System.out.println(s);
		System.out.println("is topping up by " + topUpAmount);
		System.out.println("Result:");	
		s.topUp(topUpAmount);
		System.out.println(s);

	} // studentTopsUpThePhone

	// Private helper method for students buying their phones.
	private static void studentBuysPhone(Student s, String phoneModel, String serviceProvider)
	{	
		if(s.getPhone() != null)
			System.out.println("Now let us discard a phone.");
			
		System.out.println(s);
		System.out.println("is buying phone " + phoneModel + "\nwith account "+ serviceProvider);
		System.out.println("Result:");	
		s.getNewPhone(phoneModel, serviceProvider);
		System.out.println(s);

	} // studentBuysPhone

	// Here the story is being told. 
	public static void main(String [] args)
	{
		Student s1 = createStudent("Chatty Charlie");
		System.out.println(s1 + "\n");	

		Student s2 = createStudent("Norman No Friends");
		System.out.println(s2 + "\n");

		Student s3 = createStudent("Popular Penny");
		System.out.println(s3 + "\n");	
	
		studentMakesACall(s1, 300);
		System.out.println();

		studentTopsUpThePhone(s2, 20);
		System.out.println();	
	
		studentBuysPhone(s1, "Sotia BIFR", "World@1");
		System.out.println();		

		studentBuysPhone(s2, "Cyoo L8TR0N", "4FRN Touch");
		System.out.println();			

		studentBuysPhone(s3, "Tisonly 14U", "Foney Friends");
		System.out.println();	

		studentTopsUpThePhone(s1, 10);
		System.out.println();	

		studentTopsUpThePhone(s2, 20);
		System.out.println();	

		studentTopsUpThePhone(s3, 30);
		System.out.println();	

		studentMakesACall(s1, 300);
		System.out.println();	

		studentMakesACall(s1, 1200);
		System.out.println();	

		studentMakesACall(s1, 10);
		System.out.println();	

		studentMakesACall(s2, 10);
		System.out.println();	

		studentMakesACall(s3, 65);
		System.out.println();	
	
		studentMakesACall(s3, 115);
		System.out.println();	

		studentMakesACall(s3, 488);
		System.out.println();	

		studentMakesACall(s3, 302);
		System.out.println();	

		studentMakesACall(s3, 510);
		System.out.println();	

		studentMakesACall(s3, 250);
		System.out.println();	

		studentBuysPhone(s3, "Simm UL8R", "VerTuleTyat");
		System.out.println();	
	} // main

} // class StudentsCalling