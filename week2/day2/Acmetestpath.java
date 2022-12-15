package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acmetestpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
        WebElement user = driver.findElement(By.id("email"));
        user.sendKeys("kumar.testleaf@gmail.com");
        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("leaf@12");
        WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        login.click();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Log Out")).click();
        driver.close();
	}

}
