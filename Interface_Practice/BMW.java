package Interface_Practice;

public class BMW implements Car{


	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW ====Start ");
	}

	
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW===Stop");
	}

	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("BMW ===refuel");
		
	}

	public static void main (String args[]) {
		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		System.out.println(b.wheels);
	}

}
