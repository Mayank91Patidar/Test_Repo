package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1 
{
 public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");	
	 
	 driver.manage().window().maximize();
	 
	 //Select all checkboxes for days
	 
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 
	/*for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}*/
	
	/*
	for(WebElement checkbox: checkboxes)
	{
		checkbox.click();
	}*/
	
	// Select last three checkbox
	//Total number of checkboxes- how many checkbox u want to select = index
	//7-3=4
	/*
	for (int i=4;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}*/
	
	// Select first three checkbox
	/*
	 for(int i=0;i<3;i++)
	 {
		 checkboxes.get(i).click();
	 }*/
	   
	//Unselect checkbox if they are selected
	 for(int i=0;i<3;i++)
	 {
		 checkboxes.get(i).click();
	 }
	 
	 Thread.sleep(5000);
	 
	 for(int i=0;i<checkboxes.size();i++)
	 {
		 if(checkboxes.get(i).isSelected());
		 {
		  checkboxes.get(i).click();;
		 }
	 }
	 
  }
}
