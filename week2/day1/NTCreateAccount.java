package week2.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

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
		
		WebElement currency=driver.findElement(By.id("currencyUomId"));
		Select cur=new Select(currency);
		cur.selectByValue("INR");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("sharmila");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("jio");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("500000");
		
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select ind=new Select(industry);
		ind.selectByValue("IND_SOFTWARE");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByVisibleText("S-Corporation");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select src=new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select mark=new Select(marketing);
		mark.selectByIndex(6);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		WebElement province=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select pro=new Select(province);
		pro.selectByValue("TX");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		
		System.out.println(driver.findElement(By.className("errorMessageHeader")).getText());
		System.out.println(driver.findElement(By.className("errorMessage")).getText());
	

	}

}
