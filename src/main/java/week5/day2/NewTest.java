package week5.day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("T");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");

  }


  @DataProvider
  public Object[][] dp() {
	  System.out.println("DP");

    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BT");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AT");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS");

  }

}
