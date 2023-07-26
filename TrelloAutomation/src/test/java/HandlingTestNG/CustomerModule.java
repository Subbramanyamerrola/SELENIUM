package HandlingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority = 1,invocationCount = 3)
	public void createCustomer(){
		Reporter.log("createCustomer",true);
		}
	@Test(priority = 2,dependsOnMethods ="CustomerModule" )
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
		}
	@Test(priority = 3,dependsOnMethods={"CustomerModule","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
	

}
