package week5.day1.homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class SubClass extends SuperClass {
  @Test
  public void f() {
	  System.out.println("f Sub Class");
  }
  @BeforeMethod
  public void beforeMethod3() {
	  System.out.println("beforeMethod3 Sub Class");
  }

  @BeforeMethod
  public void beforeMethod4() {
	  System.out.println("beforeMethod4 Sub Class");
  }

  @AfterMethod
  public void afterMethod1() {
	  System.out.println("afterMethod Sub Class");
  }

  @BeforeClass
  public void beforeClass1() {
	  System.out.println("beforeClass Sub Class");
  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("afterClass Sub Class");
  }

  @BeforeTest
  public void beforeTest1() {
	  System.out.println("beforeTest Sub Class");
  }

  @AfterTest
  public void afterTest1() {
	  System.out.println("afterTest Sub Class");
  }

  @BeforeSuite
  public void beforeSuite1() {
	  System.out.println("beforeSuite Sub Class");
  }

  @AfterSuite
  public void afterSuite1() {
	  System.out.println("afterSuite Sub Class");
  }

}
