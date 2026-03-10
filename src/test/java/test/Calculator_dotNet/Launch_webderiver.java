package test.Calculator_dotNet;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class Launch_webderiver {
	
	 ChromeDriver driver;

	 @BeforeClass
	    public void launch() {

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.calculator.net/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	    
	    @AfterClass
	    public void closeBrowser() {
	        driver.quit();
	    }


}
