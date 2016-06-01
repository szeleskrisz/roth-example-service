package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceRequest;

@Entity
@SuppressWarnings("serial")
public class CreatePetRequest extends HttpServiceRequest 
{	
	@Property(name = "keeperId")
	protected int keeperId;
	
	@Property(name = "nickName")
	protected String nickName;
	
	@Property(name = "animal")
	protected String animal;
	
	@Property(name = "gender")
	protected String gender;
	
	@Property(name = "age")
	protected int age;

	public int getKeeperId() 
	{
		return keeperId;		
	}

	public void setKeeperId(int keeperId) 
	{
		this.keeperId = keeperId;
	}

	public String getNickName() 
	{
		return nickName;
	}

	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}

	public String getAnimal() 
	{
		return animal;
	}

	public void setAnimal(String animal) 
	{
		this.animal = animal;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
}
