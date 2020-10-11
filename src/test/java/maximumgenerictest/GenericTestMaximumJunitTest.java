package maximumgenerictest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericTestMaximumJunitTest 
{

	//UC1
	@Test
	public void givenFirstInteger_returnFirstNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum(3,2,1);
		
		Integer actualInteger = (Integer)objGenericTestMaximum.findMaximum();
		Integer expectedInteger = 3;
		assertEquals(expectedInteger, actualInteger);
	}
	
	public void givenSecondInteger_returnSecondNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum(1,3,2);
		
		Integer actualInteger = (Integer)objGenericTestMaximum.findMaximum();
		Integer expectedInteger = 3;
		assertEquals(expectedInteger, actualInteger);
	}
	
	public void givenThirdInteger_returnThirdNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum(1,2,3);
		
		Integer actualInteger = (Integer)objGenericTestMaximum.findMaximum();
		Integer expectedInteger = 3;
		assertEquals(expectedInteger, actualInteger);
	}
	
	//UC2
	@Test
	public void givenFirstFloat_returnFirstNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum =new GenericTestMaximum(3f, 2f, 1f);
		
		Float actual = (Float)objGenericTestMaximum.findMaximum();
		Float expect = 3f;
		assertEquals(expect, actual);
	}
	
	@Test
	public void givenSecondFloat_returnSecondNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum =new GenericTestMaximum(1f, 3f, 2f);
		
		Float actual = (Float)objGenericTestMaximum.findMaximum();
		Float expect = 3f;
		assertEquals(expect, actual);
	}
	
	@Test
	public void givenThirdFloat_returnThirdNumber_whenMaximum() 
	{
		GenericTestMaximum objGenericTestMaximum =new GenericTestMaximum(1f, 2f, 3f);
		
		Float actual = (Float)objGenericTestMaximum.findMaximum();
		Float expect = 3f;
		assertEquals(expect, actual);
	}

	//UC3
		@Test
		public void givenFirstString_returnFirstNumber_whenMaximum() 
		{
			GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum("Peach", "Apple", "Banana");
			
			String actual = (String)objGenericTestMaximum.findMaximum();
			String expected = "Peach";
			assertEquals(expected, actual);			
		}

		@Test
		public void givenSecondString_returnSecondNumber_whenMaximum() 
		{
			GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum( "Apple", "Peach", "Banana");
			
			String actual = (String)objGenericTestMaximum.findMaximum();
			String expected = "Peach";
			assertEquals(expected, actual);			
		}
		
		@Test
		public void givenThirdString_returnThirdNumber_whenMaximum() 
		{
			GenericTestMaximum objGenericTestMaximum = new GenericTestMaximum("Peach", "Banana", "Apple");
			
			String actual = (String)objGenericTestMaximum.findMaximum();
			String expected = "Peach";
			assertEquals(expected, actual);			
		}
}
