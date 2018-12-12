package problem3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[]args) {
		ApplicationContext o=new ClassPathXmlApplicationContext("applicationContext4.xml");
		AOPTest obj=(AOPTest)o.getBean("ob");
		System.out.println(obj.Calc());
		
		//hr? dra?
	}
}
