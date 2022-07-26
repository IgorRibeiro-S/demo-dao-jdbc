package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = DaoFactory.creteSellerDao();
		
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}

	}

}
