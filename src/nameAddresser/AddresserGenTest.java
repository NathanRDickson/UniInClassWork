package nameAddresser;

import static org.junit.jupiter.api.Assertions.*;

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
		String output = nathan.fullName("nÄthÄn ", "RichÄrd ", " dickson");
		assertEquals("N R DICKSON", output);
	}
	
	@Test
	void test6() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nathan ", "Richard ", " dicKson");
		assertEquals("N R DICKSON", output);
	}
	
	@Test
	void test7() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nÄthÄn ", "RichÄrd ", " dicksön");
		assertEquals("N R DICKSÖN", output);
	}
	
	@Test
	void test8() {
		AddresserGen nathan = new AddresserGen();
		String output = nathan.fullName("nÄthÄn ", "RichÄrd ", " فارص");
		assertEquals("N R فارص", output);
	}

}
