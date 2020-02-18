package timeofday;

/**
 * An instance of this class stores a time of day with 1 minute granularity.
 * 
 * @invar The hours are between 0 and 23
 *      | 0 <= getHours() && getHours() <= 23
 * @invar The minutes are between 0 and 59
 *      | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 60 * 24 (exclusive)
	 *      | 0 <= minutesSinceMidnight && minutesSinceMidnight < 60 * 24
	 */
	private int minutesSinceMidnight;
	
	/**
	 * Initializes this object with the given hours and minutes.
	 * 
	 * @pre The given hours are between 0 and 23
	 *    | 0 <= hours && hours <= 23
	 * @pre The given minutes are between 0 and 59
	 *    | 0 <= minutes && minutes <= 59
	 * @post This object's hours equal the given hours
	 *    | getHours() == hours
	 * @post This object's minutes equal the given minutes
	 *    | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		minutesSinceMidnight = 60 * hours + minutes;
	}

	public int getHours() {
		return minutesSinceMidnight / 60;
	}

	public int getMinutes() {
		return minutesSinceMidnight % 60;
	}

}

