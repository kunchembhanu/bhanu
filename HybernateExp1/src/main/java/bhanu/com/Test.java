package bhanu.com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction ts = session.beginTransaction();
		
		Customer cobj = new Customer();
		
		cobj.setOrdername("bhanu");
		cobj.setLocation("PNG");
		
		session.persist(cobj);
		
		ts.commit();
		
		session.close();
		
		System.out.println("Done.");
	}
	}


