package Practise_29April;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Case
{
 public static void main(String[] args) throws InterruptedException
 {
 WebDriver driver = new ChromeDriver();
 driver.get("https://testautomationpractice.blogspot.com/");
 driver.manage().window().maximize();
 List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@class='form-check-input'  and @ type ='checkbox']"));
 /*for (WebElement a:allCheckbox)
 {
	 a.click();
 }*/
 //Select last 3 checkbox
 for (int i=4;i< allCheckbox.size();i++)
 {
	 allCheckbox.get(i).click();
 }
 Thread.sleep(5000);
 
 for(int i=0;i<allCheckbox.size();i++)
 {
	 if(allCheckbox.get(i).isSelected())
	 {
		 allCheckbox.get(i).click();;
	 }
 }
 }
}
