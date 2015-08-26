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
        assertEquals("33", server.answer("what is 15 plus 18"));
    }
    
    @Test
    public void shouldReturnSquareAndCube()
    {
    	assertEquals("", server.answer("which of the following numbers is both a square and a cube: 873, 324"));
    	assertEquals("64", server.answer("which of the following numbers is both a square and a cube: 234, 64"));
    	assertEquals("64, 64", server.answer("which of the following numbers is both a square and a cube: 234, 64, 64"));
    }
    
    @Test
    public void shouldReturnProduct()
    {
    	assertEquals("16", server.answer("what is 8 multiplied by 2"));
    }
    
    @Test
    public void shouldReturnLargest()
    {
    	assertEquals("982", server.answer("which of the following numbers is the largest: 16, 86, 982, 701"));
    }
    
    @Test
    public void shouldAnswerTrivia()
    {
    	assertEquals("David Cameron", server.answer("who is the Prime Minister of Great Britain"));
    	assertEquals("Sean Connery", server.answer("who played James Bond in the film Dr No"));
    	assertEquals("Paris", server.answer("which city is the Eiffel tower in"));
    	assertEquals("Peseta", server.answer("what currency did Spain use before the Euro"));
    }
    
//    @Test
//    public void shouldReturnPrimes()
//    {
//    	assertEquals("", "which of the following numbers are primes: 10, 8, 4");
//    	assertEquals("13", "which of the following numbers are primes: 13");
//    	assertEquals("13, 5", "which of the following numbers are primes: 10, 13, 5");
//    }
}
