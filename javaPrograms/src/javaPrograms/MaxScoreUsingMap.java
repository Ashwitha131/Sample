package javaPrograms;
import java.util.*;
import java.util.Map.Entry;
public class MaxScoreUsingMap {
	

	    public static void main(String[] args) {
	        Map<String, Integer> students = new HashMap<>();
	        students.put("Alice", 85);
	        students.put("Bcd", 92);
	        students.put("Charlie", 78);
	        students.put("Dian", 95);
	        students.put("Etha", 88);
	        int lowest = Collections.min(students.values());
	        int highest = Collections.max(students.values());
	   
	        System.out.println("Lowest score is:" +lowest);
	        System.out.println("Highest score is:" +highest);
     
	        System.out.println("\nStudents Sorted by Score:");
	        students.entrySet().stream()
	                .sorted(Entry.comparingByValue())
	                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	    }
	}


