package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDAO depdao = DaoFactory.creteDepartmentDao();
		
		Department department = new Department(null, "CQ");
		//depdao.insert(department);
		
		//department = depdao.findById(3);
		//department.setName("Mkt");
		//depdao.update(department);
		
		depdao.deleteById(8);
		
		List<Department> list = depdao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		
	}
}
