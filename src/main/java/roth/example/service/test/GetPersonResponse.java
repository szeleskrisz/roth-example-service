package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceResponse;

@Entity
@SuppressWarnings("serial")
public class GetPersonResponse extends HttpServiceResponse
{
	@Property(name = "id")
	protected int id;

	@Property(name = "firstName")
	protected String firstName;

	@Property(name = "lastName")
	protected String lastName;

	@Property(name = "phone")
	protected String phone;

	@Property(name = "email")
	protected String email;

	@Property(name = "active")
	protected boolean active;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public boolean isActive()
	{
		return active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	
}
