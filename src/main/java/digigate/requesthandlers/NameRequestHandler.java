package digigate.requesthandlers;

public class NameRequestHandler implements RequestHandler 
{
	@Override
	public String getResponse(String request) 
	{
		if ((request == null) || (request.contains("what is your name")))
        	return "Digigate";
		
		return null;
	}
}
