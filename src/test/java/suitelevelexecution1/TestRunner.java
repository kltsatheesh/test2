package suitelevelexecution1;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	@Test
	public void sample() {
		Result r = JUnitCore.runClasses(ClassA.class, ClassB.class,ClassC.class);
		
		int runCount = r.getRunCount();
		System.out.println("Run count:"+runCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println("IgnoreCount:"+ignoreCount);
		
		long runTime = r.getRunTime();
		System.out.println("RunTime:"+ runTime);
		
		int failureCount = r.getFailureCount();
		System.out.println("FailureCount:"+failureCount);
		
		List<Failure> failures = r.getFailures();
		System.out.println(failures );
		
		for (Failure failure : failures) {
			System.out.println(failure);
			
		}
	}

}
