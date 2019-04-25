package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTitle {
	@Test
	public void getTitle() {
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//li[@id='menu_download']/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.close();
		System.out.println("Jenkin with Git");
	}
}
