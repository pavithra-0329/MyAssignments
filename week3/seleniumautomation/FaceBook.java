package week3.seleniumautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
	     driver.get("http://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pavithra");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(" 9876543210");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pavi0436");
		
		WebElement day=driver.findElement(By.id("day"));
		Select dd1=new Select(day);
		dd1.selectByValue("29");
		
		WebElement month=driver.findElement(By.id("month"));
		Select dd2=new Select(month);
		dd2.selectByVisibleText("Mar");
		
		WebElement year=driver.findElement(By.id("year"));
		Select dd3=new Select(year);
		dd3.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		
		
			
		

	}

}
