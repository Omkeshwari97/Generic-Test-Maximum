package maximumgenerictest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericTestMaximumJunitTest 
{

	//UC1
	@Test
	public void givenInteger_returnNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum();
		
		assertSame(3, objGenericTestMaximum.findMaximum(1, 2, 3));
		assertSame(3, objGenericTestMaximum.findMaximum(1, 3, 2));
		assertSame(3, objGenericTestMaximum.findMaximum(3, 1, 2));
	}
	
	//UC2
	@Test
	public void givenFirstFloat_returnFirstNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum =new GenericTestMaximum();
		
		Float actual = objGenericTestMaximum.findMaximum(3f, 2f, 1f);
		Float expect = 3f;
		assertEquals(expect, actual);
	}
	
	@Test
	public void givenSecondFloat_returnSecondNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum =new GenericTestMaximum();
		
		Float actual = objGenericTestMaximum.findMaximum(1f, 3f, 2f);
		Float expect = 3f;
		assertEquals(expect, actual);
	}
	
	@Test
	public void givenThirdFloat_returnThirdNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum =new GenericTestMaximum();
		
		Float actual = objGenericTestMaximum.findMaximum(1f, 2f, 3f);
		Float expect = 3f;
		assertEquals(expect, actual);
	}

	//UC3
		@Test
		public void givenString_returnString_whenMaximum() 
		{
			GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum();
			
			assertSame("Peach", objGenericTestMaximum.findMaximum("Apple", "Banana", "Peach"));
			assertSame("Peach", objGenericTestMaximum.findMaximum("Apple", "Peach", "Banana"));
			assertSame("Peach", objGenericTestMaximum.findMaximum("Banana", "Apple", "Peach"));
		}
		
}
