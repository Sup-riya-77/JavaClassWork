package studentAssignment.ui;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import studentAssignment.exceptions.DataNotPresentException;
import studentAssignment.exceptions.StudentNotFoundException;
import studentAssignment.model.Student;
import studentAssignment.service.*;
public class UI {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Student stud1 = new Student();
		stud1.setId(1);
		stud1.setName("Viya");
		stud1.setCity("Ranchi");
		Student stud2 = new Student(2,"Kaali","Lucknow");
		Student stud3 = new Student(3,"Sandy","Chennai");
		Student stud4 = new Student(4,"Bunny","Patna");
		Student stud5 = new Student(5,"Mothi","Delhi");
		Student stud6 = new Student(6,"Rocksy","Delhi");
		Student stud7 = new Student(7,"Ricksy","Ahmedabad");
		Student stud8 = new Student(8,"Minnie","Hyderabad");
		Student stud9 = new Student(9,"Maxi","Visakhapatnam");
		Student stud10 = new Student(10,"Dolly","Vikarabad");
		Student stud11 = new Student(11,"Bittu","Badrachalam");
		Student stud12 = new Student(12,"Lucy","Cheerala");
		Student stud13 = new Student(13,"Jonny","Banglore");
		Student stud14 = new Student(14,"Kanni","Vijayawada");
		Student stud15 = new Student(15,"Kutty","Pidugurala");
		
		Service studentService = new ServiceImpl();
		
		List<Student> studentList = Arrays.asList(stud1,stud2,stud3,stud4,stud5,stud6,stud7,stud8,stud9,stud10,stud11,
												  stud12,stud13,stud14,stud15);
		try 
		{
		for(Student student : studentList)
		{
		System.out.println(studentService.addStudent(student));
		}
		}
		catch(DataNotPresentException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Displaying All Students Data : ");
	    List<Student> students=studentService.displayStudent();
	    students.forEach(System.out::println);
	    
	    System.out.println();
	     //Name wise sorting
	  	System.out.println("Sorting name Wise : ");
	  	Collections.sort(students,Comparator.comparing(Student::getName));
	  	students.forEach(System.out::println);

	    //City wise sorting
	  	System.out.println();
	  	System.out.println("Sorting city Wise : ");
	  	Collections.sort(students,Comparator.comparing(Student::getCity));
	  	students.forEach(System.out::println);
	  		
		try
		{
			System.out.println("Enter the student id : ");
			int id=scan.nextInt();
			Student s1 = studentService.displayStudent(id);
			System.out.println(s1);
		}
		catch(StudentNotFoundException e)
		{
			System.out.println(e.getMessage());
		
		}
		System.out.println();
	    System.out.println("Enter the city : ");
		String city=scan.next();
		List<Student> s2;
		try
		{
			s2 = studentService.displayStudent(city);
			s2.forEach(System.out::println);
		} 
		catch (StudentNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		scan.close();
	
	    
	    }
}
