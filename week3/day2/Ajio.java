package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.ajio.com");
		
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='Men']")).click();
        String text2 = driver.findElement(By.xpath("//label[@for='Men']")).getText();
    	System.out.println(text2);
        Thread.sleep(2000);
    	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
    	String text = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).getText();
	System.out.println(text);
	List<WebElement> brandlist = driver.findElements(By.className("brand"));
	
	System.out.println(" Size of brandlist :" + brandlist.size());
	for (WebElement webElement : brandlist) {
		String name=webElement.getText();
		System.out.println(name);
		List<WebElement> bagname = driver.findElements(By.className("nameCls"));
	System.out.println(" Size of bagname :"+ bagname.size());
	for(WebElement webElement1 : bagname) {
		String name1=webElement1.getText();	
		System.out.println(name1);
	}
	
	}
	}

}
