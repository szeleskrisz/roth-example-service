package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceRequest;

@Entity
@SuppressWarnings("serial")
public class GetPetRequest extends HttpServiceRequest
{
	@Property(name = "id")
	protected int id;

	public int getId() {
		return id;
	}

	public GetPetRequest setId(int id) 
	{
		this.id = id;
		return this;
	}
}
