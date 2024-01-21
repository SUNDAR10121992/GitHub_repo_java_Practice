package Collection_Concept;

import java.util.HashSet;

public class HashSet23 {
//union , Intersection ,
	public static void main(String args[]) {

		HashSet<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println(set1);

		HashSet<Integer> set2 = new HashSet<Integer>();

		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set2);

		// union

		set1.addAll(set2);
		System.out.println("union result....avoid duplicate means all r unique from " + set1);

		// intersection

		// common ele will get
		// set1.retainAll(set2);

		// System.out.println("Intersection....Common elemetn" + set1);

		// difference

//		set1.removeAll(set2);
//		System.out.println("difference"+set1);
//Subset 
	
		System.out.println(	set1.containsAll(set2));
		

	}

}
