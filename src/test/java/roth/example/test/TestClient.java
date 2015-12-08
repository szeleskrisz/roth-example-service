package roth.example.test;

import roth.example.service.test.GetPersonRequest;
import roth.example.service.test.GetPersonResponse;
import roth.lib.java.api.JsonApiClient;
import roth.lib.java.net.http.HttpUrl;

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
}
