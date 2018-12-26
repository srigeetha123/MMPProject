package NewPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tests.TestBase;

public class LoginPage extends TestBase {
	 public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

		 
	    By usernameBy = By.id("username");
	    By passwordBy = By.id("password");
	    By loginButtonBy = By.name("submit");
	    By usernametextBy = By.tagName("h3");
	   
		
		
		public void setUserName(String strUserName){

	        driver.findElement(usernameBy).sendKeys(strUserName);

	    }
	    
	    public void setPassword(String strPassword){

	         driver.findElement(passwordBy).sendKeys(strPassword);

	    }
	    public void clickLogin(){

            driver.findElement(loginButtonBy).click();

    }
	    public String getUsernameText(){

	        return driver.findElement(usernametextBy).getText();

	       }
	  
	    public void loginToOpenMrs(String strUserName,String strPasword){

	       
	        this.setUserName(strUserName);
            this.setPassword(strPasword);
	       this.clickLogin();
	      
	    }
	    

	//@Parameters({"usern", "passw"})
	//@Test
	//public void Login(@Optional String usern, @Optional String passw) {

		
		
		
	//}
//
	

	//@Test
	//public void verifyUsername() throws InterruptedException {
	//	String actual = driver.findElement(By.tagName("h3")).getText();
		// Assert.assertTrue(actual);
	//	String expected = "ria1";

	//	System.out.println(actual);

		//if (actual.contains(expected)) {
		//	System.out.println("passed");
	//	} else {
		//	System.out.println("Failed");

	//	}
//
	//}

	//@Test(priority = 0)
	///public void verifyInformation() throws InterruptedException {
		//driver.findElement(By.linkText("Information")).click();
		//Thread.sleep(2000);
		//String expected = "Manage My Patient (MMP) is a medical practice management solution";
		//String text = driver.findElement(By.xpath("//div[@class='panel-title']")).getText();
		//System.out.println(text);
		//System.out.println(text.trim());
		//System.out.println(expected.trim());
		//if (text.trim().equalsIgnoreCase(expected.trim())) {
		//	System.out.println("strings are equal");
		//}

		//Thread.sleep(2000);

	//}

	//@Test(priority = 1)
	//public void searchSymptoms() throws InterruptedException {

	//	driver.findElement(By.xpath("//span[contains(text(),'Search Symptoms')]")).click();
	//	Thread.sleep(2000);
	//	String symptoms = driver.findElement(By.xpath("//p[contains(text(),'What Symptoms are you experiencing?')]"))
		//		.getText();
		//Assert.assertTrue(symptoms.contains("What Symptoms are you experiencing?"));
		//System.out.println(symptoms);
		// driver.findElement(By.xpath("//input[@value='Search']")).sendKeys("cold");

		//String actualButtonText = driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("value");
		//System.out.println(actualButtonText);

	}

