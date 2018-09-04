package seleinumdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demoseleinum {
	
	public static WebDriver driver;
	
/*public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","D:\\softwares\\seleiunm\\chrome\\chromedriver.exe");
    driver = new ChromeDriver();
    
     driver.get("https://www.Facebook.com");
     
     driver.manage().window().maximize();
}*/
     
    // driver.navigate().back();
     
   
    /* 
     driver.navigate().refresh();
     String psource = driver.getCurrentUrl();
     System.out.println(psource);
     
     
     driver.close();
     
     driver.quit();
     
     driver.findElement(By.id("loginsubmit")).click();
     Set<String> whandles = driver.getWindowHandles();
	for(String i : whandles)
	{
		System.out.println(i);
	}
       
      String url = driver.getCurrentUrl();
     
     driver =new FirefoxDriver();
     driver.get("https://www.bigtrolly.com");
     driver.navigate ().to(url);
}*/
     public static void browserLaunch(String browser,String url){
    	 
     
     {
    	
 		if(browser.equalsIgnoreCase("CHROME"))
 		{
 			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
 			driver=new ChromeDriver();
 		}
 		else if(browser.equalsIgnoreCase("FF"))
 		{
 			driver=new FirefoxDriver();
 		}
 		else if(browser.equalsIgnoreCase("IE"))
 		{
 			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
 			driver=new InternetExplorerDriver();
 		}
 		
 		//driver.get(url);
 		
 		driver.navigate().to(url);
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	}

}
}

