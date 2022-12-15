package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaplogin {

	public static void main(String[] args) {
		//to open a browser
		ChromeDriver driver = new ChromeDriver();
		//to application url
		driver.get("http://leaftaps.com/opentaps");
		//to locate a web element
		WebElement eleUser = driver.findElement(By.id("username"));
		//to interact with web element
		eleUser.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElement(By.id("password"));
	
		password.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		
		//to click on webelement
		
		login.click();
		
		

	}

}
