package roth.example.service;

import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import roth.example.service.test.TestService;
import roth.lib.java.service.HttpEndpoint;

@SuppressWarnings("serial")
public class Endpoint extends HttpEndpoint
{
	static
	{
		TimeZone.setDefault(TimeZone.getTimeZone("America/Denver"));
		register(TestService.class);
	}
	
	@Override
	public void exception(HttpServletRequest request, HttpServletResponse response, Throwable e)
	{
		// log
	}

}
