package test.Calculator_dotNet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sign_in extends Launch_webderiver{
	
	@Test
	public void click_signin_nav()
	{
		driver.findElement(By.linkText("sign in")).click();
	}
	
	
	@Test
	public void sign_in()
	{
		driver.findElement(By.name("email")).sendKeys("ankitagirase17@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("login")).getText());
	}
	
	
}
