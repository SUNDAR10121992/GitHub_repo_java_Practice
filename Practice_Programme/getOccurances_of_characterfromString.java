package Practice_Programme;

import java.util.HashMap;
import java.util.Map;

import java_Programs.staticBlock;

public class getOccurances_of_characterfromString {

	public static void main(String args[]) {
		getOccurancesOf_char("testing");
		getOccurancesOf_char("welcome");
		getOccurancesOf_char("sel sel sel ");
		getOccurancesOf_char("my name is sundar");
		getOccurancesOf_char("testing_java_test");
		getOccurancesOf_char("welcome to my world");
		getOccurancesOf_char("t");
		getOccurancesOf_char("tt");
	}

	public static void getOccurancesOf_char(String name)

	{
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char chaArray[] = name.toCharArray();
		for (char c1 : chaArray) {
			if (c1!=' ') {   ////it will give occurances without spaces 
				if (charMap.containsKey(c1)) 
				{
					
					charMap.put(c1, charMap.get(c1) + 1);

				} else 
				{
					charMap.put(c1, 1);
				}
			}
		}

		System.out.println(name + ":" + charMap);
	}
}
