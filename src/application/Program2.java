package application;


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
	    
		System.out.println("\n=== TEST 2: insert =======");
	    
	}
}
