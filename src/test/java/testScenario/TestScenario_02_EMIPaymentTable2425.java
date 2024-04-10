package testScenario;
import org.testng.annotations.Test;

import testBase.BaseClass;
import testCase.TestCase_02_EMIPaymentTable2425;
import testCase.TestCase_03_YearTableInExcel;

public class TestScenario_02_EMIPaymentTable2425 extends BaseClass
{
@Test(priority=1)
	public void emiPaymentTable2425()
	{
	    //TestCase_02
		TestCase_02_EMIPaymentTable2425 obj2 = new TestCase_02_EMIPaymentTable2425();
		obj2.displayResult();
		
	}
@Test(priority=2)
      public void YearTableInExcel()
      {
	     //TestCase_03
	     TestCase_03_YearTableInExcel obj3 = new TestCase_03_YearTableInExcel();
	     obj3.storeTable();
      }
	
}
