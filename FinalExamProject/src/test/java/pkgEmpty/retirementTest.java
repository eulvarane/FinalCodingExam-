package pkgEmpty;

import static org.junit.Assert.*;


import org.junit.Test;

public class retirementTest {

	@Test
	public void AmountToSave() {
		
		Double iExpectedAmountToSave = 554.13;
		// Create instance to test
		Retirement ret = new Retirement(40, 7, 20, 2,10000, 2642);

		// Compare expected value with actual value
		assertEquals(iExpectedAmountToSave, ret.AmountToSave(), 554.13);
	
	}

	
	@Test
	public void TotalAmountSaved() {
		Double iExpectedTotalAmountSaved = 1454485.55;
		// Create instance to test
		Retirement ret = new Retirement(40, 7, 20, 2,10000, 2642);
		// Compare expected value with actual value
		assertEquals( iExpectedTotalAmountSaved, ret.TotalAmountSaved(), 1454485.55);
	
	}

}

