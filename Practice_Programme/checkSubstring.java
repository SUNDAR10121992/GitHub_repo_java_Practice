package Practice_Programme;

import java_Programs.staticBlock;

public class checkSubstring {

	public static void main(String[] args) {
		isSubstring("Welcome to java &&", "Wel");
		isSubstring("Welcome to java &&", "come");
		isSubstring("Welcome to java &&11", " ");
	}

	public static void isSubstring(String s1, String s2) {
		if (s1.contains(s2))
		{
			System.out.println("is substrig");
		} else 
		{
			System.out.println("is not substring ");
		}
		
		  if (s1.matches(".*"+s2+".*")) 
		  { 
			  System.out.println("is substring ");
		  
		  } else
		  { 
			  System.out.println("Not substring"); }
		 
	}
}
