package javapractice;

public class _SchoolProject {
	public static void main(String[] args) {
		/*
		 *  Write a java program for school management 
		 *  
		 *  - object creation
		 *  - inheritence
		 *  - polymorphisim overloadin and overriding
		 *  - encapsulation
		 *  
		 *  Program should includes
		 *  
		 *  1) Constant Data class;
		 *     * there should be some data about school, like name, web address, phone number, address etc
		 *     * Information could not be changeable
		 *  2) Teacher class
		 *     * there should be some information about all teachers like name, surname,branch and phone number
		 *     * there should be constructors to create teacher objects
		 *     * there should be a method for printing teacher's information
		 *  3) Teachers class
		 *     * there should be a list to store all teachers
		 *     * there should be a method to add teachers to teachers list
		 *     * there should be a method to print all teachers
		 *     * there should be a method to print numbers of teachers 
		 *  4) Student class
		 *     * there should be some information about all students like name, surname, student number
		 *     * there should be a method for printing student's information
		 *      
		 */
	
		System.out.println("===== SCHOOL INFORMATION======");
		System.out.println("Name : " + ConstantData.NAME);
		System.out.println("Web Address : " + ConstantData.WEB_ADDRESS);
		System.out.println("Phone Number : " + ConstantData.PHONE_NUMBER);
		System.out.println("address : " + ConstantData.ADDRESS);
		
		Teacher teacher01 = new Teacher();
		teacher01.setName("Suleyman");
		teacher01.setSurname("Alptekin");
		teacher01.setBranch("Java");
		teacher01.setPhoneNumber("5553625147");
		System.out.println(teacher01.getName() + " " + teacher01.getSurname() + ", " + teacher01.getBranch() + ", " 
				+ teacher01.getPhoneNumber());
		
		Teacher teacher02 = new Teacher("Ahmet" , "Bayram" , "Selenium" , "5555685478");
		System.out.println(teacher02.getName() + " " + teacher02.getSurname() + ", " + teacher02.getBranch() + ", " 
				+ teacher02.getPhoneNumber());
		
		System.out.println(teacher01.toString()); // SchoolProject.Teacher@15db9742
		
		System.out.println("===== TEACHERS LIST=====");
		
		System.out.println(teacher01.toString(teacher01));
		System.out.println(teacher02.toString(teacher02));

	
		
	
	}
	
	   
}