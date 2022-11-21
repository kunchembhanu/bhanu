package bhanu.com;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class test1 {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	        
	    TypedQuery query=session.createQuery("from Customer");    
	    List<Customer> list=query.getResultList();    
	        
	    Iterator<Customer> itr=list.iterator();    
	    while(itr.hasNext()){    
	        Customer q=itr.next();    
	        System.out.println("Question Name: "+q.getCname());    
	            
	        //printing answers    
	        List<Order> list2=q.getAnswers();    
	        Iterator<Order> itr2=list2.iterator();    
	       while(itr2.hasNext())  
	       {  
	        Order a=itr2.next();  
	            System.out.println(a.getOname());  
	        }    
	    }  
	    session.close();    
	    System.out.println("success");    
	}    
	  

	}


