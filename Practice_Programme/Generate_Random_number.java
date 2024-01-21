package Practice_Programme;

import java.util.Random;

public class Generate_Random_number {
public static void main(String[] args) {
	
	Random rand=new Random();
	
	
	int rand_int=rand.nextInt(10);
	
	System.out.println(rand_int);
	
	System.out.println(rand.nextDouble());
	
	System.out.println(Math.random());
	
	//using Apache commons API
	
	
	
	
}
}
