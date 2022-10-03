package suitelevelexecution1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ClassB {
	@Ignore
	@Test
	public void tc100() {
		// TODO Auto-generated method stub
		Assert.assertTrue("verify thr tc1", false);
		System.out.println("tc100*****done");
	}
	@Test
	public void tc200() {
		// TODO Auto-generated method stub
		System.out.println("tc200*****done");
	}
	@Test
	public void tc300() {
		// TODO Auto-generated method stub
		Assert.assertTrue(false);
		System.out.println("tc300*****done");
	}


}
