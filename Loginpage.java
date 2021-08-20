package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");

		String title = driver.getTitle();

		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement webuser = driver.findElement(By.id("username"));
		webuser.sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		String Title = "My Home| opentaps CRM";

		String hometitle = driver.getTitle();
		if (Title.equals(hometitle)) {
			System.out.println(" In the Home page");

		} else
			System.out.println("Not in the Home page");

		WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("5");

	}

}
