package CCF.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import CCF.util.WebEventListener;

public class Testbase {
	//intilization
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener webel;

	//constructor
	public Testbase()
	{
		prop =new Properties();
			try {
				FileInputStream ipconfig = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CCF\\config\\config.properties");
				
					prop.load(ipconfig);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
			driver =new ChromeDriver();
			}
			else if(browsername.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
				driver=new FirefoxDriver();		
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		//Firing event 
				e_driver=new EventFiringWebDriver(driver);
				webel=new WebEventListener();
				e_driver.register(webel);
				driver=e_driver;
		}
	}

