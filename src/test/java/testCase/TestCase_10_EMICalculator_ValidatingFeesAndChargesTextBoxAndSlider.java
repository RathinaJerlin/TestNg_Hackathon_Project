package testCase;

import org.testng.annotations.Test;

import pageObjects.LoanCalculatorPage;
import testBase.BaseClass;
import utilities.AddFluentWait;
import utilities.Assertions;

public class TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider extends BaseClass{
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	@Test
	public void validateFeesAndChargesTextBox() {
		
		logger.info("---- TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider Started ----");
		try {
			LoanCalculatorPage loanCalculatorPageObj = new LoanCalculatorPage(driver);
			
			//Waiting for the main menu to load
			wait.waitForMainMenu(driver);
			
			//Navigating to the respective page
			loanCalculatorPageObj.navigatorForEMICalc();
			
			//Waiting for all the fields to be visible
			wait.waitForTheTextBoxAndSlider(driver);
			
			//Validating if Fees And Charges Text Box is visible
			if(loanCalculatorPageObj.getFeesAndChargesTextBox().isDisplayed()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
				System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not visible.");
				myAssert.fail();
			}
			
			//Validating if Fees And Charges Text Box is enabled
			if(loanCalculatorPageObj.getFeesAndChargesTextBox().isEnabled()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
				System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, Fees And Charges Text Box is not enabled.");
				myAssert.fail();
			}
			//Validating if Fees And Charges Slider is visible
			if(loanCalculatorPageObj.getFeesAndChargesSlider().isDisplayed()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_14_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
				System.out.println("TestCase_03_11_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not visible.");
				myAssert.fail();
			}
			
			//Validating if Fees And Charges Slider is enabled
			if(loanCalculatorPageObj.getFeesAndChargesSlider().isEnabled()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_14_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
				System.out.println("TestCase_03_11_EMICalculator_ValidatingFeesAndChargesSlider got failed, Fees And Charges Slider is not enabled.");
				myAssert.fail();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, validation of Fees And Charges Text Box was unsuccessful");
			
			logger.error("TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider got failed, validation of Fees And Charges Text Box was not successful");
			myAssert.fail();
		}
		
		logger.info("---- TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider Ended ----");
	}	
}

