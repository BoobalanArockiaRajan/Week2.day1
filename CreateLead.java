package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Boobalan");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcecontain = new Select(Source);
		sourcecontain.selectByVisibleText("Existing Customer");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select leadform = new Select(marketing);
		leadform.selectByValue("DEMO_MKTG_CAMP");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("26/04/1992");

		WebElement Countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		Countrycode.clear();
		Countrycode.sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9790701990");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Boomso.raj68@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Boobalan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raj complex");
		driver.findElementByName("generalAddress1").sendKeys("11&12 madampakkam main road");
		driver.findElementByName("generalAddress2").sendKeys("madmpakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		WebElement generalcountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(generalcountry);
		country.selectByValue("IND");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select generalstate = new Select(State);

		generalstate.selectByValue("IN-TN");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600126");

		driver.findElement(By.name("submitButton")).click();
	}
}
