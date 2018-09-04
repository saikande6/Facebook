package seleinumdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginProperties extends Demoseleinum {
	
 
	//Login process
	
	@FindBy(id="email")public WebElement username;
	@FindBy(id="pass")public WebElement password;	
	@FindBy(xpath="//input[@id=\"u_0_2\"]")public WebElement Login;
	
	//Registration Process
	@FindBy(xpath="//input[@id=\"u_0_j\"]")public WebElement fname;
	@FindBy(xpath="//*[@id=\"u_0_l\"]")public WebElement sname;
	@FindBy(xpath="//input[@id=\"u_0_o\"]")public WebElement mobile;
	@FindBy(xpath="//input[@id=\"u_0_v\"]")public WebElement npass;
	@FindBy(id="day")public WebElement day;
	@FindBy(id="month")public WebElement month;
	@FindBy(id="year")public WebElement year;
	@FindBy(xpath="//*[@id='u_0_z']/span[2]")public WebElement gender;
	@FindBy(xpath="//*[@id=\"u_0_11\"]")public WebElement signup;
	
	
	
	public LoginProperties(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void UserLogin()
	{
		
		username.sendKeys("saikande6@gmail.com");
		password.sendKeys("password");
		Login.click();
	}
public void Usersignup() {
	fname.sendKeys("sai");
	sname.sendKeys("kande");
	mobile.sendKeys("9985900090");
	npass.sendKeys("Ksai123@");
	day.sendKeys("26");
	month.sendKeys("july");
	year.sendKeys("1994");
	gender.click();
	signup.click();
}
	
}
