package SDET_Practice;

import Constructor.newclass;
import Practice_Programme.charOccurances;

public class student {
	int sid;
	String name;
	char grade;

	public static void main(String[] args) {
		student stu1 = new student(101, "Amol", 'D');

	//	student stu = new student();


		// using object reference variable
//		stu.sid = 123;
//		stu.name = "sachin";
//		stu.grade = 'A';
//		stu.printstudentData();
//
//		stu.setData(121, "sundar", 'A');
	stu1.printstudentData();
}

	void printstudentData() {
		System.out.println(sid + "  " + name + "  " + grade);
	}

//using methode
	void setData(int id, String nameString, char grad) {
		sid = id;
		name = nameString;
		grade = grad;

	}

	// usng constructor
	student(int ID, String Name, Character Grad) {

		sid = ID;
		name = Name;
		grade = Grad;

	}

}
