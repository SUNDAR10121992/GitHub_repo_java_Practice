package Practice_Programme;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateByHashMap {

	public static void main(String args[]) {

		String s[] = { "java", "selenium", "C++", "C#", "java", "selenium", "C++" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String value : s)

		{
			Integer count = map.get(value);
			if (count == null) 
			{
				map.put(value, 1);

			} 
			else 
			{

				map.put(value, ++count);
			}
		}

		// get value from hashMap

		Set<Entry<String, Integer>> enterySet = map.entrySet();

		for (Entry<String, Integer> entries : enterySet) 
		{

			if (entries.getValue() >= 1)
			{

				System.out.println(entries.getValue()+ " : " + entries.getKey());
		
			}
		}

	}

}
