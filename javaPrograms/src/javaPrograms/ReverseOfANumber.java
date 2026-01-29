package javaPrograms;

public class ReverseOfANumber 
{
	public static void main(String[] args)
	{
	int n = 835,m = 0,r;
	 while(n != 0) 
	    {
	      r = n % 10;
	      m = m * 10 + r;
	      n /= 10;
	    }

	    System.out.println("Reverse of a Number: " + m);
	    }
}
