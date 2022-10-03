package pomclass;

import java.io.IOException;

public class PomPrgm1 extends BaseMethd {
	public static void main(String[] args) throws IOException {

//		getUrl("https://www.facebook.com");
		getUrlByChrome("https://www.facebook.com");
		maximizeWindow();

		implicityWait(5);
		PomPrgm pg = new PomPrgm();
		sendKeys(pg.getTxtemail(), "gopal");
//		sendKeys(pg.getTxtemail(), excelRead(
//				"C:\\\\Users\\\\satheesh\\\\eclipse-workspace\\\\junitprgm\\\\excel\\\\Book1.xlsx", "Sheet1", 1, 6));

		refresh();

		sendKeys(pg.getTxtemail(), excelRead(
				"C:\\\\Users\\\\satheesh\\\\eclipse-workspace\\\\junitprgm\\\\excel\\\\Book1.xlsx", "Sheet1", 2, 6));

		sendKeys(pg.getTxtpass(), excelRead(
				"C:\\\\Users\\\\satheesh\\\\eclipse-workspace\\\\junitprgm\\\\excel\\\\Book1.xlsx", "Sheet1", 1, 7));
		click(pg.getBtnlogin());

	}

}
