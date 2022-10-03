package suitelevelexecution1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteLevelFB {
	WebDriver driver;

	@Before
	public void beforeeachmethod() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@After
	public void aftereeachmethod() {
		driver.close();
	}
	@Test
	public void tc1() {
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("arun@gmail.com");

		WebElement txtpass=driver.findElement(By.id("pass"));
		txtpass.sendKeys("egargar123@");

		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();

	}
	@Test
	public void tc2() {
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("gopal@gmail.com");

		WebElement txtpass=driver.findElement(By.id("pass"));
		txtpass.sendKeys("asdfg123#");

		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();

	}

}
