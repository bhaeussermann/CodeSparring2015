package digigate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import digigate.requesthandlers.*;

public class ExtremeStartup extends HttpServlet 
{
	private static final long serialVersionUID = 5569879929957436635L;
	
	private RequestHandler[] requestHandlers = new RequestHandler[] {
		new NameRequestHandler(),
		new SumRequestHandler(),
		new LargestNumberHandler(),
		new MultiplyRequestHandler(),
		new SquareCubeRequestHandler(),
		new TriviaRequestHandler()
	};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        System.out.println("A request has arrived");
        resp.getWriter().write(answer(req.getParameter("q")));
    }

    String answer(String parameter)
    {
    	System.out.println("Received <" + parameter + ">");
    	
        for (RequestHandler nextHandler : requestHandlers)
        {
        	String response = nextHandler.getResponse(parameter);
        	if (response != null)
        	{
        		System.out.println("Response <" + response + ">");
        		return response;
        	}
        }
        
        return "Digigate";
    }

}
