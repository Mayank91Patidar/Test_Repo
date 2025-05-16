package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S

{
	public static void main(String[] args) throws InterruptedException 
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Students']")).click();
	 }
	
}
