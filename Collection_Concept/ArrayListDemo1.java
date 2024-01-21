package Collection_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String args[]) {
		// ArrayList<Integer> al = new ArrayList<Integer>();
		// ArrayList<String> al2 = new ArrayList<String>();

		List al = new ArrayList();
		al.add(null);
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");

		System.out.println("ArrayList before Edit " + al);

		int l = al.size();
		System.out.println(l + "  Number f elemetn in Array Llist ");
		System.out.println(al.size());
		al.remove(2);
		System.out.println("After removing " + al);

		al.add(0, "Sachin kande");

////		System.out.println("After adding new element "+al );
////		//retrieve ele
////		System.out.println(al.get(4));
////		al.set(2, false);
////		System.out.println(al);
////		System.out.println(al.contains(false));
//
////		for (int i = 0; i < al.size(); i++) {
////			System.out.println(al.get(i));
////		}
////		System.out.println("reading elements using For each loop ");
////		for (Object e : al) {
////
////			System.out.println(e);
////
////		}
////		System.out.println("Reading elelemt using itrator mehtode");
////
////		Iterator it = al.iterator();
////		while (it.hasNext()) {
////
////			System.out.println(it.next());
////
////		}
//
//		//ArrayList al1 = new ArrayList();
//
//	//	al1.addAll(al);
//
////		System.out.println(al1);
////
////		System.out.println(al1.removeAll(al));
////		System.out.println("afterremoving array al" + al1);
//
//	//	Collections.sort(al);
//		//System.out.println(al);
//
//	//	Collections.sort(al, Collections.reverseOrder());
//		
//	//	System.out.println(al);
	}

}

