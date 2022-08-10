package week3.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title ="ACME System 1 -  Dashboard";
		System.out.println(title);
		driver.findElement(By.linkText("Log Out")).click();
		//driver.findElement(By.xpath("//a[contains((text(),'Log Out')]")).click();
		driver.close();
		
		
		
		
		

	}

}
