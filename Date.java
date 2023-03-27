/**
 * This class represents calendar dates and provides certain
 * manipulations of them.
 *
 * @author John Latham
 */
public class Date
{	
	// Class variable to hold the present date.
	private static Date presentDate = null;

	/**
	 * Sets the present date.
	 * This is ignored if the date has already been set.
	 *
	 * @param requiredPresentDate The required date for the present day.
	 */
	public static void setPresentDate(Date requiredPresentDate)
	{
		if (presentDate == null)
			presentDate = requiredPresentDate;
	} // setPresentDate

	/**
	 * Gets the present date.
	 *
	 * @return The present date, or null if it has not been set.
	 */
	public static Date getPresentDate()
	{
		return presentDate;
	} // getPresentDate

	// Instance variables: the day, month and year of a date.
	private final int day, month, year;

	/**
	 * Constructs a date. If the day and/or month components are zero
	 * or negative, they are treated as being 1; if they are too
	 * larege, they are treated as being the largest value allowed.
	 *
	 * @param requiredDay The required day.
	 * @param requiredMonth The required month.
	 * @param requiredYear The required year.
	 */
	// Construct a date -- given the required day, month and year.
	public Date(int requiredDay, int requiredMonth, int requiredYear)
	{
		year = requiredYear;
		if(requiredMonth < 1) 			month = 1;
		else if (requiredMonth > 12) 	month = 12;
		else 							month = requiredMonth;

		if(requiredDay < 1) 					day = 1;
		else if (requiredDay > daysInMonth())	day = daysInMonth();
		else 									day= requiredDay;
	} // Date
/**
 * Yields the day component of this date.
 *
 * @return The day of this date.
 */
public int getDay()
{
	return day;
} // getDay

	/**
	 * Yields the month component of this date.
	 *
	 * @return The month of this date.
	 */
	public int getMonth()
	{
		return month;
	} // getMonth

	/**
	 * Yields the year component of this date.
	 *
	 * @return The year of this date.
	 */
	public int getYear()
	{
		return year;
	} // getYear

	/**
	 * Provides the day/month/year representation of this date.
	 *
	 * @return A String day/month/year representation of this date.
	 */
	public String toString()
	{
		return day + "/" +  month + "/" +  year;
	} // toString

	/**
	 * Compares this date with a given other one.
	 *
	 * @param other The other date to compare with.
	 *
	 * @return The value 0 if the other date represents the same date
	 * as this one; a value less than 0 if this date is less than the
	 * other; and a value greater than 0 if this date is greater than
	 * the other.
	 */
	public int compareTo(Date other)
	{
		if (year != other.year) 		return year - other.year;
		else if (month != other.month) 	return month - other.month;
		else 							return day - other.day;
	} // compareTo

	/**
	 * Compares this date with a given other one, for equality.
	 *
	 * @param other The other date to compare with.
	 *
	 * @return true if and only if they represent the same date.
	 */
	public boolean equals(Date other)
	{
		return compareTo(other) == 0;
	} // equals
	/**
	 * Compare this date with a given other one, for less than.
	 *
	 * @param other The other date to compare with.
	 *
	 * @return true if and only if this date is less than the other.
	 */
	public boolean lessThan(Date other)
	{
		return compareTo(other) < 0;
	} // lessThan
	/**
	 * Compare this date with a given other one, for less than.
	 *
	 * @param other The other date to compare with.
	 *
	 * @return true if and only if this date is greater than the other.
	 */
	public boolean greaterThan(Date other)
	{
		return compareTo(other) > 0;
	} // greaterThan

	/**
	 * Constructs a new date which is one day later than this one.
	 *
	 * @return A new date which is one day later than this one.
	 */
	public Date addDay()
	{
		int newDay = day + 1;
		int newMonth = month;
		int newYear = year;
		if (newDay > daysInMonth())
		{
			newDay = 1;
			newMonth++;
			if(newMonth > 12)
			{
				newMonth = 1;
				newYear++;
			} // if
		} // if
		return new Date(newDay, newMonth, newYear);
	} // addDay

