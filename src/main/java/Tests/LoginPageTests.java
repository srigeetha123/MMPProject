package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NewPages.HomePage;
import NewPages.LoginPage;

public class LoginPageTests extends TestBase{
	
	 
LoginPage objlogin;
HomePage objhome;
@Parameters({"strUserName","strPasword"})
@Test(priority=0)
public void verifyLoginSuccess(String strUserName, String strPasword)
{
objlogin = new LoginPage(driver);
objlogin.loginToOpenMrs(strUserName, strPasword);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	

	
}
@Test(priority=1)
public void verifyLoginUserName()
{ 
	String loginPageUsername = objlogin.getUsernameText();
	String expected ="ria1";
	Assert.assertEquals(loginPageUsername, expected);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

}

@Test(priority=2)
public void verifyInformationTab()
{
	objhome = new HomePage(driver);
	objhome.clickInformation();
	String informationText = objhome.getInformationText();
	String expectedText= "Information";
	Assert.assertEquals(informationText, expectedText);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
}
@Test(priority=2)
public void verifySearchSymptomsTab()
{
	
	objhome.clickSymptoms();
	String searchText = objhome.getSearchSymptomsText();
	String expectedSearchText="What Symptoms are you experiencing?";
 	Assert.assertEquals(searchText, expectedSearchText);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	
	
}
}
