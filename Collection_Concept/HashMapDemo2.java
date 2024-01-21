package Collection_Concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(101, "Sundar");
		hm.put(102, "Sachin");
		hm.put(103, "Swati");
		hm.put(104, "sahu");
		hm.put(105, "Marti");
		hm.put(106, "kande");

//		System.out.println(hm.containsValue("Sundar"));
//		System.out.println(hm.containsKey(1001));
//		System.out.println("Checking is empty or not " + hm.isEmpty());
//		System.out.println("All Set of Keys ==" + hm.keySet());
//		hm.replace(100, "Sam");
//		System.out.println("all valuesd frommap  ==" + hm.values());
//		System.out.println("All entry set ===" + hm.entrySet());

		// Print all keys as individualon=bject

		for (int i : hm.keySet()) {
			System.out.println(i + "  value is    " + hm.get(i));

		}

		for (String s : hm.values()) {
			System.out.println("indvidual values  ===" + s);

		}

		for (Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " Entry  " + entry.getValue());

		}

		System.out.println("+=++++++Iterator ==========");

		Set set = hm.entrySet();
		System.out.println("=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Map.Entry entry1 = (Entry) itr.next();
			System.out.println(entry1.getKey() + "   " + entry1.getValue());

		}

		System.out.println(hm);

		System.out.println("By+++=====88888========");
		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());

		}

	}

}
