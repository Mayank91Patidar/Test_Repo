package Practise_29April;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// Switching to First Frame
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);	
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		// Switching to second Frame
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);	
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();

		// Switching to Third Frame

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		//inner iframe - part of frame 3
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("(//div[@class='rseUEf nQOrEb'])[2]")).click();
		
		WebElement SelectRadio = driver.findElement(By.xpath("(//div[@class='rseUEf nQOrEb'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", SelectRadio);

		driver.switchTo().defaultContent();
		
		// Switching to Fifth Frame

		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Iframe 5");
		
		//Clicks on Link
		driver.findElement(By.xpath("//a[.='https://a9t9.com']")).click();
	//	WebElement logo = driver.findElement(By.xpath("//a[@id='logo']"));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10)); //Explicit wait 
		try
		{
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='logo']")));
	    System.out.println("Logo is Present");
		}
		catch(Exception e)
		{
			System.out.println("Logo is not Present");
		}
	
		
	}

}
