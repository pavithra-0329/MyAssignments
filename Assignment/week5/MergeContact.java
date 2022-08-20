package Assignment.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
		  String text =driver.findElement(By.tagName("h2")).getText();
		  System.out.println(text);
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Merge Contacts")).click(); 
		 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 Set<String> WindowHandles =driver.getWindowHandles();
		 List<String> window =new ArrayList<String>(WindowHandles);
		 String newWindow =window.get(1);
		 driver.switchTo().window(newWindow);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		 
		 String m =window.get(0);
		 driver.switchTo().window(m);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 Set<String> WindowHandle1 =driver.getWindowHandles();
		 List<String> window1 =new ArrayList<String>(WindowHandle1);
		 String newWindow1=window1.get(1);
		 driver.switchTo().window(newWindow1);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		 
		 String j= window.get(0);
		 driver.switchTo().window(j);
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 
		 Alert simple = driver.switchTo().alert();
		 Thread.sleep(2000);
		 simple.accept();
		 
		 
		 String title="Merge Contacts | opentaps CRM";
			String title2 =driver.getTitle();
			if(title.equals(title2)) {
				System.out.println("Merge Contact successfully");
			}else {
				System.out.println("contact is not merge successfully");
				
			}
		 
		 
		 
		 
		

	}

}
