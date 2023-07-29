package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		
		driver.findElement(By.id("ext-gen27")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@id='ext-gen110']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Debit Limited Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		
		String accountName=driver.findElement(By.id("accountName")).getAttribute("value");
		System.out.println(accountName);
		String description=driver.findElement(By.name("description")).getAttribute("value");
		System.out.println(description);
		System.out.println("Title: "+driver.getTitle());
		
	}


	}


