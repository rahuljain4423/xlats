package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// entering the url
		driver.get("https://xaltsocnportal.web.app/signin");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//entering the unique email address
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[1]")).sendKeys("rahuljain4424@gmail.com");
		 //entering the password     
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("Rahul@123");
		//entering the confirm password      
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]")).sendKeys("Rahul@123");
		        driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		    	Thread.sleep(5000);
		        driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Onboard OCN Node']")).click();
		Thread.sleep(3000);
		// clicking on the sign out button
		    driver.findElement(By.xpath("//button[text()='Sign Out']")).click();
		    Thread.sleep(2000);
		    // closing the browser
		    driver.close();
	}

}
