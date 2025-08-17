package Seleniumprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Username']"))).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
}
