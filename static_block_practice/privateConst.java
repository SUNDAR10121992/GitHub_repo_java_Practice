package static_block_practice;

import java_Programs.staticBlock;

public class privateConst {

//how we can make object if we make constructor private 
	int age;

	public static void main(String[] args) {
		privateConst privateConst = new privateConst();

	}

	static {
		privateConst privateConst = new privateConst();
	}

	public static int createObject() {
		privateConst objConst=new privateConst();
		objConst.age=40;
		return objConst.age;
	}

	private privateConst() {
		age = 30;
	}
}
