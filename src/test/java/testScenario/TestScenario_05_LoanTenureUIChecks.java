package testScenario;

import org.testng.annotations.Test;

import testBase.BaseClass;
import testCase.TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider;
import testCase.TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider;
import testCase.TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider;
import testCase.TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider;
import testCase.TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider;
import testCase.TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider;
import testCase.TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider;

public class TestScenario_05_LoanTenureUIChecks extends BaseClass {
	
	
	//test case 21
	@Test
	public void validateLoanAmountTextBoxAndSlider() {
		
		TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider obj21=new TestCase_21_LoanTenureCalculator_ValidatingLoanAmountTextBoxAndSlider();
		obj21.validateLoanAmountTextBoxAndSlider();
		
	}
	
	//test case 22
	@Test
	public void validatingDataFlowBetweenLoanAmountSliderAndTextBox() {
		
		TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider obj22=new TestCase_22_LoanTenureCalculator_ScaleChangeForLoanAmountTextBoxAndSlider();
		obj22.validatingDataFlowBetweenLoanAmountSliderAndTextBox();
	}
	
	//test case 23
	@Test
	public void validatingEMITextBoxAndSlider() {
		
		TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider obj23=new TestCase_23_LoanTenureCalculator_ValidatingEMITextBoxAndSlider();
		obj23.validatingEMITextBoxAndSlider();
	}
	
	//test case 24
	@Test
	public void validateInterestRateTextBoxAndSlider() {
		
		TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider obj24=new TestCase_24_LoanTenureCalculator_ValidatingInterestRateTextBoxAndSlider();
		obj24.validateInterestRateTextBoxAndSlider();
	}
	
	//test case 25
	@Test
	public void validateDataFlowBetweenInterestRateSliderAndTextBox() {
		
		TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider obj25=new TestCase_25_LoanTenureCalculator_ScaleChangeForInterestRateTextBoxAndSlider();
		obj25.validateDataFlowBetweenInterestRateSliderAndTextBox();
	}
	
	//test case 26
	@Test
	public void validateFeesAndChargesTextBoxAndSlider() {
		
		TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider obj26= new TestCase_26_LoanTenureCalculator_ValidatingFeesAndChargesTextBoxAndSlider();
		obj26.validateFeesAndChargesTextBoxAndSlider();
	}
	
	//test case 27
	@Test
	public void validatingDataFlowBetweenFeesAndChargesSliderAndTextBox() {
		
		TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider obj27=new TestCase_27_LoanTenureCalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider();
		obj27.validatingDataFlowBetweenFeesAndChargesSliderAndTextBox();
	}
	

}
