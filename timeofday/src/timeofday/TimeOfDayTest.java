package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	class TimeOfDay {
		int hours;
		int minutes;
	}
	
	int getHours(TimeOfDay t) {
		return t.hours;
	}
	
	int getMinutes(TimeOfDay t) {
		return t.minutes;
	}
	
	void setHours(TimeOfDay t, int value) {
		t.hours = value;
	}
	
	void setMinutes(TimeOfDay t, int value) {
		t.minutes = value;
	}

	@Test
	void test() {
		TimeOfDay t = new TimeOfDay();
		assert getHours(t) == 0 && getMinutes(t) == 0;
		setHours(t, getHours(t) + 12);
		assert getHours(t) == 12 && getMinutes(t) == 0;		
	}

}
