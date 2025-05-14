package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Product;

public class DemoTest {

	public static void main(String[] args) {
		// load persisten.xml file and get persistence unit name which hold 
		// database details and entity class details 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProductCRUDExample");
	// Configuration con = new Configuration();
	//con.buildConfiguraton("hibernate.cfg.xml");
	// equals to Connection in jdbc or equal to SessionFactory in hibernate 
	
	EntityManager manager = emf.createEntityManager();
	// PreparedStatemnt or Statement in jdbc or Session in Hibernate 
	// SessionFactory sf = con.buildSessionFactory();
	
	EntityTransaction tran = manager.getTransaction();
	
	Product p1 = new Product();
	p1.setPid(100);
	p1.setPname("Pen Drive");
	p1.setPrice(1600);
	
				tran.begin();
					manager.persist(p1);     // insert query in hibernate method is save 
				tran.commit();
				
				System.out.println("Record inserted succesfully");
	}

}
