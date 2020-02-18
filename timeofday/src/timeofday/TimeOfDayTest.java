package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	@Test
	void test() {
		TimeOfDay t = new TimeOfDay();
		assert TimeOfDay.getHours(t) == 0 && TimeOfDay.getMinutes(t) == 0;
		TimeOfDay.setHours(t, TimeOfDay.getHours(t) + 12);
		TimeOfDay.setMinutes(t, 15);
		assert TimeOfDay.getHours(t) == 12 && TimeOfDay.getMinutes(t) == 15;	
	}

}
