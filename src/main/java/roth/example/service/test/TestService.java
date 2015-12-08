package roth.example.service.test;

import roth.example.data.model.Person;
import roth.example.data.table.PersonTable;
import roth.example.service.AptexxService;
import roth.lib.java.service.annotation.Service;
import roth.lib.java.service.annotation.ServiceMethod;

@Service(name = "test")
public class TestService extends AptexxService
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
	
}
