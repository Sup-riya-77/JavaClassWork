package employeeAssignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	static List<Employee> list = new ArrayList<Employee>();
	static void addEmployee(Employee emp)
	{
		if(emp!=null) 
			{
			list.add(emp);
			System.out.println("Added Succesfully");
			}
		else System.out.println("Employee details are null");
	}
	
	static Employee getEmployee(int id)
	{
		for(Employee e :list)
		{
			if(e.getId()==id) return e;
		}
		return null;
		
	}

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Supriya","Patna");
		Employee emp2=new Employee(2,"Suriya","Chennai");
		Employee emp3=new Employee(3,"Swetha","Hyderabad");
		Employee emp4=new Employee(4,"Chikki","Banglore");
		Employee emp5=new Employee(5,"Akshay","Delhi");
		//adding the employees to list
		addEmployee(emp1);
		addEmployee(emp2);
		addEmployee(emp3);
		addEmployee(emp4);
		addEmployee(emp5);
		//fetching employee details
		Employee emp=getEmployee(3);
		System.out.println(emp);
		
		

	}

}
