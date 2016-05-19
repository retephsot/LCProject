package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageBase 
{
	//change to protected so it can be inherited by other class
    //private WebDriver driver;
	protected WebDriver driver;
	
	public PageBase (WebDriver driver)
	{
		this.driver = driver;
	}
	

	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public DefaultLandingPage ClickResearchCasesLink() throws InterruptedException
	{
		// to hover the mouse pointer over the "Research" link
		WebElement ele = driver.findElement(By.partialLinkText("Research"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(1000);
		
		// after hovering the mouse pointer click on the cases link from the drop down
	    driver.findElement(By.xpath("//*[@id='page-container']/header/div[2]/ul/li[2]/ul/li[1]/a")).click();
	    Thread.sleep(1000);
		return new DefaultLandingPage(driver);
	}
	

}
