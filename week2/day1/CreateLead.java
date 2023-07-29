package week2.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Airtel");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sakthi");
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src=new Select(source);
		src.selectByVisibleText("Employee");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mark=new Select(marketing);
		mark.selectByValue("9001");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByIndex(5);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cnty=new Select(country);
		cnty.selectByVisibleText("India");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Title: "+driver.getTitle());

	}


	}


