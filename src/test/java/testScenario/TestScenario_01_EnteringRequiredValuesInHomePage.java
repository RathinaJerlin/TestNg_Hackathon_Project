package testScenario;
import org.testng.annotations.Test;

import testBase.BaseClass;
import testCase.TestCase_01_EnteringRequiredValuesInHomePage;

public class TestScenario_01_EnteringRequiredValuesInHomePage extends BaseClass
{
    
	@Test
	public void enterRequiredValuesInHomePage() 
	{    	
    	//TestCase_01
    	TestCase_01_EnteringRequiredValuesInHomePage obj1 = new TestCase_01_EnteringRequiredValuesInHomePage();
    	obj1.enterDetails();    	
    	
    }
	
    	
}
