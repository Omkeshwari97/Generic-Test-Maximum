package maximumgenerictest;

public class GenericTestMaximum <E extends Comparable<E>> 
{
	E x;
	E y;
	E z;
	
	public GenericTestMaximum(E x, E y, E z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//UC4
	public E findMaximum()
	{
		E max = x;
		
		if(y.compareTo(max) > 0)
		{
			max = y;
		}
		
		if(z.compareTo(max) > 0)
		{
			max = z;
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
