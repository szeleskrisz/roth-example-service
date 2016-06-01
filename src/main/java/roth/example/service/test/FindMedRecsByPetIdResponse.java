package roth.example.service.test;

import java.util.List;

import roth.example.data.model.MedicalRecord;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceResponse;

@Entity
@SuppressWarnings("serial")
public class FindMedRecsByPetIdResponse extends HttpServiceResponse 
{	
	@Property(name = "medRecs")
	protected List<MedicalRecord> medRecs;

	public List<MedicalRecord> getMedRecs() 
	{
		return medRecs;
	}

	public void setMedRecs(List<MedicalRecord> medRecs) 
	{
		this.medRecs = medRecs;
	}
}
