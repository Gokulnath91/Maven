package week5.day1.homework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SuperClass {
  
  @BeforeMethod
  public void beforeMethod1() {
	  System.out.println("beforeMethod1 Super Class");

  }

  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("beforeMethod2 Super Class");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod Super Class");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass Super Class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass Super Class");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest Super Class");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest Super Class");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite Super Class");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite Super Class");

  }

}
