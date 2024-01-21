package Collection_Concept;

import java.util.*;

public class HashSetDemo {
public static void main(String args[])
{
	HashSet hs =new HashSet();
	
	//HashSet<Integer> hs =new HashSet<Integer>();
	
	hs.add(100);
	hs.add("welcome");
	hs.add(12.3);
	hs.add('A');
	hs.add(true);
	hs.add(null);
	
	System.out.println(hs);
	hs.remove(12.3);
	System.out.println(hs);
	hs.add(23.344);
	System.out.println(hs);
	
	
	System.out.println(hs.contains(null));
	System.out.println(hs.isEmpty());
	System.out.println();
//	for(Object obj:hs)
//	{
//		System.out.println(obj);
//	}
//	

  Iterator itr= hs.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
	  
  }




}
}
