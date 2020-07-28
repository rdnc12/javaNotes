package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> list = new ArrayList<>();
		
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);
		
		// check if all average scores are less than 98
		boolean result1 = list.stream()
								.allMatch(t -> t.getAverageScore()<98);
		
		System.out.println(result1);
		
		// check if all course names contain "Day" word
		boolean result2 = list.stream()
								.allMatch(t -> t.getCourseName().contains("Day"));
		System.out.println(result2);
		
		// check any number of students is 154
		
		boolean result3 = list.stream()
								.anyMatch(t -> t.getNumberOfStudents()==154);
		System.out.println(result3);
		
		// check if any season is winter
		boolean result4 = list.stream()
								.anyMatch(t -> t.getSeason().equals("Winter"));
		System.out.println(result4);
		
		// check if no number of students is 100
		boolean result5 = list.stream()
								.noneMatch(t -> t.getNumberOfStudents() ==100);
		System.out.println(result5);
		
		//sort the elements in natural order according to average score
		list.stream()
			.sorted(Comparator.comparing(t -> t.getAverageScore()))
			.forEach(t -> System.out.print(t + " "));
		System.out.println();
		//sort the elements in reverse order according to the number of students
		// method reference provide us to use other method.
		list.stream()
			.sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
			.forEach(t -> System.out.print(t + " "));
		//Sort the elements in reverse order according to the course name
		list.stream()
			.sorted(Comparator.comparing(Course::getCourseName).reversed())
			.forEach(System.out::println);
	}

}
