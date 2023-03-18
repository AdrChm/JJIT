// Representation of a date.
public class Date
{
	// The day, month and year of the date.
	private int day, month, year;

	// Construct a date -- given the required day, month and year.
	public Date(int RequiredDay, int RequiredMonth, int RequiredYear)
	{
		day = RequiredDay;
		month = RequiredMonth;
		year = RequiredYear;
	} // Date

	// Compare this date with a given other one, for equality.
	public boolean equals(Date other)
	{
		return year == other.year && month == other.month && day == other.day;	
	} // equals

	// Compare this date with a given other one, for less than.
	public boolean lessThan(Date other)
	{
		return year < other.year || year == other.year 
				&& (month < other.month 
				|| month < other.month && day < other.day);		
	} // lessThan

	// Return the day/month/year representation of the date.
	public String toString()
	{
		return day + "/" +  month + "/" +  year;
	} // toString

	// Return a new Date which is one year later than given one.
	public Date addYear()
	{
		return new Date(day, month, year + 1);
	} // addYear
} // class Date