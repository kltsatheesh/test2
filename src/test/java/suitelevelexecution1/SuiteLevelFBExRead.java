package suitelevelexecution1;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuiteLevelFBExRead extends BaseClass {

	WebDriver driver;

	@Before
	public void beforeeachmethod() {
		getUrlByChrome("https://www.facebook.com/");
		maximizeWindow();
	}
	@After
	public void aftereeachmethod() {
		driver.close();
	}
	@Test
	public void tc1() throws IOException {
		WebElement txtemail = locateById("email");
		sendKeys(txtemail, excelRead("C:\\Users\\satheesh\\eclipse-workspace\\junitprgm\\excel\\Book1.xlsx","Sheet1", 1, 6));
		System.out.println(txtemail);
		
		WebElement txtpass = locateById("pass");
		sendKeys(txtpass,"test123");
		
		WebElement btnlogin = locateByName("login");
		click(btnlogin);


	}
//	
//	@Test
//	public void tc2() throws IOException{
//		WebElement txtemail = locateById("email");
//		sendKeys(txtemail, excelRead("C:\\Users\\satheesh\\eclipse-workspace\\junitprgm\\excel\\Book1.xlsx","Sheet1", 1, 6));
//		System.out.println(txtemail);
//		
//		WebElement txtpass = locateById("pass");
//		sendKeys(txtpass,"test123");
//		
//		WebElement btnlogin = locateByName("login");
//		click(btnlogin);

//}
}
