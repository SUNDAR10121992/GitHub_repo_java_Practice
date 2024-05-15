package Practice_Programme;

public class Remove_white_spaces {

	public static void main(String[] args) {

		String string = "  This  is java code  ";

	  	// System.out.println(string.trim());//it only remove side spaces only

	    System.out.println(string.replaceAll("\\s*", ""));

		System.out.println(string.replaceAll(" ",""));
			String newstringString="";
		for(int i=0;i<string.length();i++) {

       // char character=string.charAt(i);
		{
			if(string.charAt(i)!=' ')
			{
				newstringString+=string.charAt(i);
			}
	  }
         }
		
		System.out.println(newstringString);
		
		//aproach 
		System.out.println("");
		
		String word[]=string.split("\\s");
	
		StringBuffer string1=new StringBuffer();
		
		for(String e:word)
	
		{
			string1.append(e);
		}
	
		System.out.println(string1);	
		
	}
}
