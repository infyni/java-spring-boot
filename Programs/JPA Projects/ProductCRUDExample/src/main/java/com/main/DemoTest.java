package com.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	// Insert Query 
	
//	Product p1 = new Product();
//	p1.setPid(100);
//	p1.setPname("Pen Drive");
//	p1.setPrice(1600);
//	
//				tran.begin();
//					manager.persist(p1);     // insert query in hibernate method is save 
//				tran.commit();
//				
//				System.out.println("Record inserted succesfully");
	
	// Delete Query 
	// 1st parameter class reference and 2nd parameter primary key value 
	
//	Product dbProduct = manager.find(Product.class, 105);
//	if(dbProduct==null) {
//		System.out.println("Product not present");
//	}else {
//		tran.begin();
//			manager.remove(dbProduct);			//delete query 
//		tran.commit();
//		System.out.println("Product removed...");
//	}
//	}
	
	// update the product 
//	Product dbProduct = manager.find(Product.class, 104);
//	if(dbProduct==null) {
//		System.out.println("Product not present");
//	}else {
//		tran.begin();
//			dbProduct.setPrice(65000);
//			manager.merge(dbProduct);			// update query 
//		tran.commit();
//		System.out.println("Product updated successfully.");
//	}
	
	// find the Product using pid
//	Product dbProduct = manager.find(Product.class, 1000);
//	if(dbProduct==null) {
//		System.out.println("Product not present");
//	}else {
//		System.out.println(dbProduct);		// call toString method 
//	}
//	// retrieve more than one records using JPQL language retrieve full object. 
//	Query qry  = manager.createQuery("select p from Product p");
//	List<Product> listOfProducts = qry.getResultList();   // directly converted all query into list of object. 
//	System.out.println("Number of records "+listOfProducts.size());
//	
//	// code of main class or view technologies ie jsp 
//	Iterator<Product> li = listOfProducts.iterator();
//	while(li.hasNext()) {
//		Product p = li.next();
//		System.out.println(p);
//	}
	
//	// retrieve only product pid 
//		Query qry  = manager.createQuery("select p.pid from Product p");
//		List<Integer> listOfProducts = qry.getResultList();    
//		System.out.println("Number of records "+listOfProducts.size());
//		
//		// code of main class or view technologies ie jsp 
//		Iterator<Integer> li = listOfProducts.iterator();
//		while(li.hasNext()) {
//			int pid = li.next();
//			System.out.println(pid);
//		}
	
//	// retrieve only product pname 
//			Query qry  = manager.createQuery("select p.pname from Product p");
//			List<String> listOfProducts = qry.getResultList();    
//			System.out.println("Number of records "+listOfProducts.size());
//			
//			// code of main class or view technologies ie jsp 
//			Iterator<String> li = listOfProducts.iterator();
//			while(li.hasNext()) {
//				String pname = li.next();
//				System.out.println(pname);
//			}
	
	
	// retrieve  product pname and price 
//				Query qry  = manager.createQuery("select p.pname,p.price from Product p");
//				List<Object[]> listOfProducts = qry.getResultList();    
//				System.out.println("Number of records "+listOfProducts.size());
//				
//				// code of main class or view technologies ie jsp 
//				Iterator<Object[]> li = listOfProducts.iterator();
//				while(li.hasNext()) {
//					Object [] rec = li.next();
//					System.out.println("PName "+rec[0]+" Price "+rec[1]);
//				}
	
	
//	// retrieve more than one records using JPQL language retrieve full object with where clause 
	//Query qry  = manager.createQuery("select p from Product p");
	
	// condition with static value 
	//Query qry  = manager.createQuery("select p from Product p where p.pid = 100");
	
	// condition with dynamic value with label query concept 
	//Query qry  = manager.createQuery("select p from Product p where p.pid = :id");
	//qry.setParameter("id", 100);
	

	// condition with dynamic value with ? concept 
	Query qry  = manager.createQuery("select p from Product p where p.pid = ?1");
	qry.setParameter(1, 100);

	
	List<Product> listOfProducts = qry.getResultList();   // directly converted all query into list of object. 
	System.out.println("Number of records "+listOfProducts.size());
	
	// code of main class or view technologies ie jsp 
	Iterator<Product> li = listOfProducts.iterator();
	while(li.hasNext()) {
		Product p = li.next();
		System.out.println(p);
	}
		}
	
	

}
