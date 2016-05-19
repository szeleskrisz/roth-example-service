package roth.example.service;

import roth.example.data.Db;
import roth.lib.java.service.HttpError;
import roth.lib.java.service.HttpService;
import roth.lib.java.service.reflector.MethodReflector;

public class Service extends HttpService
{
	protected Db db;
	
	public Service()
	{
		this.db = Db.get();
	}
	
	@Override
	public boolean isAjaxAuthenticated(MethodReflector methodReflector)
	{
		return true;
	}
	
	@Override
	public boolean isApiAuthenticated(MethodReflector methodReflector)
	{
		return true;
	}
	
	@Override
	public boolean isAuthorized(MethodReflector methodReflector, Object request) 
	{
		return true;
	}
	
	@Override
	public HttpError exception(HttpError error, Throwable e)
	{
		// log
		return error;
	}
	
}
