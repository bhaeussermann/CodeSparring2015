package digigate;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import digigate.ExtremeStartup;

public class ExtremeStartupTest {

    private final ExtremeStartup server = new ExtremeStartup();

    @Test
    public void shouldAcceptMissingInput() 
    {
        assertEquals("Digigate", server.answer(null));
    }

    @Test
    public void shouldRespondToNameRequest()
    {
    	assertEquals("Digigate", server.answer("what is your name"));
    }
    
    @Test
    public void shouldAddNumbers() 
    {
        assertEquals("18", server.answer("what is the sum of 14 and 4"));
    }
}
