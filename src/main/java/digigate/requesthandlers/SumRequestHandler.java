package digigate.requesthandlers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumRequestHandler implements RequestHandler
{
	private String[] patterns = new String[] {
			".*what is the sum of (\\d+) and (\\d+)",
			".*what is (\\d+) plus (\\d+)"
	};
	
	@Override
	public String getResponse(String request)
	{
		for (String nextPattern : patterns)
		{
			Matcher additionMatcher = Pattern.compile(nextPattern).matcher(request);
		    if (additionMatcher.matches()) 
		    {
		        return String.valueOf(Integer.parseInt(additionMatcher.group(1))
		                + Integer.parseInt(additionMatcher.group(2)));
		    }
		}
	    
	    return null;
	}
}
