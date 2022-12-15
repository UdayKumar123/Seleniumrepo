package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcelogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//to locate a web element
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Testleaf$321");
		WebElement login = driver.findElement(By.className("Login"));
		login.click();
		

	}

}
