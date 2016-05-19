package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResearchRequestsPage extends PageBase
{
	public ResearchRequestsPage (WebDriver driver)
	{
		super(driver);
	}

	public DefaultLandingPage ClickRequestsLink() throws InterruptedException
	{
		// refresh the page
		//driver.navigate().refresh();
		

		// to hover the mouse pointer over the "Research" link
		WebElement ele = driver.findElement(By.partialLinkText("Research"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		// after hovering the mouse pointer click on the Cases link from the drop down
	    driver.findElement(By.xpath("//*[@id='page-container']/header/div[2]/ul/li[2]/ul/li[1]/a")).click();
					
		
		
		return new DefaultLandingPage(driver);
		
		
	}
	
	
	
	
}
