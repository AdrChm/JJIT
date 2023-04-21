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
	 * The date must not have already been set.
	 *
	 * @param requiredPresentDate The required date for the present day.
	 *
	 * @throws DateException if present date has already been set or if given
	 * 					 date is null.
	 */
	public static void setPresentDate(Date requiredPresentDate) throws DateException
	{
		if (requiredPresentDate == null)
			throw new DateException("Present date cannot be set to null.");
		if (presentDate != null)
			throw new DateException("Present date has already been set.");

		presentDate = requiredPresentDate;
	} // setPresentDate

	/**
	 * Gets the present date.
	 *
	 * @return The present date, or null if it has not been set.
	 *
	 * @throws DateException if present date has not been set.
	 */
	public static Date getPresentDate() throws DateException
	{
		if (presentDate == null)
			throw new DateException("Present date has not been set.");
		return presentDate;
	} // getPresentDate

	// Instance variables: the day, month and year of a date.
	private final int day, month, year;

	/**
	 * Constructs a date, given the three components.
	 *
	 * @param requiredDay The required day.
	 * @param requiredMonth The required month.
	 * @param requiredYear The required year.
	 *
	 * @throws DateException if the date components do not form a legal date since
	 * 					 the start od 1753 (post Gregorian Reformation).
	 */
	// Construct a date -- given the required day, month and year.
	public Date(int requiredDay, int requiredMonth, int requiredYear)
			throws DateException
	{
		year = requiredYear;
		month = requiredMonth;
		day = requiredDay;

		// Now check these components are legal, throw exception if not.
		checkDateIsLegal();
	} // Date

	private void checkDateIsLegal() throws DateException
	{
		if (year < 1753)
			throw new DateException("Year " + year + " must be >= 1753");

		if (month < 1 ||  month > 12)
			throw new DateException("Month " + month + " must be from 1 to 12");

		if (day < 1 ||  day > daysInMonth())
			throw new DateException("Day " + month + " must be from 1 to " + daysInMonth()
								+ " for " + month + "/" + year);

	} // checkDateIsLegal

	/**
	 *  Constructs a date, given a String holding the
	 *  day/month/year representation of the date.
	 *
	 * @param dateString The required date as day/month/year.
	 *
	 * @throws DateException if dateString is not legal.
	 */
	public Date(String dateString) throws DateException
	{
		try
		{
			String [] dateElements = dateString.split("/");
			if(dateElements.length > 3)
				// This date exception will be caught below.
				throw new DateException("Too many date elements");

			day = Integer.parseInt(dateElements[0]);
			month = Integer.parseInt(dateElements[1]);
			year = Integer.parseInt(dateElements[2]);

		} // try
		catch (DateException exception)
		{
			throw new DateException("Date '" + dateString + "' is not in day/month/year format", exception);
		} // catch
		// If we get to here, we just check if the date components are legal.
		checkDateIsLegal();
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
	 * Any single digit values have 0 added to keep exactly 2 spaces
	 * occupied by single value.
	 *
	 * @return A String day/month/year representation of this date.
	 */
	public String toString()
	{
		return String.format("%02d/%02d/%02d", day, month, year);
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
	 *
	 * @throws NullPointerException if other is null.
	 */
	public int compareTo(Date other) throws NullPointerException
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
	 *
	 * @throws NullPointerException if other is null.
	 */
	public boolean equals(Date other) throws NullPointerException
	{
		return compareTo(other) == 0;
	} // equals
	/**
	 * Compare this date with a given other one, for less than.
	 *
	 * @param other The other date to compare with.
	 *
	 * @return true if and only if this date is less than the other.
	 *
	 * @throws NullPointerException if other is null.
	 */
	public boolean lessThan(Date other) throws NullPointerException
	{
		return compareTo(other) < 0;
	} // lessThan
	/**
	 * Compare this date with a given other one, for less than.
	 *
	 * @param other The other date to compare with.
	 *
	 * @return true if and only if this date is greater than the other.
	 *
	 * @throws NullPointerException if other is null.
	 */
	public boolean greaterThan(Date other) throws NullPointerException
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
		// First try the obvious.
		try { return new Date(day + 1, month, year); }
		catch (DateException exception1)
		{
			// Okay, so day must have been the last in the month.
			// Now try the first of the next month.
			try { return new Date(1, month + 1, year); }
			catch (DateException exception2)
			{
				// Okay, so month must have been 12.
				// Now try the first of the next year.
				// This cannot cause an exception.
				return new Date(1, 1, year + 1);
			}	// catch
		}	// catch
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
		// First try the obvious.
		try { return new Date(day, month + 1, year); }
		catch (DateException monthException)
		{
			// Okay, so month must have been 12.
			// Now try the first of the next year.
			// This cannot cause a date exception.
			return new Date(day, 1, year + 1);

		}	// catch

	} // addMonth

	/**
	 * Constructs a new date which is one year later than given one.
	 * If this date is a leap day, it returns 28th February of the next year.
	 *
	 * @return A new date which is one year later than this one.
	 */
	public Date addYear()
	{
		// This cannot cause a date exception, but Java does not know that.
			if(month == 2 && day == 29)
				return new Date(28,month,year + 1);
			else
				return new Date(day, month, year + 1);

	} // addYear

	/**
	 * Constructs a new date which is one day earlier than this one.
	 * This can throw an date exception
	 * if the new date is earlier than the start of 1753.
	 *
	 * @return A new date which is one day earlier than this one.
	 *
	 * @throws DateException if the new date is earlier than the start of 1753.
	 */
	public Date subtractDay() throws DateException
	{
		// First try the obvious.
		try { return new Date(day - 1, month, year); }
		catch (DateException dayException)
		{
			// Okay, so day must have been the first in the month.
			// Now try the last of the previous month.
			try { return new Date(daysInMonth(month - 1, year), month - 1, year); }
			catch (DateException monthException)
			{
				// Okay, so month must have been 1.
				// Now try the first of the previous year.
				// This cannot cause a date exception.
				return new Date(daysInMonth(12, year - 1), 12, year - 1);
			} // catch

		}	// catch

	} // subtractDay

	/**
	 * Constructs a new date which is one month earlier than this one.
	 * This can throw an exception
	 * if the new date is earlier than the start of 1753.
	 * If the day is too large for that month, it is truncated to
	 * the number of days in that month.
	 *
	 * @return A new date which is one month earlier than this one.
	 *
	 * @throws DateException if the new date is earlier than the start of 1753.
	 */
	public Date subtractMonth() throws DateException
	{
		// First try the obvious.
		try { return new Date(day, month - 1, year); }
		catch (DateException monthException)
		{
			// Okay, so month must have been 1.
			// Now try the first of the previous year.
			// This cannot cause a date exception.
			return new Date(day, 1, year - 1);
		} // catch

	} // subtractMonth

	/**
	 * Constructs a new date which is one year later than given one.
	 * This can throw an exception
	 * if the new date is earlier than the start of 1753.
	 * If this date is a leap day, it returns 28th February of the next year.
	 *
	 * @return A new date which is one year later than this one.
	 *
	 * @throws DateException if the new date is earlier than the start of 1753.
	 */
	public Date subtractYear() throws DateException
	{
		try{
			if (day == 29 && month == 2)
				return new Date(28, month, year - 1);
			else
				return new Date(day, month, year - 1);
		} // try
		catch (DateException exception) { return null; }
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
	 *
	 * @throws NullPointerException if the other is null.
	 */
	public int daysFrom(Date other) throws NullPointerException
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
			try // We should not get a date exception form subtractDay,
				// because target date is legal. But Java does not know this.
			{
				Date someDate = subtractDay();
				int noOfDaysDistance = -1;
				while(someDate.greaterThan(other))
				{
					someDate = someDate.subtractDay();
					noOfDaysDistance--;
				} // while
				return noOfDaysDistance;
			} // try
			// java does not know we cannot get a date exception.
			catch (Exception e) { return 0; }
	} // daysFrom

	// Calculate the number of days in the month.
	private int daysInMonth()
	{
		return daysInMonth(month, year);
	} // daysInMonth

	// Number of days in each month for normal and leap years.
	// The first index (0) is not used.
	private static final int[]
		DAYS_PER_MONTH_NON_LEAP_YEAR
			// Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec
		 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		DAYS_PER_MONTH_LEAP_YEAR
		 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	// Calculate the number of days in a given month for a given year.
	// This will never be called with a month out of range 1 to 12.
	private static int daysInMonth(int month, int year)
	{
		if(isLeapYear(year))
			return DAYS_PER_MONTH_LEAP_YEAR[month];
		else
			return DAYS_PER_MONTH_NON_LEAP_YEAR[month];
	} // daysInMonth

	// Return true if and only if year is leap year.
	// (ignoring the pre Gregorian Reformation complication -- for now.)
	// Year is a leap year if it is divisible by 4
	// 						and is not divisible by 100
	// 							or is divisible by 400.
	private static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	} // isLeapYear

} // class Date