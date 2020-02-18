package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	class TimeOfDay {
		int minutesSinceMidnight;
	}
	
	int getHours(TimeOfDay t) {
		return t.minutesSinceMidnight / 60;
	}
	
	int getMinutes(TimeOfDay t) {
		return t.minutesSinceMidnight % 60;
	}
	
	void setHours(TimeOfDay t, int value) {
		// t.minutesSinceMidnight = t.minutesSinceMidnight % 60;
		t.minutesSinceMidnight %= 60;
		t.minutesSinceMidnight += value * 60;
	}
	
	void setMinutes(TimeOfDay t, int value) {
		t.minutesSinceMidnight = t.minutesSinceMidnight / 60 * 60 + value;
	}

	@Test
	void test() {
		TimeOfDay t = new TimeOfDay();
		assert getHours(t) == 0 && getMinutes(t) == 0;
		setHours(t, getHours(t) + 12);
		setMinutes(t, 15);
		assert getHours(t) == 12 && getMinutes(t) == 15;	
	}

}
