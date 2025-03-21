package encapsulation;

public class ProductTest {

	public static void main(String[] args) {
	Product p1 = new Product();
	p1.setPid(100);
	p1.setPname("TV");
	p1.setPrice(67000);
	p1.setQty(25);
	
	
	Product p2 = new Product(101, "Computer", 45000, 50);
			
	System.out.println("pid is "+p1.getPid());
	System.out.println("pname is "+p1.getPname());
	System.out.println("price is "+p1.getPrice());
	System.out.println("qty is "+p1.getQty());
	
	System.out.println("pid is "+p2.getPid());
	System.out.println("pname is "+p2.getPname());
	System.out.println("price is "+p2.getPrice());
	System.out.println("qty is "+p2.getQty());
	}

}
