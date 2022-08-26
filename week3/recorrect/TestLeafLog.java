package week3.recorrect;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafLog {

        public static void main(String[] args) {
				//To create a leafTaps website
				
			//download the driver and set the path
			WebDriverManager.chromedriver().setup();
			
        	//launch Chrome browser
			ChromeDriver driver =new ChromeDriver();
			
			//load the url
			driver.get("http://leaftaps.com/opentaps/control/main");
			// maximize the window size
			driver.manage().window().maximize();
			//enter usename as demosalesmanager
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			//enter the password as crmfa
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//click login button
			driver.findElement(By.className("decorativeSubmit")).click();
			String text =driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
			//select CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();
			// Create a lead and filling the details
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pavithra");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
			//submit create lead
			driver.findElement(By.className("smallSubmit")).click();
			
			
				}

	}


