package Dec23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation2WithClass {
	
  @Test
  public void emp() {
	  System.out.println("i am from emp method");
  }
  
  @Test
  public void emp2() {
	  System.out.println("i am from emp2 method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }

}
