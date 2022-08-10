package week3.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
		  String text =driver.findElement(By.tagName("h2")).getText();
		  System.out.println(text);
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Contacts")).click();
		    driver.findElement(By.linkText("Create Contact")).click();
		    driver.findElement(By.id("firstNameField")).sendKeys("Pavithra");
		    driver.findElement(By.id("lastNameField")).sendKeys("B");
		    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Pavithra");
		    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("B");
		    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("software testing");
		    driver.findElement(By.id("createContactForm_description")).sendKeys("hello welcome");
		    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Pavi2903@gmail.com");
		    WebElement dropdown =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		    Select dd1 =new Select(dropdown);
		    dd1.selectByVisibleText("Indiana");
		    driver.findElement(By.name("submitButton")).click();
		    driver.findElement(By.linkText("Edit")).click();
		    driver.findElement(By.id("updateContactForm_description")).clear();
		    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("selenium automation");
		    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		    
		    String title="View Contact | opentaps CRM";
			String title2 =driver.getTitle();
			if(title.equals(title2)) {
				System.out.println(" contact created and updated successfully");
			}else {
				System.out.println(" contact not created  successfully");
				
			}
			
		    
		    
		    
		    
		    
		 

	}

}
