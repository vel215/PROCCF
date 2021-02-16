package CCF.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CCF.base.Testbase;



public class login extends Testbase {
	 @FindBy(css="#email")WebElement username;
	 @FindBy(css="#password")WebElement password;
	 @FindBy(tagName="img")WebElement logo;
	 @FindBy(linkText="Forgot Password?")WebElement fpassword;
	 @FindBy(css="button.btn")WebElement btn;
	
	 
	 public login(){
		 PageFactory.initElements(driver, this);
	 }
	 public String verifypagetitle(){
		return driver.getTitle();
	 }
	 public boolean verifylogo(){
		return logo.isDisplayed();
	 }
	 public homepage login1(String uname,String pass){
		 username.sendKeys(uname);
		 password.sendKeys(pass);
		 btn.click();
		return new homepage();

	 }
	 
	private void verifytext() {
		// TODO Auto-generated method stub
		
	}
}
