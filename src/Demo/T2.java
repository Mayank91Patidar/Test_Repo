package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.jcajce.provider.symmetric.DSTU7624.AlgParamGen512;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2  
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Windows.html");	
	 driver.manage().window().maximize();

	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
	 Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='click']")).click();
	 
	 Set<String> Allwindow = driver.getWindowHandles();
	//System.out.println(Allwindow.size());
	 
	 Iterator<String> itererator = Allwindow.iterator();   
	 String mainWinID = itererator.next();
     String  newAdwinID = itererator.next();
    
     driver.switchTo().window(newAdwinID);
     System.out.println(driver.getTitle());
     Thread.sleep(3000);
     driver.close();

     driver.switchTo().window(mainWinID);
     System.out.println(driver.getTitle());
     Thread.sleep(2000);
	 
 }
}
