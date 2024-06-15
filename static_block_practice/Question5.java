package static_block_practice;

public class Question5 {
//Can we initialize member variable within static block 
	
	 String name;
	 static int age;
	 
	static {
	Question5 question5=new Question5();
	
	question5.name="naveen";
	age=23;
	
	System.out.println(question5.name+"   "+age);
	}
	public static void main(String[] args) {
		
	}
}
