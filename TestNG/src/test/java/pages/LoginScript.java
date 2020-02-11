package pages;



import org.openqa.selenium.By;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginScript extends BaseClass{
	
	
	@Test(priority=1, description="This Test Case perform valid Login")
	public void loginToApplication() {
	
	
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
			
			Reporter.log("=====Click on Login Button=====", true);
	}
	
	@Test(priority=2, description="This Test Case perform invalid Login")
	public void loginToApplication1() {
	
	
			driver.findElement(By.id("txtUsername")).sendKeys("Admin1");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin1234");
			driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
			
			Reporter.log("=====Click on Login Button=====", true);
	}
	
}
