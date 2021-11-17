package utilll;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArithmeticUtilsTest.class })
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(ArithmeticUtils.class));
		return suite;
	}
}
