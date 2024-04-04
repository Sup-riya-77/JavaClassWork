package studentAssignment.dao;
import java.util.List;

import studentAssignment.exceptions.StudentNotFoundException;
import studentAssignment.model.Student;
public interface DAO {
	public String addStudent(Student student);
	public Student displayStudent(Integer id) throws StudentNotFoundException;
	public List<Student> displayStudent(String city) throws StudentNotFoundException;
	public List<Student> displayStudent();

}
