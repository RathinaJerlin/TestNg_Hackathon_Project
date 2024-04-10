package testCase;

import org.testng.annotations.Test;

import pageObjects.emiCalculatorHomePage;
import testBase.BaseClass;
import utilities.AddFluentWait;
import utilities.Assertions;

public class TestCase_01_EnteringRequiredValuesInHomePage extends BaseClass{
	
	//Creating an instance of the AddFluentWait utility
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	
	@Test
	public void enterDetails() {
		
		logger.info("---- TestCase_01_EnteringRequiredValuesInHomePage Started ----");
		try {
			emiCalculatorHomePage homePageObj = new emiCalculatorHomePage(driver);
			
			//Waiting for the main menu element
			wait.waitForMainMenu(driver);
			
			//Navigating to the page - 
			homePageObj.navigator();
			homePageObj.clickCarLoan();
			
			//Waiting for the car loan element to load
			wait.waitForTheCarLoan(driver);
			
			//Clicking on the car loan 
			homePageObj.clickCarLoan();
			
			//Setting the required values - 
			homePageObj.setLoanAmt(p.getProperty("loanAmount"));
			homePageObj.setInterest(p.getProperty("interest"));
			
			homePageObj.moveLoanTenureSlider(-375);
			homePageObj.clickOnYear();
			captureScreen("carLoan");
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TestCase_01_EnteringRequiredValuesInHomePage got failed, data parsing wasn't successful");
			logger.error("TestCase_01_EnteringRequiredValuesInHomePage got failed, data parsing wasn't successful");
			myAssert.fail();
		}
		
		logger.info("---- TestCase_01_EnteringRequiredValuesInHomePage Ended ----");
	}
}
