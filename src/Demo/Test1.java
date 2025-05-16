package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");	
	 driver.manage().window().maximize();
	WebElement Drop_option = driver.findElement(By.xpath("//option[.='Austria']"));
	Drop_option.click();

 }
}
