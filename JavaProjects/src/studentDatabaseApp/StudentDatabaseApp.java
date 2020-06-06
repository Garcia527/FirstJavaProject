package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many users we want to add (n)
		System.out.println("Enter number of new student's you want to enroll: ");
		Scanner in = new Scanner(System.in);
		
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of students
		for(int n = 0; n<students.length; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}
	}

}
