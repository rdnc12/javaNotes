package day28inheritance;

public class StudentDesk extends Classroom {

	boolean broken = false;

	public static void main(String[] args) {
		/*
        If you have variables whose names are same to understand which one
        will be used you should look at the data type of the object.
        In the following example; if data type of "std1" is StudentDesk the output
        will be "false", if data type of "std1" is Classroom the output
        will be "true"  
        */
		
		/*
		 If you have methods whose names are same to understand which one
        will be used you should look at the constructor of the object.
        In the following example; if constructor of "std1" is StudentDesk the output
        will be "New desk", if constructor of "std1" is Classroom() the output
        will be "Classroom desk"		 
		 */
		
		StudentDesk std = new StudentDesk();
		System.out.println(std.broken); // false
		System.out.println(std.area); // 300
		System.out.println(std.initial); // B
		std.desk(); // New Desk

		Classroom stdc = new StudentDesk();
		System.out.println(stdc.broken);// true
		System.out.println(stdc.area); // 300
		stdc.desk(); // New Desk

		School stds = new StudentDesk();
		System.out.println(stds.area); // 400000
		
		Classroom stdc1 = new Classroom();
		stdc1.desk(); // Classroom Desk
		

	}

	public void desk() {

		System.out.println("New Desk");
	}

}
