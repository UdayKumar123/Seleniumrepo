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

public class Mergecontact {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Demosalesmanager");
		//Click on CRM/SFA Link
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//* 7. Click on Widget of From Contact
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::a")).click();
		
		//switching to window
		Set<String> windowHandles = driver.getWindowHandles();
	     List<String>listwindow = new ArrayList<String>(windowHandles);
	     driver.switchTo().window(listwindow.get(1));
	    
	   driver.findElement(By.linkText("DemoCustomer")).click();
	  
	   driver.switchTo().window(listwindow.get(0));
	   
	   
	   driver.findElement(By.xpath("//input[@id='partyIdFrom']//following::a[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
	     List<String>listwindow2 = new ArrayList<String>(windowHandles2);
	     driver.switchTo().window(listwindow2.get(1));
	     driver.findElement(By.linkText("dp1a1contact2")).click();
	     driver.switchTo().window(listwindow.get(0));
	     driver.findElement(By.linkText("Merge")).click();
	   //handling alert  
	   driver.switchTo().alert().accept();
	   Thread.sleep(5000);
	   System.out.println(driver.getTitle());
	       
	
	}

}
