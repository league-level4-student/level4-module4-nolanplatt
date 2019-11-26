package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTest {

	static EncapsulateTheData etd = new EncapsulateTheData();
	
	

	@Test
	public void testGetItemsRecieved() {
		etd.setItemsReceived(50);
        assertEquals(50, etd.getItemsReceived(), "");

	}

}
