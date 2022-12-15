package week2.day2;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

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
       
        WebElement findname = driver.findElement(By.id("ext-gen248"));
        findname.sendKeys("udayakumar");
        Thread.sleep(2000);
        driver.findElement(By.id("ext-gen334")).click();
        Thread.sleep(2000);
        WebElement lead = driver.findElement(By.linkText("18548"));
       lead.click();
       driver.getTitle();
       System.out.println(driver.getTitle());
       driver.findElement(By.linkText("Edit")).click();
      
      WebElement companyname = driver.findElement(By.xpath("//input[@value='Ramco']"));
      Thread.sleep(2000);
    companyname.clear();
    WebElement newcompany = driver.findElement(By.id("updateLeadForm_companyName"));
    newcompany.sendKeys("flex");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Update']")).click();
	driver.close();	
	}
}
	
	

    
    	
		
	
  
   
   
    

      
      
      
       
      
     

	


