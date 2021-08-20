package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Boobal");
		
		driver.findElement(By.name("UserLastName")).sendKeys("Raj");
		
		driver.findElement(By.name("UserEmail")).sendKeys("Boomso.raj68@gmail.com");
 
		driver.findElement(By.name("CompanyName")).sendKeys("TATA");
		
		WebElement Jobtitle = driver.findElement(By.name("UserTitle"));
		Select TITLE=new Select(Jobtitle);
		TITLE.selectByVisibleText("Student / Personal Interest");
		
		WebElement Companyemp = driver.findElement(By.name("CompanyEmployees"));
		Select EMP=new Select(Companyemp);
		EMP.selectByIndex(3);
		
		driver.findElement(By.name("UserPhone")).sendKeys("9790701990");
		WebElement companycount = driver.findElement(By.name("CompanyCountry"));
		Select COUNT=new Select(companycount);
		COUNT.selectByVisibleText("India");
		
		driver.findElement(By.className("checkbox-ui")).click();
		
		//*driver.findElement(By.linkText("start my free trial")).click();
		
		
				

	}

}
