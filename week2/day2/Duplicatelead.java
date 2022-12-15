package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Democsr");
		WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Email")).click();
        WebElement emailaddress = driver.findElement(By.name("emailAddress"));
        emailaddress.sendKeys("udayan2992@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.linkText("udayakumar")).getText();
	    System.out.println(text);
	    //String text2 = driver.findElement(By.linkText("19213")).getText();
	   // System.out.println(text2);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	    
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    System.out.println(driver.getTitle());
	
	    driver.findElement(By.className("smallSubmit")).click();
	   String text3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	   System.out.println(text3);
	if (text.contentEquals(text3)) {
		System.out.println("The duplicated lead name is same as captured name");
	}else {
		System.out.println("The duplicated lead name is not same as captured name");
	}
		
	}
		
	
	   
		
	}
		
	
	
	


