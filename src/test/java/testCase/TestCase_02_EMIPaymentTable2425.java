package testCase;

import org.testng.annotations.Test;

import pageObjects.emiCalculatorHomePage;
import testBase.BaseClass;
import utilities.AddFluentWait;
import utilities.Assertions;

public class TestCase_02_EMIPaymentTable2425 extends BaseClass
{
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	
	@Test
	public void displayResult() {
		
		logger.info("---- TC_02_EMIPaymentTable Started ----");
		try {
			emiCalculatorHomePage homePageObj = new emiCalculatorHomePage(driver);
			
			//Scroll to Table
			homePageObj.scrollToTable();

			//Click on the Years
			homePageObj.clickOnYears();
			
			//Displaying the data
			homePageObj.printTheEMIPaymentTable();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TC_02_EMIPaymentTable Started got failed, displaying the datas wasn't successful");
			
			logger.error("TC_02_EMIPaymentTable Started got failed, displaying the datas wasn't successful");
			myAssert.fail();
		}
		
		logger.info("---- TC_02_EMIPaymentTable Started Ended ----");
	}

}
