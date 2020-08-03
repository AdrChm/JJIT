// Representation of a date.
public class Date
{
	// The day, month and year of the date. 
	public int day, month, year;

	// Construct a date -- given the required day, month and year.
	public Date(int requiredDay, int requiredMonth, int requiredYear)
	{
		day = requiredDay;
		month = requiredMonth;
		year = requiredYear;

	}  // Date constructor

	// Compare this date with a given other one, for equality.
	public boolean equals(Date other)
	{
		return day == other.day
		  	&& month == other.month
		  	&& year == other.year;
	} // equals

	// Compare this date with a given other one, for less than.
	public boolean lessThan(Date other)
	{
		return year < other.year
				|| year == other.year 
					&& (month < other.month 
						|| month == other.month && day < other.day);
	} // lessThan

	// Returns the day/month/year representation of the date
	public String toString()
	{
		return day + "/" + month + "/" + year;
	} // toString

} // Date class  