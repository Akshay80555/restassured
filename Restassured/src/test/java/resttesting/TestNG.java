package resttesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	//this is called a method
		//Tessuite//collections of testcase // is telling me before yourun the test //if thereare pre requirements//i will run that
	 @BeforeSuite
	public void BS() {
		System.out.println("This is going to execute first");
	}
	 @BeforeTest
	 public void BT() {
		 System.out.println("This one will execute after Before suite");
	 }
	 @BeforeClass
	 public void BC() {
		 	System.out.println("This one will execute before the class gets executed");
	 }
	 //This will execute before every@ Test Method
	 @BeforeMethod
	 public void BM() {
		 System.out.println("This will execute before every Test Method");
	 }
	 @Test
	 public void testcase1() {
		 System.out.println("This is first test Method");
		
	 }
	 @Test
	 public void testcase2() {
		 System.out.println("This is second test Method");
	}
	 @AfterMethod
	 public void AM() {
		 System.out.println("After executing each test method");
	 }
	 @AfterClass
	 public void AC() {
		 System.out.println("This will execute after the class");
		
	 }
	 @AfterTest
	 public void AT() {
		 System.out.println("This will execute after allll the test is executed ");
	 }
	 @AfterSuite
	 public void AS() {
		 System.out.println("This will execute after everything at the end");
	 }

}
