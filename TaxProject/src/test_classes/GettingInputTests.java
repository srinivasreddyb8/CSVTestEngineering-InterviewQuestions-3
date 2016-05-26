package test_classes;

import org.testng.Assert;
import org.testng.annotations.Test;
import main.GettingInput;

public class GettingInputTests
{
	@Test
	public void testIntegerData()
	{
		Assert.assertTrue(-1.0 != GettingInput.parseCostInput("120"));
	}
		
	@Test
	public void testNegativeDataRejection()
	{
		Assert.assertTrue(-1.0 == GettingInput.parseCostInput("-13.04"));
	}
		
	@Test
	public void testOutOfRangeValue()
	{
			Assert.assertTrue(-1.0 == GettingInput.parseCostInput("141.002342"));
	}
	
	@Test
	public void testBaddataRejection()
	{
		Assert.assertTrue(-1.0 == GettingInput.parseCostInput("hello world"));
	}
	
}



