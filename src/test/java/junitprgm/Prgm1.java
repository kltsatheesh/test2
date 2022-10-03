package junitprgm;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Prgm1 {
	@BeforeClass
	public static void beforeclass() {
		
		System.out.println("browser config and launch the browser");
	}

	@AfterClass
	public static void afterclass() {
		
		System.out.println("close or quit the browser");
	}

	@Before
	public void beforeeachmethod() {
//		long currentTimeMillis = System.currentTimeMillis();
		Date d=new Date();
		// TODO Auto-generated method stub
		System.out.println("Start time"+d);
		
	}

	@After
	public void aftereachmethod() {
//		long currentTimeMillis = System.currentTimeMillis();
		Date d1=new Date();
		// TODO Auto-generated method stub
		System.out.println("end time"+d1);
	}

	@Test
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println("tc1******done");
	}

	@Test
	public void a1() {
		// TODO Auto-generated method stub
		System.out.println("tc2******done");
	}

	@Test
	public void tc3() {
		// TODO Auto-generated method stub
		System.out.println("tc3******done");
	}
}
