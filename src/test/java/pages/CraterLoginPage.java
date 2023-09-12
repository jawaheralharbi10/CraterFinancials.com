package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterLoginPage {

	public CraterLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (name = "email")
	public WebElement craterlogin_page_email;
	
	@FindBy (name = "password")
	public WebElement craterlogin_page_password;
	
	@FindBy (linkText = "Forgot Password?")
	public WebElement craterlogin_page_forgotpassword;
	
	@FindBy (xpath = "//button[@type= 'submit']")
	public WebElement craterlogin_page_loginBtn;
	
	@FindBy (xpath = "//p[contains(text(),'Copyright @')]")
	public WebElement craterlogin_page_copyright_text;
	
	@FindBy (xpath = "//h1[contains(text(),'Simple Invoicing')]")
	public WebElement craterlogin_page_SIFISB;
	
	@FindBy (xpath = "//p[contains(text(),'helps you track expenses')]")
	public WebElement craterlogin_page_Crater_bottomText;
}
