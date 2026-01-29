package javaPrograms;
import java.util.HashMap; 
public class OccurrencesofLettersInAString
{
	 public static void main(String[] args) 
	 {
	      String str = "I am Capgemini";
	      HashMap <Character, Integer> h = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) 
	      {
	         if (h.containsKey(str.charAt(i))) 
	         {
	            int count = h.get(str.charAt(i));
	            h.put(str.charAt(i), ++count);
	         } 
	         else 
	         {
	            h.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(h);
	   }
}
