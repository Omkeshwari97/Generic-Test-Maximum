package maximumgenerictest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericTestMaximumJunitTest 
{

	@Test
	public void givenInteger_returnNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum();
		
		assertSame(3, objGenericTestMaximum.findMaximum(1, 2, 3));
		assertSame(3, objGenericTestMaximum.findMaximum(1, 3, 2));
		assertSame(3, objGenericTestMaximum.findMaximum(3, 1, 2));
	}

}
