package timeofday;

class TimeOfDay {
	int minutesSinceMidnight;

	int getHours() {
		return minutesSinceMidnight / 60;
	}

	int getMinutes() {
		return minutesSinceMidnight % 60;
	}

	void setHours(int value) {
		minutesSinceMidnight %= 60;
		minutesSinceMidnight += value * 60;
	}

	void setMinutes(int value) {
		minutesSinceMidnight = minutesSinceMidnight / 60 * 60 + value;
	}

}

