public class FilmAgeCheck
{
	public static void main(String [] args)
	{
		int minimumAge = Integer.parseInt(args[0]);
		int ageOfPerson = Integer.parseInt(args[1]);

		if (ageOfPerson < minimumAge)
			System.out.println("The person is too young to watch to watch the film!");
	}
}