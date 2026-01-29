package javaPrograms;

public class StringReverseWithoutBuiltInFunction 
{
	 public static void main(String[] args)
	 {
		 String ip= "selenium automation ", op="";
			char ch;
			for (int i=0; i<ip.length(); i++) 
			{
				ch= ip.charAt(i); 
				op= ch+op; 
			}
			System.out.println("Reversed String: "+ op);
	 }
}
