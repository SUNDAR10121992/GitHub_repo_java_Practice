package Constructor;

public class employee {
	int emp_Id;
	String nameString;
	String companyString;

	public employee(int emp_Id, String nameString, String companyString) {
		this.emp_Id = emp_Id;
		this.nameString = nameString;
		this.companyString = companyString;
	}

	void display() {
		System.out.println(emp_Id + " " + nameString + " " + companyString);

	}

	public static void main(String[] args) {
		employee e1 = new employee(101, "sundar", "digi");
		e1.display();
	}
}
