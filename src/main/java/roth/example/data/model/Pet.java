package roth.example.data.model;

import roth.example.data.Db;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.mysql.MysqlDbModel;

@Entity(name = "pet")
@SuppressWarnings("serial")
public class Pet  extends MysqlDbModel
{
	protected transient Db db;
	
	@Property(name = "id", id = true, generated = true)
	protected int id;
	
	@Property(name = "nickName")
	protected String nickName;
		
	@Property(name = "keeperId")
	protected int keeperId;
		
	@Property(name = "animal")
	protected String animal;
	
	@Property(name = "gender")
	protected String gender;
	
	@Property(name = "age")
	protected int age;
	
	public Pet() 
	{
	
	}
	
	@Override
	public Db getDb()
	{
		return db;
	}
	
	@Override
	public Pet setDb(Jdbc db) 
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

	public String getNickName() 
	{
		return nickName;
	}

	public void setNickName(String nickName) 
	{
		this.nickName = setDirty("nickName", this.nickName, nickName);
	}
	
	public int getKeeperId() 
	{
		return keeperId;
	}

	public void setKeeperId(int keeperId) 
	{
		this.keeperId = setDirty("keeperId", this.keeperId, keeperId);		
	}

	public String getAnimal() 
	{
		return animal;
	}

	public void setAnimal(String animal) 
	{
		this.animal = setDirty("animal", this.animal, animal);
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = setDirty("gender", this.gender, gender);
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = setDirty("age", this.age, age);
	}
}
