package TEST;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
@Test
	public void Personalloan() {
		
		System.out.println("This is for Personalloan");
		
}
	
@BeforeTest
public void PersonalIncludeloan() {
	
	
	System.out.println("I will ExecuteFirst");
	
}
@AfterTest
public void PersonalIncludeloan1() {
	
	
	System.out.println("I will ExecuteLast");
	
}
	
	
@BeforeSuite
public void Beforesuite()
{
	
	
	System.out.println("I will Execute very first");
	
}

}
