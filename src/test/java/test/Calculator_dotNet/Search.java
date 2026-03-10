package test.Calculator_dotNet;



import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Search extends Launch_webderiver  {
	
	@Test
	void search_cal() {
		driver.findElement(By.id("calcSearchTerm"))
	      .sendKeys("BMI Calculator");

	driver.findElement(By.id("bluebtn"))
	      .click();
	}
}