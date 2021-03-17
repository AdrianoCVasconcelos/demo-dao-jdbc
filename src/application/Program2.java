package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;




public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: insert =======");
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);   
	    System.out.println("Inserted! New id = "+ newDepartment.getId());
	    
		System.out.println("\n=== TEST 2: department update =======");
	    Department department = departmentDao.findById(2);
	    System.out.println(department);
	    department.setName("Kids Toy");
	    departmentDao.update(department);
	    System.out.println("Update completed");
	    
	    System.out.println("\n==== Test 3: department findById ====");
		department = departmentDao.findById(2);
		System.out.println(department);
	}
}
