package week2.day2;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StringCoercer;
import org.openqa.selenium.support.ui.Select;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("DemosalesManager");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
        loginbutton.click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.linkText("Phone")).click();
        WebElement phone = driver.findElement(By.xpath("//input[contains(@style,'width: 152px')]"));
         phone.sendKeys("9677012756");
         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Delete")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        
        WebElement leads = driver.findElement(By.id("ext-gen246"));
       leads.sendKeys("18711");
       Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        String text= driver.findElement(By.className("x-paging-info")).getText();
        
		System.out.println(text);
		 
		driver.close();
		}
} 
       
         
         
     
            
        
	


