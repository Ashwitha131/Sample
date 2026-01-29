package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class DuplicateElementsOfAnArrayAndtheirOccurrences 
{
	public static void main(String[] args)
	{
		int[] arr =new int []  {2, 3, 5, 4, 3, 1, 3, 2, 1, 2, 2};
//		HashMap <Integer, Integer> numberCount = new HashMap<>();
//		for(int number:numbers)
//		{
//			if(numberCount.containsKey(number))
//			{
//				int count=numberCount.get(number);
//				numberCount.put(number,count+1);
//			}
//			else
//			{
//				numberCount.put(number,1);
//			}
//	
//		}
//		System.out.println("Duplicate numbers are:");
//	    for(Map.Entry<Integer,Integer>entry:numberCount.entrySet())
//	    {
//	    	if(entry.getValue()>1)
//	    	{
//	    		System.out.println(entry.getKey());
//	    	}
//        }
//	    System.out.println("Number Count:");
//	    for(Map.Entry<Integer,Integer>entry:numberCount.entrySet())
//	    {
//	    	System.out.println(entry.getKey()+"-"+entry.getValue());
//	    }
//	}
//}
		int i,j,count;
		System.out.println("Elements and their Occurrences:");
		for(i=0; i<arr.length; i++)
		{
			count = 1;
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[j] == arr[i])
				{
					count++;
				} 
				else 
				{
					break;
				}
			}
			i=j-1;
			if(count > 1)
			{
				System.out.println(arr[i] + " --> " + count);
			}
		}
	}
}

