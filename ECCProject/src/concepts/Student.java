package concepts;

/* 3 ways to initialize object
 * initializing simply means storing data in object
 */
public class Student {
	int rollNo;
	String name;
	// 2 initializing through method
	void insertDetails(int r,String str) {
		rollNo = r;
		name = str;
	}
	public static void main(String[] args) {
		// 1 initializing data to object through reference variable
		Student student = new Student();
		student.name = "thiru";
		student.rollNo = 9;
		System.out.println(student.rollNo + " " + student.name);
		
		// initializing data to object through method
		Student student2 = new Student();
		student2.insertDetails(99, "gopal");
		System.out.println(student2.rollNo + " " + student2.name);		

	}

}
