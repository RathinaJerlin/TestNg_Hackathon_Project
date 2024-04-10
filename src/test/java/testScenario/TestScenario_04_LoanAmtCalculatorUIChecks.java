package testScenario;

import org.testng.annotations.Test;

import testBase.BaseClass;
import testCase.TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider;
import testCase.TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider;
import testCase.TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider;
import testCase.TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider;
import testCase.TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider;
import testCase.TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider;
import testCase.TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption;
import testCase.TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider;

public class TestScenario_04_LoanAmtCalculatorUIChecks extends BaseClass {
	
	//test case 13
	@Test(priority=1)
	public void LoanAmtCalculator_ValidatingEMITextBoxAndSlider() {
		
		TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider obj13= new TestCase_13_LoanAmtCalculator_ValidatingEMITextBoxAndSlider();
		obj13.validatingEMITextBoxAndSlider();
		
	}
	
	//test case 14
	@Test(priority=2)
	public void LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider() {
		
		TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider obj14= new TestCase_14_LoanAmtCalculator_ValidatingInterestRateTextBoxAndSlider();
		obj14.validateInterestRateTextBoxAndSlider();
	}
	
	//test case 15
	@Test(priority=3)
	public void LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider() {
		
		TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider obj15= new TestCase_15_LoanAmtCalculator_ScaleChangeForInterestRateTextBoxAndSlider();
		obj15.validatingDataFlowBetweenInterestRateSliderAndTextBox();
	}
	
	//test case 16
	@Test(priority=4)
	public void validateLoanTenureTextBoxAndSlider() {
		
		TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider obj16=new TestCase_16_LoanAmtCalculator_ValidatingLoanTenureTextBoxAndSlider();
		obj16.validateLoanTenureTextBoxAndSlider();
	}
	
	//test case 17
	@Test(priority=5)
	public void validatingDataFlowBetweenLoanTenureSliderAndTextBox() {
		
		TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider obj17= new TestCase_17_LoanAmtCalculator_ScaleChangeForLoanTenureTextBoxAndSlider();
		obj17.validatingDataFlowBetweenLoanTenureSliderAndTextBox();
	}
	
	//test case 18
	@Test(priority=6)
	public void validateFeesAndChargesTextBoxAndSlider() {
		
		TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider obj18=new TestCase_18_LoanAmtCalculator_ValidatingFeesAndChargesTextBoxAndSlider();
		obj18.validateFeesAndChargesTextBoxAndSlider();
	}
	
	//test case 19
	@Test(priority=7)
	public void validatingDataFlowBetweenYearAndMonthButton() {
		
		TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption obj19=new TestCase_19_LoanAmtCalculator_ValidationForYearAndMonthOption();
		obj19.validatingDataFlowBetweenYearAndMonthButton();
	}
	
	//test case 20
	@Test(priority=8)
	public void validatingDataFlowBetweenFeesAndChargesSliderAndTextBox() {
		TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider obj20=new TestCase_20_LoanAmtCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider();
		obj20.validatingDataFlowBetweenFeesAndChargesSliderAndTextBox();
	}

}