package week3.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
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
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("pavithra");
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   
	 String title="Find Leads | opentaps CRM";
	 String title2 =driver.getTitle();
	   System.out.println(title2);
	   if (title.equals(title2)) {
			System.out.println("updated succesfully");
		}
		else {
		System.out.println("updated not sucessfully");
		}
	   Thread.sleep(3000);
	   driver.findElement(By.linkText("16927")).click();
	   driver.findElement(By.linkText("Edit")).click();
	   driver.findElement(By.id("updateLeadForm_companyName")).clear();
	   Thread.sleep(3000);
       driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("wipro");
       driver.findElement(By.name("submitButton")).click();

}
	    
	    


}