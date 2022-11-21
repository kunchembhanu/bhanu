package bhanu.com.Hibernatewithannotaions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class test 
{
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	            
	    Student s1=new Student();    
	    s1.setId(101);    
	    s1.setFirstname("harshi");    
	    s1.setLastname("bhavya");    
	        
	    session.delete(s1);  
	    t.commit();  
	    System.out.println("Fine.");    
	    factory.close();  
	    session.close();    
	        
	}   }


