package smsSending;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	
		
		public void LoginToHomepage() throws InterruptedException
		{
			
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//System.out.println("Brouser has been lunched ");
		Thread.sleep(5000);
		driver.get("https://singleview.airtel.com.ng/peweb/");
		System.out.println("URL successfully lunched ");
			
		}
		
		
		
	

}