	/**
	 * Constructs a new date which is one month later than this one.
	 * If the day is too large for that month, it is truncated to
	 * the number of days in that month.
	 *
	 * @return A new date which is one month later than this one.
	 */
	public Date addMonth()
	{
		int newMonth = month;
		int newYear = year;
		if(newMonth > 12)
		{
			newMonth = 1;
			newYear++;
		} // if
		// Day will be corrected in constructor if too high.
		return new Date(day, newMonth, newYear);
	} // addMonth

	/**
	 * Constructs a new date which is one year later than given one.
	 * If this date is a leap day, it returns 28th February of the next year.
	 *
	 * @return A new date which is one year later than this one.
	 */
	public Date addYear()
	{
		// Day will be corrected in constructor for 29th February.
		return new Date(day, month, year + 1);
	} // addYear

	/**
	 * Constructs a new date which is one day earlier than this one.
	 *
	 * @return A new date which is one day earlier than this one.
	 */
	public Date subtractDay()
	{
		int newDay = day - 1;
		int newMonth = month;
		int newYear = year;
		if (newDay < 1)
		{
			// Will be corrected in constructor if too high.
			newDay = 31;
			newMonth--;
			if(newMonth < 1)
			{
				newMonth = 12;
				newYear--;
			} // if
		} // if
		return new Date(newDay, newMonth, newYear);
	} // subtractDay

	/**
	 * Constructs a new date which is one month earlier than this one.
	 * If the day is too large for that month, it is truncated to
	 * the number of days in that month.
	 *
	 * @return A new date which is one month earlier than this one.
	 */
	public Date subtractMonth()
	{
		int newMonth = month;
		int newYear = year;
		if(newMonth < 1)
		{
			newMonth = 12;
			newYear--;
		} // if
		// Day will be corrected in constructor if too high.
		return new Date(day, newMonth, newYear);
	} // subtractMonth

	/**
	 * Constructs a new date which is one year later than given one.
	 * If this date is a leap day, it returns 28th February of the next year.
	 *
	 * @return A new date which is one year later than this one.
	 */
	public Date subtractYear()
	{
		// Day will be corrected in constructor for 29th February.
		return new Date(day, month, year - 1);
	} // subtractYear

	/**
	 * Calculates how many days thus date is from a given other.
	 * If the other date is less than this one, then the distance
	 * is negative. It is non-negative otherwise (including zero
	 * if they represent the same date).
	 *
	 * @param other The other date.
	 *
	 * @return The distance in days.
	 */
	public int daysFrom(Date other)
	{
		// The code here is a prototype
		// -- the result should be computed more efficiently than this!
		if(equals(other))
			return 0;
		else if(lessThan(other))
		{
			Date someDate = addDay();
			int noOfDaysDistance = 1;
			while (someDate.lessThan(other)) {
				someDate = someDate.addDay();
				noOfDaysDistance++;
			} // while
			return noOfDaysDistance;
		} // else if
		else
		{
			Date someDate = subtractDay();
			int noOfDaysDistance = -1;
			while(someDate.greaterThan(other))
			{
				someDate = someDate.subtractDay();
				noOfDaysDistance--;
			} // while
			return noOfDaysDistance;
		} // else
	} // daysFrom

	// Calculate the number of days in the month.
	private int daysInMonth()
	{
		switch(month)
		{
			case 1: return 31;
			case 2: if (isLeapYear()) return 29;
					else 			  return 28;
			case 3: return 31;
			case 4: return 30;
			case 5: return 31;
			case 6: return 30;
			case 7: return 31;
			case 8: return 31;
			case 9: return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;
			default: return 0;
		} // switch
	} // daysInMonth
	// Return true if and only if year is leap year.
	// (ignoring the pre Gregorian Reformation complication -- for now.)
	// Year is a leap year if it is divisible by 4
	// 						and is not divisible by 100
	// 							or is divisible by 400.
	private boolean isLeapYear()
	{
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	} // isLeapYear
} // class Date

