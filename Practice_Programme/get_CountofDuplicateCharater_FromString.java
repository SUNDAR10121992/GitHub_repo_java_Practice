package Practice_Programme;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class get_CountofDuplicateCharater_FromString {
	public static void main(String[] args) {
		String string = "Java";
		getOccurancesinString("java");
		getOccurancesinString("I love testing");

	}

	public static void getOccurancesinString(String string) {

		int count = 0;

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : string.toCharArray()) {
			if (charMap.containsKey(ch)) 
			{
				charMap.put(ch, charMap.get(ch) + 1);
			} else
			{
				charMap.put(ch, 1);
			}
		}
		// Print the map
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Map.Entry<Character, Integer> enteries : entrySet) {
			if (enteries.getValue() > 1) {
			//	count++;
				// System.out.println(enteries.getKey() +" : "+enteries.getValue());
				 System.out.println(enteries.getKey() +" : "+enteries.getValue());

			}

		}

		//System.out.println(count);
	}

}
