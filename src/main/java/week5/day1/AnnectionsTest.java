package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnectionsTest {
  @Test
  public void f() {
	  System.out.println("f");
  }
  
  @Test
  public void f1() {
	  System.out.println("f1");
  }
  
  @BeforeMethod
  public void B() {
	  System.out.println("B");

  }

  @BeforeMethod
  public void A() {
	  System.out.println("A");

  }

  
  @AfterMethod
  public void afterMethod2() {
	  System.out.println("afterMethod2");

  }
  
  @AfterMethod
  public void afterMethod1() {
	  System.out.println("afterMethod1");

  }


  @BeforeClass
  public void c() {
	  System.out.println("c");

  }

  @AfterClass
  public void afterClass1() {
	  System.out.println("afterClass1");

  }

  @BeforeClass
  public void C() {
	  System.out.println("C");

  }

  @AfterClass
  public void afterClass2() {
	  System.out.println("afterClass2");

  }

  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");

  }

}
