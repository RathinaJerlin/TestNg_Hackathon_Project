package testCase;

import org.testng.annotations.Test;

import pageObjects.LoanCalculatorPage;
import testBase.BaseClass;
import utilities.AddFluentWait;
import utilities.Assertions;

public class TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider extends BaseClass{
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	@Test
	public void validateInterestRateTextBoxAndSlider() {
		
		logger.info("---- TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider Started ----");
		try {
			LoanCalculatorPage loanCalculatorPageObj = new LoanCalculatorPage(driver);
			
			//Waiting for the main menu to load
			wait.waitForMainMenu(driver);
			
			//Navigating to the respective page
			loanCalculatorPageObj.navigatorForLoanAmountCalc();
			
			//Waiting for all the fields to be visible
			wait.waitForTheTextBoxAndSlider(driver);
			
			//Validating if Interest Rate Text Box is visible
			if(loanCalculatorPageObj.getIntRateTextBox().isDisplayed()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
				System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not visible.");
				myAssert.fail();
			}
			
			//Validating if Interest Rate Text Box is enabled
			if(loanCalculatorPageObj.getIntRateTextBox().isEnabled()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
				System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, Interest Rate Text Box is not enabled.");
				myAssert.fail();
			}
			if(loanCalculatorPageObj.getIntRateSlider().isDisplayed()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
				System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not visible.");
				myAssert.fail();
			}
			
			//Validating if Interest Rate Slider is enabled
			if(loanCalculatorPageObj.getIntRateSlider().isEnabled()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
				System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateSlider got failed, Interest Rate Slider is not enabled.");
				myAssert.fail();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, validation of Interest Rate Text Box was unsuccessful");
			
			logger.error("TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider got failed, validation of Interest Rate Text Box was not successful");
			myAssert.fail();
		}
		
		logger.info("---- TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider Ended ----");
	}
}
