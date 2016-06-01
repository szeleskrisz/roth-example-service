package roth.example.data.model;

import roth.example.data.Db;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.mysql.MysqlDbModel;

@Entity(name = "medicalRecord")
@SuppressWarnings("serial")
public class MedicalRecord extends MysqlDbModel
{
	protected transient Db db;
	
	@Property(name = "id", id = true, generated = true)
	protected int id;
	
	@Property(name = "visitDate")
	protected String visitDate;
	
	@Property(name = "animalId")
	protected int animalId;
	
	@Property(name = "visitType")
	protected String visitType;
	
	@Property(name = "fee")
	protected double fee;
	
	@Property(name = "notes")
	protected String notes;
		
	public MedicalRecord() 
	{
	
	}
	
	@Override
	public Db getDb()
	{
		return db;
	}
	
	@Override
	public MedicalRecord setDb(Jdbc db) 
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

	public String getVisitDate() 
	{
		return visitDate;
	}

	public void setVisitDate(String visitDate) 
	{
		this.visitDate = setDirty("visitDate", this.visitDate, visitDate);
	}

	public int getAnimalId() 
	{
		return animalId;
	}

	public void setAnimalId(int animalId) 
	{
		this.animalId = setDirty("animalId", this.animalId, animalId);
	}

	public String getVisitType() 
	{
		return visitType;
	}

	public void setVisitType(String visitType) 
	{
		this.visitType = setDirty("visitType", this.visitType, visitType);
	}

	public double getFee() 
	{
		return fee;
	}

	public void setFee(double fee) 
	{
		this.fee = setDirty("fee", this.fee, fee);
	}

	public String getNotes() 
	{
		return notes;
	}

	public void setNotes(String notes) 
	{
		this.notes = setDirty("notes", this.notes, notes);
	}	
}
