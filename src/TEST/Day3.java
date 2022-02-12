package TEST;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class Day3 {

	
	@BeforeClass
public void BeforeClass() {
		
		System.out.println("This is for BeforeClass");
		
}
	
	@AfterClass
   public void AfterClass() {
		
		System.out.println("This is for AfterClass");
		
}
	@Test
	public void WebLoginCarloan() {
		
		System.out.println("This is for WebLoginCarloan");
		
}
	
	@Test
	public void MobileLoginCarloan() {
		
		System.out.println("This is for MobileLoginCarloan");
		
}
	
	@BeforeTest
	public void Mobile2Carloan() {
		
		System.out.println("This is for LoginAPICar");
		System.out.println("I will ExecuteFirst");
}
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("I will execute before every method in Day3");
}
	
	
	@AfterMethod
	public void afterremethod() {
		
		System.out.println("I will execute after every method in Day3");
}
	@Test
	public void WebLoginCarloan3() {
		
		System.out.println("This is for WebLoginCarloan3");
		
}
	
	@Test
	public void WebLoginCarloan4() {
		
		System.out.println("This is for WebLoginCarloan4");
		
}
	
}
