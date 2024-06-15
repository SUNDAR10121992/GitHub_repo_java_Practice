package New_Practice;

import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_element_In_Array_multipleWay {

	public static void main(String[] args) {

		String infra[] = { "SauceLabs", "Amazon", "GCP", "Selenium", "Amazon", "JAVA", "SauceLabs", "GCP" };

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}

		System.out.println("++++++++ByUsing+++HashSet+++++");

		HashSet<String> set = new HashSet<String>();
		for (String e : infra) 
		{
			if (set.add(e) == false) 
			{
				System.out.println(e);
			}
		}

		
		System.out.println("Using ======hashmap========");
		Map<String, Integer> infraMap = new HashMap<String, Integer>();

		for (String e : infra) 
		{
			Integer count = infraMap.get(e);
			if (count == null) 
			{

				infraMap.put(e, 1);

			} else 
			{
				infraMap.put(e, ++count);
			}
		}
//print all element 
		
	Set<Entry<String,Integer>> entrySet=	infraMap.entrySet();
	
	for(Entry<String, Integer> entry:entrySet)
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

}