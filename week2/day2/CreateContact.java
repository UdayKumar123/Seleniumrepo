package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemosalesManager");
		WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        WebElement firstname = driver.findElement(By.id("firstNameField"));
        firstname.sendKeys("Udayakumar");
        WebElement lastname = driver.findElement(By.id("lastNameField"));
        lastname.sendKeys("Dayalan");
        WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
	    department.sendKeys("Project Management office");
	    WebElement description = driver.findElement(By.id("createContactForm_description"));
	    description.sendKeys("I have been working in Project management office vertical for around 7.4 years");
	    WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
	    email.sendKeys("udayan2992@gmail.com");
	    WebElement stateprovine = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select stateprovince1 = new Select(stateprovine);
	    stateprovince1.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    WebElement importantnote = driver.findElement(By.id("updateContactForm_importantNote"));
	    importantnote.sendKeys("Enjoying learning selenium with Testleaf");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    System.out.println(driver.getTitle());
	}

}
