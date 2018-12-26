package NewPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Tests.TestBase;

public class HomePage extends TestBase {
	 public WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		By InformationBy = By.linkText("Information");
	    By InformationTextBy =By.xpath("//div[@class='panel-title']");
	    By searchSymptomsBy =By.xpath("//span[contains(text(),'Search Symptoms')]");
	    By searchSymptomsTextBy = By.xpath("//p[contains(text(),'What Symptoms are you experiencing?')]");
	    
	    public void clickInformation()
	    {
	    	driver.findElement(InformationBy).click();
	    }
	    
	    public String getInformationText()
	    {
	    	
	    	return driver.findElement(InformationTextBy).getText();
	    }
	    public void clickSymptoms()
	    {
	    	driver.findElement(searchSymptomsBy).click();
	    }
	    
	    public String getSearchSymptomsText()
	    {
	    	return driver.findElement(searchSymptomsTextBy).getText();
	    }
	    
	    public void loginToHomePage(){

		 this.clickInformation();
		 this.clickSymptoms();
	      
	    }
}
