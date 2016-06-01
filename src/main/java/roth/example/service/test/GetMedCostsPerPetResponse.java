package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceResponse;

@Entity
@SuppressWarnings("serial")
public class GetMedCostsPerPetResponse extends HttpServiceResponse
{
	@Property(name = "costs")
	protected double costs;

	public double getCosts() 
	{
		return costs;
	}

	public void setCosts(double costs) 
	{
		this.costs = costs;
	}	
	
}
