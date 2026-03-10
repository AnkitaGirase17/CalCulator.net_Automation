package test.Calculator_dotNet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Math_fun extends Launch_webderiver {

	@Test(priority =0)
	void addition() {
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =1)
	void substraction() {
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =2)
	void multiplication() {
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =3)
	void division() {
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =4)
	void Ans_btn() {
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[5]")).click();
	}

	@Test(priority =5)
	void back() {
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();
	}

	@Test(priority =6)
	void ten_raiseto() {
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =7)
	void random() {
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
	}

	@Test(priority =8)
	void ntv_ptv_no() {
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =9)
	void sin() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =10)
	void cos() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =11)
	void tan() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[1]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =12)
	void sin_1() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =13)
	void cos_1() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =14)
	void tan_1() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =15)
	void pie() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =16)
	void e() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[2]/span[5]")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =17)
	void x_raisedto_y() {
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[3]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =18)
	void x_rasisedto_3() {
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =19)
	void x_raisedto_2() {
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =20)
	void e_raisedto_x() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[3]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =21)
	void ten_raisedto_x() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[3]/span[5]")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
	}

	@Test(priority =22)
	void y_root_x() {
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =23)
	void cuberoot_x() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[4]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='7']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =24)
	void sqrroot_x() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[4]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =25)
	void natuaral_log() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[4]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =26)
	void log() {
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[4]/span[5]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =27)
	void reciprocal() {
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[5]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =28)
	void percentage() {
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[4]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =29)
	void factoiral() {
		driver.findElement(By.xpath("//span[text()='6']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[5]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}

	@Test(priority =30)
	void brac() {
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[5]/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='0']")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[5]/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
	}
	@Test(priority = 31)
	void his() {
		System.out.println(driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[3]")).getText());
	}

	@Test(priority = 32)
	void memory_add() {
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='M+']")).click();
	}

	@Test(priority = 33)
	void memory_recall() {
		driver.findElement(By.xpath("//span[text()='5']")).click();
		driver.findElement(By.xpath("//span[text()='M+']")).click();
		driver.findElement(By.xpath("//span[text()='MR']")).click();
	}

	@Test(priority = 34)
	void memory_subtract() {
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='M+']")).click();
		driver.findElement(By.xpath("//span[text()='4']")).click();
		driver.findElement(By.xpath("//span[text()='M-']")).click();
		driver.findElement(By.xpath("//span[text()='MR']")).click();
	}


	@Test(priority = 35)
	void radian() {
		driver.findElement(By.id("scirdsettingr")).click();
		driver.findElement(By.xpath("//*[@id='homefunbtn']/div[1]/span[3]")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();
	}

	
}