package Demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down 
{
	public static void main(String[] args) throws InterruptedException 
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qa.myshell.co/attendance_management/Attendance/listing");	
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("myshellco@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("Qnjk~%11##");
		 driver.findElement(By.id("submitLogin")).click();
		 Thread.sleep(2000);
		 
	    driver.findElement(By.xpath("//span[.='All Employee']")).click();
	   List<WebElement> all_Emp = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
	   
	     //ArrayList< String> a= new ArrayList<>();
	      int i= 1;
	      for(WebElement e:all_Emp)
	       {
	    	String emp = e.getText();
	    	i++;
	    	System.out.println(emp);
	       }
	      
	      System.out.println("Total Number of Employee= "+i);
		 
		 
	 }
}
