package main;

import java.util.Scanner;

public class GettingInput
{
	Scanner scan = new Scanner(System.in);
	private double initialPrice = -1.0;
	private String luxuryStatusInput = "";
	public double getInitialPrice()
	{
		do 
		{
			System.out
				.println("Input the price of an item as integer or floating point number with decimals");
			initialPrice = parseCostInput(scan.nextLine());
		} while (initialPrice == -1.0);
	
		return this.initialPrice;
	}
	public String getLuxuryStatusInput()
	{
		
		do 
		{
			System.out
					.println("Input 'yes' if this is a luxury item, which covers everything");
			luxuryStatusInput = scan.nextLine();
		} while (!(luxuryStatusInput.toLowerCase().matches("yes") || luxuryStatusInput.toLowerCase()
				.matches("no")));
		return this.luxuryStatusInput;
	}
	
	public static double parseCostInput(String costInput) 
	{
		if (costInput.matches("\\d+\\.\\d")
					|| costInput.matches("\\d+\\.\\d\\d")
					|| costInput.matches("\\d+")) 
		{
			return Double.parseDouble(costInput);
		}
		return -1.0;
	}

	public static Boolean parseLuxuryStatus(String isLuxuryInput) 
	{
		if (isLuxuryInput.toLowerCase().matches("yes")) 
		{
			return true;
		}
			return false;
	}
		

}
