package HandlingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void demoTest() {
		Reporter.log("welcome to testng",true);
	}

}
