package digigate.requesthandlers;

public class TriviaRequestHandler implements RequestHandler
{
	@Override
	public String getResponse(String request) 
	{
		if (request.contains("who is the Prime Minister of Great Britain"))
			return "David Cameron";
		if (request.contains("who played James Bond in the film Dr No"))
			return "Sean Connery";
		if (request.contains("which city is the Eiffel tower in"))
			return "Paris";
		if (request.contains("what currency did Spain use before the Euro"))
			return "Peseta";
		return null;
	}
}
