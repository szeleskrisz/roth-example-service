package roth.example.test;

import roth.example.service.test.GetPersonRequest;

public class Test
{
	protected static TestClient client = new TestClient();
	
	static 
	{
		TrustUtil.setup();
	}
	
	public static void main(String[] args) throws Exception
	{
		getPerson();
	}
	
	public static void getPerson()
	{
		client.getPerson(new GetPersonRequest().setId(1));
	}
	
}