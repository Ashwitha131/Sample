package javaPrograms;

public class RemoveSpaces 
{
	public static void main(String[] args) 
    {
        String ip = "I am an automation tester ";
        String op="";
      char ch;
      for(int i=0; i<ip.length(); i++)
      {
         ch = ip.charAt(i);
         if(ch!=' ')
            op = op + ch;
      }
      
      ip = op;
      System.out.println("String without Spaces is " +ip);
   }
}
