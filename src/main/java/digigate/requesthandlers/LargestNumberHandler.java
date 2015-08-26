package digigate.requesthandlers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LargestNumberHandler implements RequestHandler
{
	@Override
	public String getResponse(String request) 
	{
		Matcher matcher = Pattern.compile(".*which of the following numbers is the largest: (.+)").matcher(request);
	    if (matcher.matches()) 
	    {
	        String[] numbersAsStrings = matcher.group(1).split(", ");
	        
	        int largest = Integer.MIN_VALUE;
	        for (String nextNumber : numbersAsStrings)
	        	largest = Math.max(largest, Integer.parseInt(nextNumber));
	        return Integer.toString(largest);
	    }
	    
	    return null;
	}
}
