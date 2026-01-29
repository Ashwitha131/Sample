package javaPrograms;

public class OccurrenceofEachCharcter {
public static void main(String[] args)
{
	String s ="aasdgdd";
	String res="";
	for(int i=0;i<s.length();i++)
	{
		int c=0;
		if(res.contains(""+s.charAt(i)))
			continue;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				c++;
				res=res+s.charAt(i);
			}
		}
		System.out.println(s.charAt(i)+"="+c);
	}
}
}
