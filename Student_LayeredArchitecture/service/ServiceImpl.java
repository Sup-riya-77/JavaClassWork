package studentAssignment.service;

import studentAssignment.model.Student;

import java.util.List;

import studentAssignment.dao.*;
import studentAssignment.exceptions.StudentNotFoundException;
public class ServiceImpl implements Service {

	@Override
	public String addStudent(Student student) {
		DAO studentDAO=new DAOImpl();
		String message=studentDAO.addStudent(student);
		return message;
	}

	@Override
	public Student displayStudent(Integer id) throws StudentNotFoundException {
		DAO studentDAO=new DAOImpl();
		Student readStudent=studentDAO.displayStudent(id);
		return readStudent;
	}

	@Override
	public List<Student> displayStudent(String city) throws StudentNotFoundException {
		DAO studentDAO=new DAOImpl();
		List<Student> readStudent=studentDAO.displayStudent(city);
		return readStudent;
	}

	@Override
	public List<Student> displayStudent() {
		DAO studentDAO=new DAOImpl();
		List<Student> readStudent=studentDAO.displayStudent();
		return readStudent;
		
	}

}
