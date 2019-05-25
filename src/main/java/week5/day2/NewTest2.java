package week5.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(dataProvider = "dp1")

  public void testMethod(int number)
  {
      Long id = Thread.currentThread().getId();
      System.out.println("HELLO :  " + id);
  }


  @DataProvider(name = "dp1",parallel=true)
  public Object[][] dp1() {
    return new Object[][] {
        new Object[] { 1 },
        new Object[] { 2 },
        new Object[] { 3 },
        new Object[] { 4 },
        new Object[] { 5 },
        new Object[] { 6 }
       

    };
  }
  }
