package bhanu.com;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class sampleTest
{
	sample obj;
	
	@BeforeAll
	public static void beforeclass()
	{
		System.out.println("Before all test cases");
	}
  @AfterAll
  public static void afterclass()
	{
		System.out.println("After all test cases");
	}
   @BeforeEach
   public void setup()
   {
	   System.out.println("before test method");
	   obj=new sample();
   }
   @AfterEach
   public void setdown()
   {
	   System.out.println("after test method");
	   obj =null;
   }
   @Test
   public void testadd()
   {
	   System.out.println("test add method");
	   assertEquals(40, obj.add(20,20));
   }
   @Test
   public void testsub()
   {
	   System.out.println("test sub method");
	   assertEquals(30, obj.sub(60,30));
   }
   @Test
   public void testmul()
   {
	   System.out.println("test mul method");
	   assertEquals(600, obj.mul(30,20));
   }
   @Test
   public void testGreet()
   {
	   System.out.println("test greet method");
	   assertEquals("Hi", obj.greet("Hi"));
   }
}
