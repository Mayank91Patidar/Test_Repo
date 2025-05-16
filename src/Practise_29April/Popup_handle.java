package Practise_29April;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_handle 
{
 public static void main(String[] args) throws InterruptedException 
 {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

//Normal alert with OK button
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
Thread.sleep(5000);

Alert MyAlert = driver.switchTo().alert();
System.out.println(MyAlert.getText());
MyAlert.accept();

//Confirmation alert with OK & CNACEL button
driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
Thread.sleep(5000);
//driver.switchTo().alert().accept();
 driver.switchTo().alert().dismiss();

 //Prompt alert  having Input box
 driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
Alert myprompt = driver.switchTo().alert();
myprompt.sendKeys("Welcome");
myprompt.accept();
 
 }
}
