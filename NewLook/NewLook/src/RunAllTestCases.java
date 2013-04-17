import junit.framework.Test;
import junit.framework.TestSuite;

public class RunAllTestCases {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(Homepage.class);
		suite.addTestSuite(MyAccount.class);
		return suite;
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
