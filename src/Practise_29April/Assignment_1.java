package Practise_29April;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 List<WebElement> allCheckbox = driver.findElements(By.xpath("//td[.='Smartphone']/../../tr/td/input"));
	 for(WebElement a:allCheckbox) 
	 {
		 a.click();
	 }
	 
 }
}
