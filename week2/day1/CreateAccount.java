package week2.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Testing");
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Tester");
			driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Pavi");
			driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Test");
			driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10000000");
			
			Select industry=new Select(driver.findElement(By.name("industryEnumId")));
			industry.selectByValue("IND_SOFTWARE");
			
			Select ownership=new Select(driver.findElement(By.name("ownershipEnumId")));
			ownership.selectByVisibleText("S-Corporation");
			
			Select employee=new Select(driver.findElement(By.name("dataSourceId")));
			employee.selectByValue("LEAD_EMPLOYEE");
			
			Select marketing=new Select(driver.findElement(By.name("marketingCampaignId")));
			marketing.selectByIndex(5);
			
			Select state=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
			state.selectByValue("TX");
			
			driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
		
		}
}



