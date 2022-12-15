package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Udayakumar");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Dayalan");
		WebElement Mobilenumber = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
		Mobilenumber.sendKeys("9677012756");
		WebElement password = driver.findElement(By.xpath("//input[contains(@aria-label,'New password')]"));
		password.sendKeys("Daya@1342");
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByValue("17");
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByValue("9");
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("1992");
		driver.findElement(By.className("_58mt")).click();
		
	}

}
