package testCase;

import org.testng.annotations.Test;

import pageObjects.LoanCalculatorPage;
import testBase.BaseClass;
import utilities.AddFluentWait;
import utilities.Assertions;

public class TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider extends BaseClass{
	AddFluentWait wait = new AddFluentWait();
	Assertions myAssert = new Assertions();
	@Test
	public void validateLoanTenureTextBox() {
		
		logger.info("---- TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider Started ----");
		try {
			LoanCalculatorPage loanCalculatorPageObj = new LoanCalculatorPage(driver);
			
			//Waiting for the main menu to load
			wait.waitForMainMenu(driver);
			
			//Navigating to the respective page
			loanCalculatorPageObj.navigatorForEMICalc();
			
			//Waiting for all the fields to be visible
			wait.waitForTheTextBoxAndSlider(driver);
			
			//Validating if Loan Tenure Text Box is visible
			if(loanCalculatorPageObj.getLoanTenureTextBox().isDisplayed()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not visible.");
				System.out.println("TestCase_03_07_EMICalculator_ValidatingLoanTenureTextBox got failed, Loan Tenure Text Box is not visible.");
				myAssert.fail();
			}
			
			//Validating if Loan Tenure Text Box is enabled
			if(loanCalculatorPageObj.getLoanTenureTextBox().isEnabled()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider got failed, Loan Tenure Text Box is not enabled.");
				System.out.println("TestCase_03_07_EMICalculator_ValidatingLoanTenureTextBox got failed, Loan Tenure Text Box is not enabled.");
				myAssert.fail();
			}
			//Validating if Loan Tenure Slider is visible
			if(loanCalculatorPageObj.getLoanTenureSlider().isDisplayed()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_12_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not visible.");
				System.out.println("TestCase_03_08_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not visible.");
				myAssert.fail();
			}
			
			//Validating if Loan Tenure Slider is enabled
			if(loanCalculatorPageObj.getLoanTenureSlider().isEnabled()) {
				myAssert.pass();
			}
			else {
				logger.error("TestCase_13_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not enabled.");
				System.out.println("TestCase_03_08_EMICalculator_ValidatingLoanTenureSlider got failed, Loan Tenure Slider is not enabled.");
				myAssert.fail();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider got failed, validation of Loan Tenure Text Box was unsuccessful");
			
			logger.error("TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider got failed, validation of Loan Tenure Text Box was not successful");
			myAssert.fail();
		}
		
		logger.info("---- TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider Ended ----");
	}	
}
