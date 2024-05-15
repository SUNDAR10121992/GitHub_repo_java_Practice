package Practice_Programme;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Duplicate_By_Map {
	public static void main(String[] args) {
		String a[] = { "java", "C++", "C#", "Selenium", "PHP", "C++", "PHP" };

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String value : a) {

			Integer count1 = m.get(value);

			if (count1 == null) 
			{
				m.put(value, 1);
			} else 
			{
				m.put(value, ++count1);
			}

		}
		// get the values from hashMap
		Set<Entry<String, Integer>> entrySet = m.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {

				System.out.println("duplicate ele is ::" + entry.getKey());

			}
		}

		System.out.print(m);
	}
}
