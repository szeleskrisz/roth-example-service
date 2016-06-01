package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceResponse;

@Entity
@SuppressWarnings("serial")
public class CreatePetResponse extends HttpServiceResponse
{
	@Property(name = "id")
	protected int id;	
		
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
