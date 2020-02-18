package timeofday;

class TimeOfDay {
	int minutesSinceMidnight;

	int getHours() {
		return this.minutesSinceMidnight / 60;
	}

	int getMinutes() {
		return this.minutesSinceMidnight % 60;
	}

	void setHours(int value) {
		this.minutesSinceMidnight %= 60;
		this.minutesSinceMidnight += value * 60;
	}

	void setMinutes(int value) {
		this.minutesSinceMidnight = this.minutesSinceMidnight / 60 * 60 + value;
	}

}

