package Collection_Concept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String args[]) {
		// Declaration
		LinkedList l = new LinkedList();
		l.add(100);
		l.add("Sundar");
		l.add(true);
		l.add(12.23);
		l.add('A');
		l.add(null);

		System.out.println(l);

	//	l.removeLast();
		System.out.println(l);

//		for (Object o : l) {
//			System.out.println(o);
//		}

		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
