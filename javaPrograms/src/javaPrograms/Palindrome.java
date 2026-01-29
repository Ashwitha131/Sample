package javaPrograms;

public class Palindrome 
{
	public static void main(String[] args) 
    {
    int r,s=0,t,n=535;
	t=n;
	while(n>0)
	{
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	}
	if(t==s)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	}

}
