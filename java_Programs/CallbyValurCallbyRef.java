package java_Programs;

public class CallbyValurCallbyRef {

	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValurCallbyRef obj = new CallbyValurCallbyRef();

		int x = 10;
		int y = 20;

		obj.p = 50;
		obj.q = 60;

		obj.testSum(x, y); /// this is call by value i.e we r passing just copy of values
		obj.swap(obj);
		// After swap

		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public int testSum(int a, int b) {

		int c = a + b;
		//System.out.println(c);
		return c;

	}

	public void swap(CallbyValurCallbyRef t) {

		int temp = t.p;// temp=50;

		t.p = t.q;// t.p=60

		t.q = temp; // temp=50

	}

}
