package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("English (UK)")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Boobal");
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		driver.findElement(By.name("reg_email__")).sendKeys("Boomso.raj68@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Boomso.raj68@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("9790701990");

		WebElement Day = driver.findElement(By.id("day"));
		Select firstday = new Select(Day);
		firstday.selectByIndex(25);

		WebElement Month = driver.findElement(By.id("month"));
		Select firstmonth = new Select(Month);
		firstmonth.selectByIndex(4);

		WebElement Year = driver.findElement(By.id("year"));
		Select firstyear = new Select(Year);
		firstyear.selectByVisibleText("1992");

		driver.findElement(By.linkText("Sign Up")).click();

	}

}
