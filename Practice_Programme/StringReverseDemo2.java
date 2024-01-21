package Practice_Programme;

public class StringReverseDemo2 {
	public static void main(String args[]) {

		String str = "Wellcom to java";

		String rev="";
		int len=str.length();
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		

		
		System.out.println("***********=================*************");
		StringBuffer sb=new StringBuffer(str);
		
		sb.reverse();
		
		System.out.println(sb);
		System.out.println("**********===========*************");
		
		StringBuilder sb1=new StringBuilder(str);
		
		sb1.reverse();
		System.out.println(sb1);
		
		
	}

}
