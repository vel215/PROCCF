package CCF.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CCF.base.Testbase;
import CCF.util.datepicker;

public class addvisitor extends Testbase {
	datepicker date=new datepicker();
	
	 @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/select[1]")WebElement selectdrop;
 	 @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]")WebElement name;
 	 @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")WebElement phone;
     @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]")WebElement id;
     @FindBy(xpath="//body/div[@id='myModal']/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")WebElement person;
     @FindBy(css="input#date")WebElement dat;
     @FindBy(xpath="//textarea[@id='description']")WebElement txt;
     
public addvisitor() {
	PageFactory.initElements(driver, this);
}
public void clkaddvisitor(String data[] ) {
	String currentdir=System.getProperty("user.div");
	 Select drop=new Select(selectdrop);
		 drop.selectByValue(data[0]);
		 name.sendKeys(data[1]);
		 phone.sendKeys(data[2]);
		 id.sendKeys(data[3]);
		 person.sendKeys(data[4]);
		 dat.click();
		 date.datpicker(data[5]);	
	     txt.sendKeys(data[6]);
	 
}

}
