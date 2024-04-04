package studentAssignment.dao;
import java.util.ArrayList;
import java.util.List;
import studentAssignment.exceptions.DataNotPresentException;
import studentAssignment.exceptions.StudentNotFoundException;
import studentAssignment.model.Student;
public class DAOImpl implements DAO {
	static List<Student> studentList=new ArrayList<Student>();

	@Override
	public String addStudent(Student student) {
		if(student!=null)
		{
			studentList.add(student);
			return "Student with StudentId "+student.getId()+" added Succesfully!";
		}
		else throw new DataNotPresentException("Unable to add Student");
	}

	@Override
	public Student displayStudent(Integer id) throws StudentNotFoundException {
		Student readStudent=null;
		for(Student s:studentList)
		{
			if(s.getId()==id)
				readStudent=s;
		}
		
		if(readStudent!=null)
		{
			return readStudent;
		}
		else throw new StudentNotFoundException("Student not found for given id");
		
	}

	@Override
	public List<Student> displayStudent(String city) throws StudentNotFoundException {
		List<Student> readStudent=new ArrayList<Student>();
		for(Student s:studentList)
		{
			if(s.getCity().equalsIgnoreCase(city))
				readStudent.add(s);

		}
		if(readStudent.isEmpty())
		{
			throw new StudentNotFoundException("Student not found for given city");
		}
		else return readStudent;
		
	}

	@Override
	public List<Student> displayStudent() {
		List<Student> readStudent=new ArrayList<Student>();
		for(Student s:studentList)
		{
				readStudent.add(s);
	    }
		return readStudent;
	   }
}
