package test_classes;

import org.testng.Assert;
import org.testng.annotations.Test;
import src_classes.TotalCost;

public class TotalCostTests 
{
	
	@Test
	public void necessityTaxCalculationTest()
	{
		double cost = 20.12;
		TotalCost tc=new TotalCost(cost,false);
		double necessityTaxRate = 1.01;
		double expectedValue = tc.roundToPennies(cost * necessityTaxRate);
		Assert.assertTrue(expectedValue == tc.calculateCostAfterTax());
		
	}
	
	@Test
	public void luxuryTaxCalculationTest() 
	{
		TotalCost tc=new TotalCost(20,true);
		double luxuryTaxRate = 1.09;
		double expectedValue = tc.roundToPennies(20 * luxuryTaxRate);
		Assert.assertTrue(expectedValue == tc.calculateCostAfterTax());
	}

}
