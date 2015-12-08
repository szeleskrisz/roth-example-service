package roth.example.service;

import roth.example.data.Db;
import roth.lib.java.service.HttpService;
import roth.lib.java.service.reflector.MethodReflector;

public class AptexxService extends HttpService
{
	protected Db db;
	
	public AptexxService()
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
	
}
