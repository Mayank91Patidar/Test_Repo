package Practise_29April;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle alert without switchTo().alert()
//by using explicit wait

public class HandleAlertUsingExplicitWait
{
public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10)); //Explicit wait 
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
	Thread.sleep(5000);
	
	Alert myAlert = mywait.until(ExpectedConditions.alertIsPresent());
	System.out.println(myAlert.getText());
	myAlert.accept();
 }
}
