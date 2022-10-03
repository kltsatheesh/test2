package suitelevelexecution1;

import org.junit.Ignore;
import org.junit.Test;

public class ClassA {
	
	@Test
	public void tc1() {
		// TODO Auto-generated method stub
		System.out.println("tc1*****done");
	}
	@Ignore
	@Test
	public void tc2() {
		// TODO Auto-generated method stub
		System.out.println("tc2*****done");
	}
	@Test
	public void tc3() {
		// TODO Auto-generated method stub
		System.out.println("tc3*****done");
	}
}
