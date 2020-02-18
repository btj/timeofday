package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	@Test
	void test() {
		TimeOfDay t = new TimeOfDay();
		assert t.getHours() == 0 && t.getMinutes() == 0;
		t.setHours(t.getHours() + 12);
		t.setMinutes(15);
		assert t.getHours() == 12 && t.getMinutes() == 15;	
	}

}
