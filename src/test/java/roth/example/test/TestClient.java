package roth.example.test;

import roth.example.service.test.CreatePetRequest;
import roth.example.service.test.CreatePetResponse;
import roth.example.service.test.FindMedRecsByPetIdRequest;
import roth.example.service.test.FindMedRecsByPetIdResponse;
import roth.example.service.test.GetMedCostsPerPetRequest;
import roth.example.service.test.GetMedCostsPerPetResponse;
import roth.example.service.test.GetPersonRequest;
import roth.example.service.test.GetPersonResponse;
import roth.example.service.test.GetPetRequest;
import roth.example.service.test.GetPetResponse;
import roth.lib.java.api.JsonApiClient;
import roth.lib.java.http.HttpUrl;

public class TestClient extends JsonApiClient<Object, Object>
{
	
	public TestClient()
	{
		super(true);
	}

	@Override
	protected HttpUrl url()
	{
		return new HttpUrl("https://localhost:8443/endpoint/service/test/");
	}
	
	public GetPersonResponse getPerson(GetPersonRequest request)
	{
		return post(url().addPath("getPerson"), request, GetPersonResponse.class);
	}
	
	public GetPetResponse getPet(GetPetRequest request)
	{
		return post(url().addPath("getPet"), request, GetPetResponse.class);
	}
	
	public CreatePetResponse createPet(CreatePetRequest request)
	{
		return post(url().addPath("createPet"), request, CreatePetResponse.class);
	}

	public FindMedRecsByPetIdResponse findMedRecsByPetId(FindMedRecsByPetIdRequest request) {
		
		return post(url().addPath("findMedRecsByPetId"), request, FindMedRecsByPetIdResponse.class);
	}
	
	public GetMedCostsPerPetResponse getMedicalCostsPerPet(GetMedCostsPerPetRequest request) 
	{
		return post(url().addPath("getMedCostsPerPet"), request, GetMedCostsPerPetResponse.class);		
	}
	
}
