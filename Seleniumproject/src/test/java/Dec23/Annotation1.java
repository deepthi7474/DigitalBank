package Dec23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotation1 {
  @Test
  public void emp()
  {
	  System.out.println("i am from emp method");
  }
  @Test
  public void emp1()
  {
	  System.out.println("i am from emp1 method");
  }
  @Test
  public void emp2()
  {
	  System.out.println("i am from emp2 method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("i am from before method");
	  
  }

  @AfterMethod
  public void afterMethod()
  {
	  
	  System.out.println("i am from after method");
  }

}
