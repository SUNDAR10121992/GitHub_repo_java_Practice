package Collection_Concept;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// HashMap hm =new HashMap();

		hm.put(102, "sachin");
		hm.put(103, "swati");
		hm.put(104, "jyoti");
		hm.put(105, "Y");
		hm.put(106, "ABC");

		System.out.println(hm);

		System.out.println(hm.get(105));
		System.out.println(hm.get(106));
		//
		// hm.remove(106);
		System.out.println(hm);
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("sachin"));
		System.out.println(hm.containsValue("Sundar"));

		System.out.println(hm.isEmpty());
		// Key set --get all keys

		System.out.println(hm.keySet());
		// get all value
		for (Object i : hm.keySet()) {
			System.out.println(i);

		}

		System.out.println(hm.values());

		for (Object v : hm.values()) {
			System.out.println(v);
		}

		// all entry set value ...will return Set object

		System.out.println(hm.entrySet());

		//
		for (Object o : hm.keySet()) {
			System.out.println(o + "   " + hm.get(o));

		}

		// Capture 1 entry like using entry mehtde

		for (Map.Entry entry : hm.entrySet())

		{
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

		// Iterator

		Set s = hm.entrySet();

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();

			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

	}
}
