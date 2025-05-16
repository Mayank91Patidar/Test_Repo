package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 
{
 public static void main(String[] args) throws InterruptedException
 {
 WebDriver driver = new ChromeDriver();
 driver.get("https://chercher.tech/practice/frames");
 
 driver.manage().window().maximize();
 
 WebElement F = driver.findElement(By.id("frame1"));
 driver.switchTo().frame(F);
 
 Thread.sleep(1000);
 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");
 
 }
}
