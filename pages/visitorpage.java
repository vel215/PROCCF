package CCF.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CCF.base.Testbase;

public class visitorpage extends Testbase {
     	 @FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.ptbnull > div > a")WebElement addvisitor;
         @FindBy(css="h4.box-title")WebElement adtxt;
         
     	public visitorpage(){
   		 PageFactory.initElements(driver, this);
   	 }
     	public boolean logo()
        {
    		return adtxt.isDisplayed();
        }
     	 public  addvisitor visitpage1(){
   		 addvisitor.click();
		return new addvisitor();
		
			
		
     	 }
	}

