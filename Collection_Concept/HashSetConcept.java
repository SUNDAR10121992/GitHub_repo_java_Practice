package Collection_Concept;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String args[]) {
		
		
		HashSet<Integer> numbrs = new HashSet<Integer>();
		
		numbrs.add(2);
		numbrs.add(4);
		numbrs.add(6);
		
		System.out.println(numbrs);
		
		HashSet <Integer> hs=new HashSet<Integer>();
		hs.addAll(numbrs);
		System.out.println(hs);
		
		hs.add(10);
		hs.add(22);
		System.out.println(hs);
		
	hs.removeAll(numbrs);

	
	
	}
	

}