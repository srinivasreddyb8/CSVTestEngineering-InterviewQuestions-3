package main;

import src_classes.*;

public class MainClass 
{

	public static void main(String[] args) 
	{
		GettingInput gi=new GettingInput();
		double initialPrice=gi.getInitialPrice();
		String luxuryStatusInput=gi.getLuxuryStatusInput();
			SetAndGetCost itemToPrice = new SetAndGetCost();
			itemToPrice.setIsLuxury(gi.parseLuxuryStatus(luxuryStatusInput));
			itemToPrice.setCost(initialPrice);
			Boolean ls=itemToPrice.getIsLuxury();
			TotalCost tc=new TotalCost(initialPrice,ls);
			System.out.println("Item cost is: "
					+ tc.calculateCostAfterTax());
	}


}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

