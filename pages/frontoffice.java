package CCF.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CCF.base.Testbase;

public class frontoffice extends Testbase {
	@FindBy(css="h3.box-title titlefix")WebElement txt;
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > div > a:nth-child(1)")WebElement addappoint;
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > div > a:nth-child(2)")WebElement visitor;
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > div > a:nth-child(3)")WebElement phonecallog;
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > div > a:nth-child(4)")WebElement postal;
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > div > a:nth-child(5)")WebElement complain;
	
public frontoffice (){
	PageFactory.initElements(driver, this);
}

public void addpointment(){
	addappoint.click();	
}
public visitorpage clkvisitorpage(){
	visitor.click();
	return new visitorpage();
}
public void phonecalllog(){
	phonecallog.click();
}
public void postal1(){
	postal.click();
}
public void complain1(){
	complain.click();
}
}
