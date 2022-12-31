package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.snapdeal.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		//create object for action class
		Actions builder=new Actions(driver);
		//use appropriate method to do the actions
		builder.moveToElement(ele).perform();//perform is mandatory at the end
		//getting the count
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
        //sorting
        driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
	     WebElement amount = driver.findElement(By.xpath("//input[@value='489']"));
	     amount.clear();
	     driver.findElement(By.xpath("//input[@value='489']")).sendKeys("900");
	     WebElement amount2 = driver.findElement(By.xpath("//input[@value='975']"));
	     amount2.clear();
	     driver.findElement(By.xpath("//input[@value='975']")).sendKeys("1200");
	     driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	   Thread.sleep(1000);
	   //mouse hove on choosed product
	     WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
	     Actions builder2=new Actions(driver);
	     builder2.moveToElement(shoe).perform();
	     //clicking quick view
	     driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	     //getting cost and discount
	     String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
	     System.out.println(text2);
	     
	     //getting discount
	     String text3 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
	     System.out.println(text3);
	     Thread.sleep(1000);
	     File source = driver.getScreenshotAs(OutputType.FILE);
	     File target = new File("./snaps/snapdeal.png");
	     FileUtils.copyFile(source, target);
	     driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
	     driver.quit();
	     
	}

}
