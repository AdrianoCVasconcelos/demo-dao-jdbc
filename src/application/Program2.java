package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: insert =======");
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);   
	    System.out.println("Inserted! New id = "+ newDepartment.getId());
	    
		System.out.println("\n=== TEST 2: department update by Id=======");
	    Department department = departmentDao.findById(14);
	    department.setName("Eletronics");
	    departmentDao.update(department);
	    System.out.println("Update completed");
	    
	    System.out.println("\n==== Test 3: department findById ====");
		department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n==== Test 4: department deleteById ====");
		System.out.println("Enter id for delete test: ");
	    Scanner sc = new Scanner(System.in);
	    departmentDao.deleteById( sc.nextInt());
	    System.out.println("Delete completed");
	    
	    System.out.println("\n==== Test 5: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
	    
	    
	    
	    
	    sc.close();
	}
}
