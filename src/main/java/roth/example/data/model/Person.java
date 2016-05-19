package roth.example.data.model;

import roth.example.data.Db;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.mysql.MysqlDbModel;

@Entity(name = "person")
@SuppressWarnings("serial")
public class Person extends MysqlDbModel
{
	protected transient Db db;
	
	@Property(name = "id", id = true, generated = true)
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
	
	public Person()
	{
		
	}
	
	@Override
	public Db getDb()
	{
		return db;
	}
	
	@Override
	public Person setDb(Jdbc db)
	{
		if(db instanceof Db)
		{
			this.db = (Db) db;
		}
		return this;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = setDirty("firstName", this.firstName, firstName);
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = setDirty("lastName", this.lastName, lastName);
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = setDirty("phone", this.phone, phone);
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = setDirty("email", this.email, email);
	}
	
	public boolean isActive() 
	{
		return active;
	}
	
	public void setActive(boolean active)
	{
		this.active = setDirty("active", this.active, active);
	}

}
