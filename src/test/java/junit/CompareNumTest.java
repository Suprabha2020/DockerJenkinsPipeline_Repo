package junit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompareNumTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Case ");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Grater number is validated");
		assertTrue("Num 1 is greater than Num 2", CompareNum.isGreater(6, 3));
	}

	

	@Test
	public void isLesserTest() {
		System.out.println("Lesser number is validated");
		assertTrue("Num 1 is lesser than Num 2", CompareNum.isLesser(2, 3));
	}

	
	@Test
	public void isEqualTest() {
		System.out.println("Equal numbers are validated");
		assertTrue("Num 1 is equal to Num 2", CompareNum.isEqual(8, 8));
	}

	@After
	public void after() {
		System.out.println("After Test Case ");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
