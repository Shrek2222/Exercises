package test;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingTest {
	ch7.Testing tst = new ch7.Testing();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMain() {
		try {
			tst.testParse("10");
			tst.testParse("10", 10);
			tst.testParse("10", 16); 
			tst.testParse("11");
			tst.testParse("11", 10);
			tst.testParse("11", 16);			
		} catch (Exception e) {
			fail();
		}
	}

}
