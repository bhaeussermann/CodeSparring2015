package digigate.requesthandlers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SquareCubeRequestHandler implements RequestHandler {

	@Override
	public String getResponse(String request) {
		Matcher matcher = Pattern
				.compile(
						".*which of the following numbers is both a square and a cube: (.+)")
				.matcher(request);
		
		String resultList = "";
		
		if (matcher.matches()) {
			String list[] = matcher.group(1).split(", ");
			for (String numberFromList : list) 
			{
				int number = Integer.parseInt(numberFromList);
				double root = Math.sqrt(number);
				double cube = Math.cbrt(number);
				if(root == Math.round(root) && cube == Math.round(cube))
				{
					if(resultList.equals(""))
					{
						resultList += numberFromList;
					}
					else
					{
						resultList += ", " + numberFromList;
					}
				}
			}
			
				return resultList;

		}
		
		return null;
	}
	

}
