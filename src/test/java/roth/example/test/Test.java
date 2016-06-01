package roth.example.test;

import java.util.Arrays;
import java.util.List;

import roth.example.service.test.CreatePetRequest;
import roth.example.service.test.FindMedRecsByPetIdRequest;
import roth.example.service.test.GetMedCostsPerPetRequest;
import roth.example.service.test.GetPersonRequest;
import roth.example.service.test.GetPetRequest;

public class Test
{
	protected static TestClient client = new TestClient();
	
	static 
	{
		TrustUtil.setup();
	}
	
	public static void main(String[] args) throws Exception
	{
		// Test functions
		//getPerson();
		getPet();
		//createPet();
		//findMedRecsByPetId();
		//getMedicalCostsPerPet();
	}
	
	public static void getPerson()
	{		
		client.getPerson(new GetPersonRequest().setId(3));
	}
	
	public static void getPet()
	{
		client.getPet(new GetPetRequest().setId(3));
	}	
	
	public static void createPet()
	{
		CreatePetRequest createPetRequest = new CreatePetRequest();
		List<String> animalList = Arrays.asList("dog", "cat", "pig", "snake", "spider", "horse", "rat");
		List<String> genderList = Arrays.asList("f", "m");		
		for(int i = 0; i < 5; i++)
		{
			//generating a random age between 0 and 9
			int randAge = (int) (Math.random()*10); 
			createPetRequest.setAge(randAge);
			//generating a random animal to the request from the animalList
			int animalIndex = (int) (Math.random()*7);
			String animal = (String) animalList.get(animalIndex);
			createPetRequest.setAnimal(animal);
			//generating a random gender 
			double rand = Math.random();	
			int genderIndex;	
			genderIndex = (rand <= 0.5) ? 0:1;
			String gender = (String) genderList.get(genderIndex);
			createPetRequest.setGender(gender);
			//generating a random keeperId
			int randKeeperId = (int) (1 + Math.random()*12); 
			createPetRequest.setKeeperId(randKeeperId);
			//generating a NickName
			createPetRequest.setNickName("PetName" + i);
			
			client.createPet(createPetRequest);
		}		
	}
	
	public static void findMedRecsByPetId()
	{
		client.findMedRecsByPetId(new FindMedRecsByPetIdRequest().setId(4));
	}
	
	public static void getMedicalCostsPerPet()
	{
		client.getMedicalCostsPerPet(new GetMedCostsPerPetRequest().setId(4));
	}
	
}