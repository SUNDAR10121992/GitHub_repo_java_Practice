package Constructor_XYZ;

import java.security.PublicKey;

import SDET_PracticeOverLoading.mainaccount;

public class Testing {

	{
		System.out.println("hello before all ");
	}

	static {
		System.out.println("static 1");

	}

	Testing() {
		System.out.println("constructor ");
	}

	public static void main(String args[]) {

		System.out.println("main method");

		Testing testing = new Testing();
	}

}
