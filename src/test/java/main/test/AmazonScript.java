package main.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utils.DriverSelector;
import Utils.Locators;
import Utils.TestData;

public class AmazonScript extends DriverSelector{
	
	
public void navigate_to_Amazon_Website() throws Throwable {
	 driver.get("https://www.amazon.in");
	 screenShot("URL_Passed");
	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(TestData.getData("TC02", "SearchValue"));
	  screenShot("Search data passed");
	  driver.findElement(By.xpath("//input[@value='Go']")).click();
	  screenShot("Clicked on Search button");
	   log.info("Amazon URL Passed");
	    
	}

public void validate_the_Amazon_website() throws Throwable {
	Thread.sleep(10000);
    String value = driver.findElement(By.xpath("//a[text()='Electronics']")).getText();
    if(value.equals("Electronics")) {
    	 log.info("Value passed"); 
    }else {
    	log.info("Value passed");
    	throw new Exception("Value is not equal");
    }
   
}
}
