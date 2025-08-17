package Seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");	
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
	}
}
