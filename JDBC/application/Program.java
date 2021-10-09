package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

//import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
//import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: seller findById ===");
		
		Seller seller = sellerDao.findById(9);
		
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== Test 2: seller findByDepartment ===");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println();
		
		System.out.println("=== Test 3: seller findAll ===");
		
		list = sellerDao.findAll();
		
		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println();
		
		System.out.println("=== Test 4: seller insert ===");
		
		int aux = 0;
		
		if(aux == 0) {
			Seller newSeller = new Seller(null, "kaua", "kaua@gmail.com", new Date(), 7000.0, department);
			
			sellerDao.insert(newSeller);
			
			System.out.println("Inserted! New id = " + newSeller.getId());
		}
		
		System.out.println("Delete a command if()");
		
		System.out.println();
		
		System.out.println("=== Test 5: seller update ===");
		
		seller = sellerDao.findById(6);
		
		seller.setName("tiago");
		seller.setEmail("tiago@gmail.com");
		
		sellerDao.update(seller);
		
		System.out.println("Updated!");
		
		System.out.println();
		
		System.out.println("=== Test 6: seller delete ===");
		
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		
		System.out.println("Deleted!");
		
		
		sc.close();
	}

}
