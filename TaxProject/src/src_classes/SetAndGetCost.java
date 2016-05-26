package src_classes;
 
public class SetAndGetCost extends BaseClass
{

	public SetAndGetCost()
	{	
		this.cost=0;
		this.isLuxury=false;
	}
	public void setCost(double cost) 
	{
	
		this.cost = cost;
	}

	public double getCost()
	{

		return this.cost;
	}

	public void setIsLuxury(Boolean inputIsLuxury) 
	{

		this.isLuxury = inputIsLuxury;
	}

	public Boolean getIsLuxury() 
	{

		return this.isLuxury;
	}


}
