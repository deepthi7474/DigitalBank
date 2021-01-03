package Dec23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationSuite {
	
@BeforeSuite
  public void beforeSuite() {
	System.out.println("i am from before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am from after suite");
  }

}
