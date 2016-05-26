package src_classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TotalCost extends SetAndGetCost
{
	public TotalCost(double cost,Boolean luxuryStatusInput)
	{
		this.cost=cost;
		this.isLuxury=luxuryStatusInput;
	}

	public double calculateCostAfterTax() 
	{
		if (this.isLuxury) 
		{
			if (this.cost * LUXURYTAXRATE >= Double.MAX_VALUE) 
			{
				return Double.MAX_VALUE;
			}
			return this.roundToPennies((this.cost * LUXURYTAXRATE));
		}
		if (this.cost * NECESSITIESTAXRATE >= Double.MAX_VALUE) 
		{
			return Double.MAX_VALUE;
		}
		return this.roundToPennies(this.cost * NECESSITIESTAXRATE);
	}

	public double roundToPennies(double input) 
	{
		BigDecimal value = new BigDecimal(input);
		return value.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
	}


}
