package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Leaftapleaadreationusinglinktext {

	public static void main(String[] args) {
		//to open a browser
				ChromeDriver driver = new ChromeDriver();
				//to application url
				driver.get("http://leaftaps.com/opentaps");
				//to locate a web element
				WebElement eleUser = driver.findElement(By.id("username"));
				//to interact with web element
				eleUser.sendKeys("Democsr");
				
				WebElement password = driver.findElement(By.id("password"));
			
				password.sendKeys("crmsfa");
				
				WebElement login = driver.findElement(By.className("decorativeSubmit"));
			
			    login.click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Create Lead")).click();
		    WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		    companyname.sendKeys("accenture");
		    WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		    firstname.sendKeys("udayakumar");
		    WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		    lastname.sendKeys("Dayalan");
		    WebElement phonenumber = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']"));
		    phonenumber.sendKeys("9677012756");
		    WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		    email.sendKeys("udayan2992@gmail.com");
		    
		    WebElement sourcedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		    WebElement industrydropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		    WebElement ownershipdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId")); 
		    Select sourcedropdown1 = new Select (sourcedropdown);
		    Select industrydropdown1 = new Select (industrydropdown);
		    Select ownershipdropdown1 = new Select (ownershipdropdown);
		    sourcedropdown1.selectByVisibleText("Conference");
		    industrydropdown1.selectByValue("IND_FINANCE");
		    ownershipdropdown1.selectByIndex(5);
		    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		    
	}

		}