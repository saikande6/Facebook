package seleinumdemo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class LogIn extends Demoseleinum{
 
	LoginProperties page;
  @BeforeClass
  public void beforeClass() {
	  browserLaunch("chrome", "http://www.facebook.com");
  }
  
  @Test
  public void registration() throws Exception
  {
	  page=new LoginProperties(driver);
	  page.Usersignup();
  }

 

}


