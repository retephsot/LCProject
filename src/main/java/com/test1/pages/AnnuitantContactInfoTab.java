package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnnuitantContactInfoTab extends PageBase
{
	public AnnuitantContactInfoTab (WebDriver driver)
	{
		super(driver);
	}
	
	public AnnuityDetailsTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Annuity Details")).click();
		
		Thread.sleep(1000);	
		return new AnnuityDetailsTab(driver);
		
	}
	

}
