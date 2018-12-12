package problem4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import problem2.Product;
import problem2.ProductDAO;

public class AOPTest {
	public void totalMethod() {
		ApplicationContext o=new ClassPathXmlApplicationContext("applicationContext2.xml");
		ProductDAO dao=(ProductDAO)o.getBean("dao");
		List<Product>list4=dao.listDetails();
		
		Product p=list4.get(1);
		System.out.println("Total: "+p.getPrice()*p.getQuantity());
		System.out.println("Test Method");
	}
}
