package junitprgm;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prgm3 {
	
@Test
public void tc1() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	String currenturl=driver.getCurrentUrl();
	boolean contains=currenturl.contains("facebook");
	System.out.println(contains);
	Assert.assertTrue(contains);
	
    WebElement txtEmail=driver.findElement(By.id("email"));
	txtEmail.sendKeys("arun@gmail.com");
//	driver.quit();
	
	String attribute=txtEmail.getAttribute("value");
	
	Assert.assertEquals("babu@gmail.com",attribute);
	
	WebElement txtpass=driver.findElement(By.id("pass"));
	txtpass.sendKeys("egargar123");
	
	WebElement btnlogin=driver.findElement(By.name("login"));
	btnlogin.click();
	
 
}}
