package java_Programs;

public class WrapperClass {

	public static void main(String args[]) {

		String x = "100";

		System.out.println(x + 20);

		// data conversion String to int

		int i = Integer.parseInt(x);

		System.out.println(i + 20);

		// Integer double boolean character

		// String todouble

		String y = "12.33";
		double d = Double.parseDouble(y);

		System.out.println(d + 20);

		// String toboolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// int to String
		int j = 23;
		System.out.println(j + 100);

		String s1 = String.valueOf(j);

		System.out.println(s1 + 100);
		//
		boolean b1 = true;

		System.out.println(b1);

		String s2 = String.valueOf(b1);

		System.out.println(s2 + 100);

		//
		String s3 = "100A";
		
		Integer.parseInt(s3);//number formate exeption 
		
		
		

	}
}
