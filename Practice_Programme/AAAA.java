package Practice_Programme;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AAAA {

	public static void main(String[] args) {

		String s[] = { "java", "java", "C++", "C#", "Selenium", "PHP", "C++" };

		HashMap<String, Integer> m = new HashMap<String, Integer>();

		for (String value : s) {
			Integer count = m.get(value);
			if (count == null) {
				m.put(value, 1);

			} else {
				m.put(value, ++count);

			}
		}
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println("Duplicates are ::" + entry.getKey());

			}
		}

	}
}
