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

	public int getHours() {
		return minutesSinceMidnight / 60;
	}

	public int getMinutes() {
		return minutesSinceMidnight % 60;
	}

	/**
	 * Sets the hours of this TimeOfDay object.
	 * 
	 * @pre The given value is between 0 and 23
	 *    | 0 <= value && value <= 23
	 * @post This object's hours equal the given value.
	 *    | getHours() == value
	 * @post This object's minutes remained unchanged.
	 *    | getMinutes() == old(getMinutes())
	 */
	public void setHours(int value) {
		minutesSinceMidnight %= 60;
		minutesSinceMidnight += value * 60;
	}

	/**
	 * Sets the minutes of this TimeOfDay object.
	 * 
	 * @pre The given value is between 0 and 59
	 *    | 0 <= value && value <= 59
	 * @post This object's minutes equal the given value.
	 *    | getMinutes() == value
	 * @post This object's hours remained unchanged.
	 *    | getHours() == old(getHours())
	 */
	public void setMinutes(int value) {
		minutesSinceMidnight = minutesSinceMidnight / 60 * 60 + value;
	}

}

