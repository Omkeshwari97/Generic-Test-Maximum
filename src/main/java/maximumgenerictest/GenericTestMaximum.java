package maximumgenerictest;

import java.util.Arrays;

public class GenericTestMaximum <E extends Comparable<E>> 
{
	E x;
	E y;
	E z;
	E args[];
	
	public GenericTestMaximum(E ...args)
	{
		this.args = args;
	}
	
	public E testMaximum()
	{
		E test = findMaximum(args);
		return test;
	}
	
	public E findMaximum(E ...args)
	{
		E max;
		Arrays.sort(args);
		max=args[args.length-1];
		
		return max;
	}
	
	
}
