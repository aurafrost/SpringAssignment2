package problem1;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext o=new ClassPathXmlApplicationContext("applicationContext1.xml");
		AccountDAO dao=(AccountDAO)o.getBean("dao");
		/*
		Account a1=new Account();
		a1.setId(1);
		a1.setName("Joe");
		a1.setAddress("123 Main Street");
		a1.setAge(23);
		a1.setCity("Atlanta");
		a1.setIdentityProof("Drivers License");
		
		Account a2=new Account();
		a2.setId(2);
		a2.setName("Phil");
		a2.setAddress("7412 Bill Hwy");
		a2.setAge(23);
		a2.setCity("Atlanta");
		a2.setIdentityProof("Birth Certificate");
		
		Account a3=new Account();
		a3.setId(3);
		a3.setName("Earl");
		a3.setAddress("9 Grove Street");
		a3.setAge(23);
		a3.setCity("Atlanta");
		a3.setIdentityProof("Drivers License");
		
		Account a4=new Account();
		a4.setId(4);
		a4.setName("Hans");
		a4.setAddress("25 Main Street");
		a4.setAge(23);
		a4.setCity("Atlanta");
		a4.setIdentityProof("Drivers License");
		
		Account a5=new Account();
		a5.setId(5);
		a5.setName("Millie");
		a5.setAddress("51 Archer Rd");
		a5.setAge(15);
		a5.setCity("Dallas");
		a5.setIdentityProof("SSN");
		
		Account a6=new Account();
		a6.setId(6);
		a6.setName("Dan");
		a6.setAddress("84 Side Street");
		a6.setAge(21);
		a6.setCity("Atlanta");
		a6.setIdentityProof("Drivers License");
		
		Account a7=new Account();
		a7.setId(7);
		a7.setName("Vin");
		a7.setAddress("12 Lincoln Street");
		a7.setAge(93);
		a7.setCity("Atlanta");
		a7.setIdentityProof("Birth Certificate");
		
		Account a8=new Account();
		a8.setId(8);
		a8.setName("Moe");
		a8.setAddress("92 Main Street");
		a8.setAge(41);
		a8.setCity("Dallas");
		a8.setIdentityProof("Drivers License");
		
		Account a9=new Account();
		a9.setId(9);
		a9.setName("Anne");
		a9.setAddress("1235 Main Street");
		a9.setAge(42);
		a9.setCity("Memphis");
		a9.setIdentityProof("Drivers License");
		
		Account a10=new Account();
		a10.setId(10);
		a10.setName("Bill");
		a10.setAddress("123 Side Street");
		a10.setAge(60);
		a10.setCity("Paris");
		a10.setIdentityProof("Drivers License");
		
		dao.saveRecord(a1);
		dao.saveRecord(a2);
		dao.saveRecord(a3);
		dao.saveRecord(a4);
		dao.saveRecord(a5);
		dao.saveRecord(a6);
		dao.saveRecord(a7);
		dao.saveRecord(a8);
		dao.saveRecord(a9);
		dao.saveRecord(a10);
		*/
		
		//1c
		List<Account>list=dao.findByAge(50);
		for(Account a:list) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getAddress()+", "+a.getAge()+", "+a.getCity()+", "+a.getIdentityProof());
		}
		System.out.println();
		//1d
		List<Account>list2=dao.findByCity("Atlanta");
		for(Account a:list2) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getAddress()+", "+a.getAge()+", "+a.getCity()+", "+a.getIdentityProof());
		}
		System.out.println();
		//1e. Note: I called it Drivers License. Same point.
		List<Account>list3=dao.findByProof("Drivers License");
		for(Account a:list3) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getAddress()+", "+a.getAge()+", "+a.getCity()+", "+a.getIdentityProof());
		}
		System.out.println();
		//delete record
		Account ad=new Account();
		ad.setId(10);
		dao.deleteRecord(ad);
		
		//update record
		Account up=new Account();
		up.setId(9);
		up.setAddress("123 Side Street");
		up.setCity("Paris");
		dao.updateRecord(up);
		
		//list final results
		List<Account>list4=dao.listDetails();
		for(Account a:list4) {
			System.out.println(a.getId()+", "+a.getName()+", "+a.getAddress()+", "+a.getAge()+", "+a.getCity()+", "+a.getIdentityProof());
		}
	}

}
