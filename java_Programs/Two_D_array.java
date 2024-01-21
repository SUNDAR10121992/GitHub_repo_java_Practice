package java_Programs;

public class Two_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x[][]=new String[3][5];
		
		System.out.println(x.length);//it will give total number row =3
		
		System.out.println(x[0].length);//It will give total number of=5
		
		x[0][0]="Sundar";
		x[0][1]="kande";
		x[0][2]="sachin";
		x[0][3]="knmd";
		x[0][4]="smk";
		
		//System.out.println(x[0][1]);
	
		x[1][0]="A";
		x[1][1]="B";
		x[1][2]="c";
		x[1][3]="d";
		x[1][4]="e";
		
		x[2][0]="f";
		x[2][1]="g";
		x[2][2]="h";
		x[2][3]="i";
		x[2][4]="j"; 
//		
//		char c[][]	=new char[2][3];
//		c[0][0]= 'v';
//		System.out.println(c[0][0]);
//		System.out.println(c.length);
		
    //to print all values we need to use 2 for loops 
	for(int row=0; row<x.length;row++)
	{
		for(int col=0;col<x[0].length;col++)
		{
			System.out.println(x[row][col]);
		}
	}
			
	}

}
