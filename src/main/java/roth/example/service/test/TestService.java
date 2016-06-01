package roth.example.service.test;

import java.util.List;

import roth.example.data.model.MedicalRecord;
import roth.example.data.model.Person;
import roth.example.data.model.Pet;
import roth.example.data.table.MedicalRecordTable;
import roth.example.data.table.PersonTable;
import roth.example.data.table.PetTable;
import roth.lib.java.service.annotation.Service;
import roth.lib.java.service.annotation.ServiceMethod;

@Service(name = "test")
public class TestService extends roth.example.service.Service
{	
	@ServiceMethod(api = true, ajax = false)
	public GetPersonResponse getPerson(GetPersonRequest request)
	{
		GetPersonResponse response = new GetPersonResponse();
		Person person = PersonTable.get(db).findById(request.getId());
		if(person != null)
		{
			response.setId(person.getId());
			response.setFirstName(person.getFirstName());
			response.setLastName(person.getLastName());
			response.setEmail(person.getEmail());
			response.setPhone(person.getPhone());
			response.setActive(person.isActive());
		}
		return response;
	}
	
	@ServiceMethod(api = true, ajax = false)
	public GetPetResponse getPet(GetPetRequest request)
	{
		GetPetResponse response = new GetPetResponse();
		Pet pet = PetTable.get(db).findById(request.getId());
		if(pet != null)
		{
			response.setId(pet.getId());
			response.setNickName(pet.getNickName());
			response.setKeeperId(pet.getKeeperId());
			response.setAge(pet.getAge());
			response.setAnimal(pet.getAnimal());
			response.setGender(pet.getGender());
		}
		return response;
	}
	
	@ServiceMethod(api = true, ajax = false)
	public CreatePetResponse createPet(CreatePetRequest request)
	{		
		CreatePetResponse response = new CreatePetResponse();
		Pet pet = new Pet().setDb(db);
		pet.setAge(request.getAge());
		pet.setAnimal(request.getAnimal());
		pet.setGender(request.getGender());
		pet.setKeeperId(request.getKeeperId());
		pet.setNickName(request.getNickName());		
		pet.insert();			
		//setting the id of the inserted Pet to the response
		response.setId(pet.getId());
		
		return response;
	}
	
	@ServiceMethod(api = true, ajax = false)
	public FindMedRecsByPetIdResponse findMedRecsByPetId(FindMedRecsByPetIdRequest request)
	{
		FindMedRecsByPetIdResponse response = new FindMedRecsByPetIdResponse();		
		List<MedicalRecord> medRecs = MedicalRecordTable.get(db).findAllByPetId(request.getId());			
		//setting the list of the MedicalRecords to the response 
		response.setMedRecs(medRecs);		
		return response;
	}	
	
	@ServiceMethod(api = true, ajax = false)
	public GetMedCostsPerPetResponse getMedCostsPerPet(GetMedCostsPerPetRequest request)
	{
		GetMedCostsPerPetResponse response = new GetMedCostsPerPetResponse();		
		try
		{
			double totalCost = MedicalRecordTable.get(db).getMedicalCostsPerPet(request.getId());
			response.setCosts(totalCost);
		} 
		catch(Exception e)
		{
			System.out.println("The requested pet has no medical records");
			response.setCosts(0);
		}				
		return response;
	}
}
