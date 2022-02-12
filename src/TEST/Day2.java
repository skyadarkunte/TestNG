package TEST;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void ploan() {
		
		System.out.println("This is for Personal3loan");
		
}
	@Test
	public void ploan2() {
		
		System.out.println("This is for Personal4loan2");
		
}
	
	@AfterSuite
	public void AfterSuite1()
	{
		
		
		System.out.println("I will Execute very last");
		
	}


}
