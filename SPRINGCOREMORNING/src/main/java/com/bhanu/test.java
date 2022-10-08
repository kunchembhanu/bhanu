package com.bhanu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

	public static void main(String[] args) {
		Resource rs= new ClassPathResource("applicationContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory bn=new XmlBeanFactory(rs);
		Employee emp = (Employee) bn.getBean("emp");
		emp.disp();
		

	}

}
