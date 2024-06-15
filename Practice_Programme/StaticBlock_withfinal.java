package Practice_Programme;

public class StaticBlock_withfinal {

	public static void main(String[] args) {
		System.out.println(Main.x);
	}
}

class Main

{
	public static  int x=10;
	
	static {
		System.out.println("main class with static block");
	}
} 