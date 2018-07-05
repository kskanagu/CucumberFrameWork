package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends DriverSelector{
	
	//Amazon Locators
	
	public static WebElement searchTextBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	public static WebElement searchButton  = driver.findElement(By.xpath("//input[@value='Go']"));
	
	public static WebElement electronicsText = driver.findElement(By.xpath("//a[text()='Electronics']"));
}
