package New_Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Practice_Programme.charOccurances;

public class Duplicat_Charater {

	public static void main(String[] args) {
		duplicate("welcome");
		duplicate("welcometojava");
		duplicate("java");
	}

	public static void duplicate(String string) {

		char charOccurances[] = string.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : charOccurances)

		{

			// Integer countInteger = map.get(c);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				// map.put(c, 1);
			} else {

				map.put(c, 1);
				// map.put(c, ++countInteger);
			}

		}
//print all char

		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for (Entry<Character, Integer> entries : entrySet)
		{
			if (entries.getValue() > 1) {
				System.out.println("duplicate eleemtn is (" + entries.getKey() + " : " + entries.getValue() + ") ");
			}
		}
	}
}
