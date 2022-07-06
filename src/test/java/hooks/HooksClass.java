package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {

	@Before(value = "@allsite")
	public void beforeMethod() {
		System.out.println("Before method executed1");
	}
	
//	@Before(order = 1)
//	public void beforeMethod2() {
//		System.out.println("Before method executed2");
//	}
//	
//	@After(order = 1)
//	public void afterMethod() {
//		System.out.println("after method executed");
//	}
//	
	@After("@allsite")
	public void afterMethod2() {
		System.out.println("after method executed2");
	}
}
