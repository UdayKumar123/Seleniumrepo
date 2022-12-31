package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.nykaa.com/");
		WebElement ele = driver.findElement(By.xpath("//a[contains (text(),'brands')]"));
		//create object for action class
		Actions builder=new Actions(driver);
		//use appropriate method to do the actions
		builder.moveToElement(ele).perform();//perform is mandatory at the end
		driver.findElement(By.xpath("(//img[@alt='banner'])[5]")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]")).click();
		Thread.sleep(1000);
		//click  Category
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(1000);
		//click  Hair
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(1000);
		//click  Hair Care
		driver.findElement(By.xpath("(//span[contains(text(),'Hair Care')])[2]")).click();
		Thread.sleep(1000);
		//click  shampoo
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(1000);
		
		//click  concern
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		//click  color protection
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text = driver.findElement(By.xpath("//div[@class='css-1emjbq5']/span[1]")).getText();
        System.out.println(text);
        
        //clcik on L'Oreal Paris Colour Protect Shampoo
        driver.findElement(By.className("css-xrzmfa")).click();
        //switching into new window
        Set<String> windowHandles = driver.getWindowHandles();
	     List<String>listwindow = new ArrayList<String>(windowHandles);
	     driver.switchTo().window(listwindow.get(1));
	     //drop down to choose 175ml
	     WebElement dropdown = driver.findElement(By.xpath("//select[@title='SIZE']"));
	     Select name = new Select(dropdown);
	     name.selectByValue("0");
	     
	     //to print the MRP
	     String text2 = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
	     
	     System.out.println(text2);
	     //click on add to bag
	     driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	     //click on cart
	     driver.findElement(By.xpath("//span[@class='cart-count']")).click();
	     driver.switchTo().frame(0);
	     String text3 = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
	 	Thread.sleep(1000);
	     System.out.println(text3);
	     
	  // to click proceed
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//span[text()='Proceed']/..")).click();
	     //to click continue as guest
	     driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	  //cloase pop up
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
	     //getting total again
	    
	     String text4 = driver.findElement(By.xpath("//p[text()='Price Details']/following::p[2]")).getText();
	     
	    System.out.println(text4);
	    
	    driver.quit();
	
	  
	}

}
