package week3.seleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new  ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");

	}

}
