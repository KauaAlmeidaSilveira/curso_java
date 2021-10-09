package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		
		Department dep = departmentDao.findById(1);
		
		System.out.println(dep);
		
		System.out.println();
		
		System.out.println("=== TEST 2: findAll =======");
		
		List<Department> list = departmentDao.findAll();
		
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 3: Insert =======");
		
		Department newDep = new Department(null, "Music");
		
		departmentDao.insert(newDep);
		
		System.out.println("Inserted! New id: " + newDep.getId());
		
		
		System.out.println();
		
		
		System.out.println("=== Test 4: Department Update ===");
		
		Department dep2 = departmentDao.findById(10);
		
		dep2.setName("Toys");
		
		departmentDao.update(dep2);
		
		System.out.println("Update completed");
		
		System.out.println("=== Test 5: Department Delete ===");
		
		System.out.println("Write the id of department you want delete: ");
		int id = sc.nextInt();
		
		departmentDao.deleteById(id);
		
		System.out.println("Delete completed");
		
		sc.close();
	}

}
