package Dec23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationsBefoeTest {
  @Test
  public void emp() {
	  System.out.println("i am from emp method");
  }
  
  @Test
  public void emp1() {
	  System.out.println("i am from emp1 method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am from before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am from after test");
  }

}
