package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class frameassignemt1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//load url
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement frames = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("selenium");
		WebElement frames2 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(frames2);
		driver.findElement(By.id("a")).click();
		
	////before switching to frame 2, exit from frame 1 use default content
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		//to select dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		//creating object
		Thread.sleep(1000);
		Select name = new Select(dropdown);
		name.selectByVisibleText("Baby Cat");
		
	
		
	}

}
