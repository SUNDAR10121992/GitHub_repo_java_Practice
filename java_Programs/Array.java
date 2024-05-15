package java_Programs;

public class Array {

	public static void main(String args[]) {
		//Array : to store similar data type variable 
		
		int i[]=new int [4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
	
		i[3]=4;
	System.out.println(i[2]);
	System.out.println(i[3]);
	System.out.println(i[0]);
	
	//size of array 
	
	 System.out.println(i.length);
	 //print all values of array 
	 for(int j=0;j<4;j++)
	 {
		 System.out.println(j);
	 }
	 System.out.println("++++++++***++++++");
	 

	 int k=0;
	 while(k<i.length)
	 {
		 System.out.println(k);
		 k++;
	 }
	  
	 double d[]=new double[3];
	 
	 d[0]=12.34;
	 d[1]=22.34;
	 d[2]=32.344;
	 
	 System.out.println(d[2]);
	 
	 char c[]=new char[3];
	 
	 Object ob[]=new Object[6];
	 
	 ob[0]=2;
	 ob[1]="saching";
	 ob[2]="$";
	 ob[3]="1/12/1992";
	 ob[4]=22.34;
	 System.out.println(ob[2]);
	 System.out.println(ob.length);
	 
	 
	 
	 
	 
	 
	 
	
	}
}
