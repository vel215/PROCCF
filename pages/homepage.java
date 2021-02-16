package CCF.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CCF.base.Testbase;

public class homepage extends Testbase {
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(1) > a > span")WebElement forntoffice;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(2) > a > span")WebElement outpatient;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(3) > a > span")WebElement inpatient;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(4) > a > span")WebElement pharmacy;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(5) > a > span")WebElement pathology;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(6) > a > span")WebElement radiology;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(7) > a > span")WebElement operation;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(8) > a > span")WebElement bloodbank;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(9) > a > span")WebElement tpa;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(10) > a > span")WebElement finance;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(1) > a")WebElement income;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(2) > a")WebElement expense;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(11) > a > span")WebElement amb;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(12) > a > span")WebElement HR;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(13) > a > span")WebElement mess;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(14) > a > span")WebElement DC;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(15) > a > span")WebElement inventory;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(16) > a > span")WebElement front;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(17) > a > span")WebElement report;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(1) > a")WebElement treport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(2) > a")WebElement opdreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(3) > a")WebElement ipdreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(4) > a")WebElement phabill;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(5) > a")WebElement pathreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(6) > a")WebElement radioreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(7) > a")WebElement otreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(8) > a")WebElement bloodissuereport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(9) > a")WebElement blooddonorreport; 
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(10) > a")WebElement incomereport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(11) > a")WebElement expensereport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(12) > a")WebElement ambreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(13) > a")WebElement payrollmonthreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(14) > a")WebElement payrollreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(15) > a")WebElement attenreport;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(16) > a")WebElement userlog;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(17) > a")WebElement patientlog;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(18) > a")WebElement email;
	 @FindBy(css="ul.sidebar-menu.verttop > li:nth-child(18) > a > span")WebElement setup;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(1) > a")WebElement setting;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(2) > a")WebElement charge;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(3) > a")WebElement bed;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(4) > a")WebElement printfooter;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(5) > a")WebElement foffice;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(6) > a")WebElement phar;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(7) > a")WebElement patha;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(8) > a")WebElement radio;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(9) > a")WebElement fin;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(10) > a")WebElement hur;
	 @FindBy(css="ul.sidebar-menu.verttop > li.treeview.active > ul > li:nth-child(11) > a")WebElement inven;
	 @FindBy(css="h3.box-title.titlefix")WebElement txt1;
public homepage(){
	PageFactory.initElements(driver,this);
}

public frontoffice  foroffice1(){
	forntoffice.click();
	return new frontoffice ();
}
public void forntoffice2()
{	
	 outpatient.click();
	 inpatient.click();
	 pharmacy.click();
	 pathology.click();
	 radiology.click();
	 operation.click();
	 bloodbank.click();
	 tpa.click();
	 finance.click();
	 income.click();
	 expense.click();
	 amb.click();
	 HR.click();
	 mess.click();
	 DC.click();
	 inventory.click();
	 front.click();
	 report.click();
	 treport.click();
	 opdreport.click();
	 ipdreport.click();
	 phabill.click();
	 pathreport.click();
	 radioreport.click();
	 otreport.click();
	 bloodissuereport.click();
	 blooddonorreport.click();
	 incomereport.click();
	 expensereport.click();
	 ambreport.click();
	 payrollmonthreport.click();
	 payrollreport.click();
	 attenreport.click();
	 userlog.click();
	 patientlog.click();
	 email.click();
	 attenreport.click();
	 setup.click();
	 setting.click();
	 charge.click();
	 bed.click();
	 printfooter.click();
	 foffice.click();
	 phar.click();
	 patha.click();
	 radio.click();
	 fin.click();
	 hur.click();
	 inven.click();
  }
}
