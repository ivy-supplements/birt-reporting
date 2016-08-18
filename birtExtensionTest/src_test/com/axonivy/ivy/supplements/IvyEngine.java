package com.axonivy.ivy.supplements;

public class IvyEngine 
{
	public static String getBaseUrl() 
	{
		String vmArgUrl = System.getProperty("test.engine.url");
		if (vmArgUrl != null) 
		{
			return vmArgUrl;
		}
		// assume designer/inMemory
		return "http://localhost:8081/ivy";
	}
}
