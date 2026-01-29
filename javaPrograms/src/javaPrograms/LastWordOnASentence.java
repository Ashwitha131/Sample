package javaPrograms;

public class LastWordOnASentence 
{
  public static void main(String[] args)
  {
	  String ip = "I am Capgemini";
	  String[] words = ip.split(" ");
	  String op = words[words.length - 1];
	  System.out.println("Last word in a sentence:" +op);
  }
}

