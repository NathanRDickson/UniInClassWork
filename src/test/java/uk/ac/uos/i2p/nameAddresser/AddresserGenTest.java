package test.java.uk.ac.uos.i2p.nameAddresser;

import static org.junit.jupiter.api.Assertions.*;
import main.java.uk.ac.uos.i2p.nameAddresser.*;

import org.junit.jupiter.api.Test;

class AddresserGenTest {

	@Test
	void test() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("Nathan", "Richard", "Dickson");
		assertEquals("N R DICKSON", output);
	}
	
	@Test
	void test2() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan", "richard", "dickson");
		assertEquals("N R DICKSON", output);
	}
	
	@Test
	void test3() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan", " ", "dickson");
		assertEquals("N DICKSON", output);
	}
	
	@Test
	void test4() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan ", "Richard ", " dickson");
		assertEquals("N R DICKSON", output);
	}
	
	@Test
	void test5() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan ", "Richard ", " dickson");
		assertEquals("N R DICKSON", output);
	}
	
	@Test
	void SpecialChar() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan ", "Richard ", " dicksön");
		assertEquals("N R DICKSÖN", output);
	}
	
	@Test
	void NullValueTests() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan ", null , " dickson");
		String output2 = nathan.fullName(null, "Richard" , "Dickson");
		String output3 = nathan.fullName("Nathan", "Richard" , null);
		String output4 = nathan.fullName(null, null , null);
		
		assertEquals("N DICKSON", output);
		assertEquals("Name not valid", output2);
		assertEquals("Name not valid", output3);
		assertEquals("Name not valid", output4);

	}
	


}
