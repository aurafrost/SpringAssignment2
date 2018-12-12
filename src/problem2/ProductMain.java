package problem2;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext o=new ClassPathXmlApplicationContext("applicationContext2.xml");
		ProductDAO dao=(ProductDAO)o.getBean("dao");
		/*
		Product p1=new Product();
		p1.setId(1);
		p1.setName("Apple");
		p1.setDescription("some fruit");
		p1.setQuantity(23);
		p1.setPrice(10.23);
		p1.setCategory("fruit");
		
		Product p2=new Product();
		p2.setId(2);
		p2.setName("Sprouts");
		p2.setDescription("some veggie");
		p2.setQuantity(932);
		p2.setPrice(92.23);
		p2.setCategory("vegetable");
		
		Product p3=new Product();
		p3.setId(3);
		p3.setName("Hangar");
		p3.setDescription("something");
		p3.setQuantity(512);
		p3.setPrice(3.23);
		p3.setCategory("product");
		
		Product p4=new Product();
		p4.setId(4);
		p4.setName("Doll");
		p4.setDescription("some toy");
		p4.setQuantity(1263);
		p4.setPrice(8.91);
		p4.setCategory("toy");
		
		Product p5=new Product();
		p5.setId(5);
		p5.setName("Broccoli");
		p5.setDescription("some veggie");
		p5.setQuantity(84);
		p5.setPrice(4.82);
		p5.setCategory("vegetable");
		
		Product p6=new Product();
		p6.setId(6);
		p6.setName("Pie");
		p6.setDescription("some pie");
		p6.setQuantity(451);
		p6.setPrice(32.23);
		p6.setCategory("food");
		
		Product p7=new Product();
		p7.setId(7);
		p7.setName("Coconuts");
		p7.setDescription("some fruit");
		p7.setQuantity(23);
		p7.setPrice(10.23);
		p7.setCategory("fruit");
		
		Product p8=new Product();
		p8.setId(8);
		p8.setName("Orange");
		p8.setDescription("some fruit");
		p8.setQuantity(23);
		p8.setPrice(13.25);
		p8.setCategory("fruit");
		
		Product p9=new Product();
		p9.setId(9);
		p9.setName("Peas");
		p9.setDescription("some veggie");
		p9.setQuantity(3);
		p9.setPrice(5.34);
		p9.setCategory("vegetable");
		
		Product p10=new Product();
		p10.setId(10);
		p10.setName("Banana");
		p10.setDescription("some fruit");
		p10.setQuantity(43);
		p10.setPrice(1.23);
		p10.setCategory("fruit");
		
		dao.saveRecord(p1);
		dao.saveRecord(p2);
		dao.saveRecord(p3);
		dao.saveRecord(p4);
		dao.saveRecord(p5);
		dao.saveRecord(p6);
		dao.saveRecord(p7);
		dao.saveRecord(p8);
		dao.saveRecord(p9);
		dao.saveRecord(p10);
		*/
		//2c
		List<Product>list3=dao.findByCategory("fruit");
		for(Product a:list3) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getDescription()+", "+a.getQuantity()+", "+a.getPrice()+", "+a.getCategory());
		}
		System.out.println();
		//2d
		List<Product>list=dao.findByQuantity(10);
		for(Product a:list) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getDescription()+", "+a.getQuantity()+", "+a.getPrice()+", "+a.getCategory());
		}
		System.out.println();
		//2e
		List<Product>list2=dao.findByPrice(20,40);
		for(Product a:list2) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getDescription()+", "+a.getQuantity()+", "+a.getPrice()+", "+a.getCategory());
		}
		System.out.println();
		
		//delete record
		Product ad=new Product();
		ad.setId(10);
		dao.deleteRecord(ad);
		
		//update record
		Product up=new Product();
		up.setId(9);
		up.setDescription("some new description");
		up.setQuantity(1000);
		dao.updateRecord(up);
		
		//list final results
		List<Product>list4=dao.listDetails();
		for(Product a:list4) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getDescription()+", "+a.getQuantity()+", "+a.getPrice()+", "+a.getCategory());
		}
	}

}
