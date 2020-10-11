package maximumgenerictest;

public class GenericTestMaximum 
{
	//UC1
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
}
