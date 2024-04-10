package testScenario;

import java.io.IOException;

import org.testng.annotations.Test;

import testBase.BaseClass;
import testCase.TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider;
import testCase.TestCase_05_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider;

public class TestScenario_03_EMICalculatorPageUIChecks extends BaseClass
{
   @Test(priority=1)
	public void ValidatingLoanAmountTextBoxAndSlider() throws IOException
	{
		//TestCase_04
		TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider obj4 = new TestCase_04_EMICalculator_ValidatingLoanAmountTextBoxAndSlider();
		obj4.validateLoanAmountTextBoxAndSlider();
		captureScreen("TC_04");
	}
	
   @Test(priority=2)
	public void ScaleChangeForLoanAmountTextBoxAndSlider() throws IOException
	{
		//TestCase_05
		TestCase_05_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider obj5 = new TestCase_05_EMICalculator_ScaleChangeForLoanAmountTextBoxAndSlider();
		obj5.validatingDataFlowBetweenLoanAmountSliderAndTextBox();
		captureScreen("TC_05");
	}
	
   @Test(priority=3)
	public void ValidatingInterestRateTextBoxAndSlider() throws IOException
	{
		//TestCase_06
		testCase.TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider obj6 = new testCase.TestCase_06_EMICalculator_ValidatingInterestRateTextBoxAndSlider();
		obj6.validateInterestRateTextBox();
		captureScreen("TC_06");
	}
	
   @Test(priority=4)
	public void ScaleChangeForInterestRateTextBoxAndSlider () throws IOException
	{
		//TestCase_07
		testCase.TestCase_07_EMICalculator_ScaleChangeForInterestRateTextBoxAndSlider obj7 = new testCase.TestCase_07_EMICalculator_ScaleChangeForInterestRateTextBoxAndSlider();
		obj7.validatingDataFlowBetweenInterestRateSliderAndTextBox();
		captureScreen("TC_07");
	}
    
   @Test(priority=5)
	public void ValidatingLoanTenureTextBoxAndSlider () throws IOException
	{
		//TestCase_08
		testCase.TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider obj8 = new testCase.TestCase_08_EMICalculator_ValidatingLoanTenureTextBoxAndSlider();
		obj8.validateLoanTenureTextBox();
		captureScreen("TC_08");
	}
	
   @Test(priority=6)
	public void EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider () throws IOException
	{
		//TestCase_09
		testCase.TestCase_09_EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider obj9 = new testCase.TestCase_09_EMICalculator_ScaleChangeForLoanTenureTextBoxAndSlider();
		obj9.validatingDataFlowBetweenLoanTenureSliderAndTextBox();
		captureScreen("TC_09");
	}
	
   @Test(priority=7)
	public void ValidatingFeesAndChargesTextBoxAndSlider () throws IOException
	{
		//TestCase_10
		testCase.TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider obj10 = new testCase.TestCase_10_EMICalculator_ValidatingFeesAndChargesTextBoxAndSlider();
		obj10.validateFeesAndChargesTextBox();
		captureScreen("TC_10");
	}
	
   @Test(priority=8)
	public void ScaleChangeForFeesAndChargesTextBoxAndSlider () throws IOException
	{
		//TestCase_11
		testCase.TestCase_11_EMICalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider obj11 = new testCase.TestCase_11_EMICalculator_ScaleChangeForFeesAndChargesTextBoxAndSlider();
		obj11.validatingDataFlowBetweenFeesAndChargesSliderAndTextBox();
		captureScreen("TC_11");
	}
	
   @Test(priority=9)
	public void ValidationForYearAndMonthOption () throws IOException
	{
		//TestCase_12
		testCase.TestCase_12_EMICalculator_ValidationForYearAndMonthOption obj12 = new testCase.TestCase_12_EMICalculator_ValidationForYearAndMonthOption();
		obj12.validatingDataFlowBetweenYearAndMonthButton();
		captureScreen("TC_12");
	}
	

	
	
}
