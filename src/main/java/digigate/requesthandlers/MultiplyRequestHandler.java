package digigate.requesthandlers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiplyRequestHandler implements RequestHandler{

	@Override
	public String getResponse(String request) {
		Matcher additionMatcher = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(request);
	    if (additionMatcher.matches()) 
	    {
	        return String.valueOf(Integer.parseInt(additionMatcher.group(1))
	                * Integer.parseInt(additionMatcher.group(2)));
	    }
		return null;
	}

}
