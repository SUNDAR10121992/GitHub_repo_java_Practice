package Practice_Programme;

import SDET_PracticeOverLoading.StaticDemo;
import java_Programs.staticBlock;

public class PrintWithout_static_mainMethode {

	
	  public static void main(String[] args) {
	  
	  }
	 
	
	public static boolean printanyStrig()
	{
		System.out.println("hello world ");
		return true;
	}
	static boolean s=printanyStrig() ;
}
