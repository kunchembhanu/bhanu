package bhanu.com;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class test {

	public static void main(String[] args) {
		  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		      
		    Transaction t=session.beginTransaction();    
		        
		    Order ord1=new Order();    
		    ord1.setOname("White rice");    
		      
		        
		    Order ord2=new Order();    
		    ord2.setOname("Color rice");    
		       
		        
		    
		        
		    ArrayList<Order> list1=new ArrayList<Order>();    
		    list1.add(ord1);    
		    list1.add(ord2);    
		        
		       
		        
		    Customer c1=new Customer();    
		   c1.setCname("Bhanu");    
		   c1.setAnswers(list1);    
		        
		      
		        
		    session.persist(c1);    
		       
		        
		    t.commit();    
		    session.close();    
		    System.out.println("success");    
		}    
		}   