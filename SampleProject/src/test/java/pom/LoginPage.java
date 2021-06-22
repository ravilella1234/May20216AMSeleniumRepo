package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email")public WebElement userEmail;
	@FindBy(id="passwd")public WebElement userPassword;
	@FindBy(id="SubmitLogin")public WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement getLoginError;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin() throws Exception
	{
		signIn.click();
		Thread.sleep(4000);
		userEmail.sendKeys("qatest985498@gmail.com");
		userPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public String verifyLogin()
	{
		return getLoginError.getText();
	}
	
	
	

}
