package maximumgenerictest;

public class GenericTestMaximum 
{
	//UC4
	public <E extends Comparable<E>> E findMaximum(E a, E b, E c)
	{
		E max = a;
		
		if(b.compareTo(max) > 0)
		{
			max = b;
		}
		
		if(c.compareTo(max) > 0)
		{
			max = c;
		}
			
		return max;
	}
	
	
	/*//UC1
	public Integer findMaximum(Integer a, Integer b, Integer c) 
	{
		Integer max = a;
		
		if(b.compareTo(max) > 0)
		{
			max = b;
		}
		
		if(c.compareTo(max) > 0)
		{
			max = c;
		}
			
		return max;
	}
	
	//UC2
	public Float findMaximum(Float a, Float b, Float c)
	{
		Float max = a;
		
		if(b.compareTo(max) > 0)
		{
			max = b;
		}
		
		if(c.compareTo(max) > 0)
		{
			max = c;
		}
		
		return max;
	}
	
	//UC3
	public String findMaximum(String a, String b, String c)
	{
		String max = a;
		
		if(b.compareTo(max) > 0)
		{
			max = b;
		}
		
		if(c.compareTo(max) > 0)
		{
			max = c;
		}
		
		return max;
	}*/
}
