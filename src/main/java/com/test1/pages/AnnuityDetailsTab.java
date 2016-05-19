package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class AnnuityDetailsTab extends PageBase

{

	public AnnuityDetailsTab (WebDriver driver)
	{
		super(driver);
	}
	
	
	public PurchaseDetailsTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Purchase Details")).click();
		
		Thread.sleep(3000);	
		return new PurchaseDetailsTab(driver);
		
	}
	
	
	public AnnuityDetailsTab CreateLumpsumPaymentPrevMonthLifeCon(String amount, String year, String day) throws InterruptedException
	{
		
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		//Find Add Payment button and click
		driver.findElement(By.partialLinkText("Add Payment")).click();
		
		Thread.sleep(2000);
		
		//Select payment type - click on type field
		driver.findElement(By.id("annuityPaymentType")).click();
		Thread.sleep(1000);
		//Select lumpsum
		driver.findElement(By.xpath("//*[@id='annuityPaymentType']/option[2]")).click();
		
		//Enter amount into amount field
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='annuityPaymentAmount']")).sendKeys(amount);
		
		//Find the Start Date field and click
		Thread.sleep(1000);
		driver.findElement(By.id("annuityPaymentStartDate")).click();
		
		Thread.sleep(2000);
		
    	//Select year
    	driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[2]/a/span")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.partialLinkText(year)).click();
    	Thread.sleep(1000);
    	//Select the month previous or next
    	//previous
    	driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[1]/a/b")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[1]/a/b")).click();
    	
    	//next month
//    	driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[3]/a/b")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[3]/a/b")).click();
    	
    	//Select the day
    	Thread.sleep(2000);	
    	driver.findElement(By.linkText(day)).click();
    	Thread.sleep(2000);
    	
    	//Select Life Contingent
    	driver.findElement(By.name("life-contingent")).click();
    	Thread.sleep(1000);
    	//Select Save & Continue button
    	driver.findElement(By.linkText("Save & Continue")).click();
			
    	Thread.sleep(2000);
		return new AnnuityDetailsTab(driver);
		
	}
	
	public AnnuityDetailsTab CreateLumpsumPaymentLifeCon(String amount, String month, String year, String day) throws InterruptedException
	{
		//to remove trailing zeros
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		
		System.out.println("The date value = " + month + " " + day + " " + year);
		Thread.sleep(1000);
		
		//Find Add Payment button and click
		driver.findElement(By.partialLinkText("Add Payment")).click();
		
		Thread.sleep(2000);
		
		//Select payment type - click on type field
		driver.findElement(By.id("annuityPaymentType")).click();
		Thread.sleep(1000);
		//Select lumpsum
		driver.findElement(By.xpath("//*[@id='annuityPaymentType']/option[2]")).click();
		Thread.sleep(1000);
		
		//Enter amount into amount field		
		driver.findElement(By.xpath("//*[@id='annuityPaymentAmount']")).sendKeys(amount);
		Thread.sleep(1000);
		
		//Find the Start Date field and click		
		driver.findElement(By.id("annuityPaymentStartDate")).click();		
		Thread.sleep(2000);
		
    	//Select year
		
		//click on year
		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[2]/a/span/i")).click();
		Thread.sleep(1000);
		
		
		//Year selectah
		int byearNew = Integer.parseInt(year);
		
		if (1996 <= byearNew && byearNew <= 2015)
			{
			driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
			
			Thread.sleep(2000);
			//find the byear and click
			driver.findElement(By.linkText(year)).click();
			Thread.sleep(1000);
			
			}
			
			else if (1986 <= byearNew && byearNew <= 2005)
		 	{
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
		 	}
			
			else if (1976 <= byearNew && byearNew <= 1995)
			{
				driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1966 <= byearNew && byearNew <= 1985)
			{
				driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1956 <= byearNew && byearNew <= 1975)
			{
				driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1946 <= byearNew && byearNew <= 1965)
			{
				driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
			else
			{
				//find the year and click
				Thread.sleep(2000);
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
		
		
		//Month selectah
		
		int monthNew = Integer.parseInt(month);
		
		Calendar cal1 = Calendar.getInstance();
		// The month value is string
		// str.replaceAll("^0+(?!$)", "") to remove leading zeros
		String currentMonth = new SimpleDateFormat("MM").format(cal1.getTime());
		//System.out.println("The current value of Month is: " + currentMonth);
		
		Thread.sleep(2000);
		//to remove leading zero
		currentMonth = currentMonth.replaceAll("^0+(?!$)", "");
		
		System.out.println("The current month value is : " + currentMonth);
		
		Thread.sleep(1000);
		
		int currentMonthNew = Integer.parseInt(currentMonth);
		
		//System.out.println("The value of currentMonthNew is: " + currentMonthNew);
		
		//Thread.sleep(1000);		
		
		//System.out.println("The value of monthNew is: " + monthNew);
		
		//Thread.sleep(1000);
		
		if (monthNew < currentMonthNew)
		{
			for (int i = currentMonthNew - monthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select previous month arrow
				driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[1]/a/b")).click();
				Thread.sleep(1000);
			}
			
		}
		else if (monthNew > currentMonthNew)
		{
			for (int i = monthNew - currentMonthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select next month arrow
				driver.findElement(By.xpath("//*[@id='startDateAnnuitant']/div/div[1]/div[3]/a")).click();
				Thread.sleep(1000);
			}
		}
		
		//Select the day
		//to remove leading zeros
		day = day.replaceAll("^0+(?!$)", "");
		Thread.sleep(1000);	
		System.out.println("The value of day is: " + day);
		Thread.sleep(1000);
		driver.findElement(By.linkText(day)).click();
		Thread.sleep(1000);
		
    	
    	//Select Life Contingent
    	driver.findElement(By.name("life-contingent")).click();
    	Thread.sleep(1000);
    	//Select Save & Continue button
    	driver.findElement(By.linkText("Save & Continue")).click();
			
    	Thread.sleep(2000);
		return new AnnuityDetailsTab(driver);
		
	}
	
	
	
	public boolean isAddLumpsumPaymentSuccessful(String amount, String year, 
			String day, String month) throws InterruptedException
	{
		
		String expectedval;
		//to remove trailing .0
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		amount = amount.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		String date = month + "/" + day + "/" + year;
		// refresh the page
		//driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		//System.out.println("The value of date is: " + date);
				
		//Thread.sleep(3000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[4]/"
				+ "div/div/div/div[2]/div[3]/div/div[6]/div/div[1]/div/table")));
				
		Thread.sleep(2000);
		
		
		//Print out all webtable values
//		System.out.println("");
//		System.out.println("==== getTextDisplayedInAllRows ====");
//		String[][] tableText = table.getTextDisplayedInAllRows();
//		for(String[] row:tableText)
//		{
//			for(String cell:row)
//			{
//				System.out.print(cell+"   ");
//			}
//			System.out.println("");
//		}
		
		//Thread.sleep(3000);
		
		System.out.println("getRowElement for date: " + 
				table.getRowElement(date).getText());
		
		Thread.sleep(2000);
		
		//String Claimant = annuFirstName + " " + annuLastName;		
		//System.out.println("The Claimant name is: " + Claimant);
				
		String retreiveRole = table.getRowElement(date).getText();
		
		Thread.sleep(1000);
		
		//System.out.println("The value for amount is: " + amount);
		
       
		Thread.sleep(1000);
		
		int amount2 = Integer.parseInt(amount);
		
		String amount3 = String.format("%,d", amount2);
		
		//DecimalFormat formatter = new DecimalFormat("#,###,###");	        
	    //String amount2 = formatter.format(amount);
			
	    Thread.sleep(1000);
	    System.out.println("The value for amount is: " + amount3);
		Thread.sleep(1000);
		expectedval = date + " " + "A " + "$" + amount3;
		
		Thread.sleep(1000);
		System.out.println("The expected value is :" + expectedval);
		
		Thread.sleep(1000);
		
		boolean testresults;
		
		testresults = retreiveRole.contains(expectedval);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		
	}		
	
	
	
	
	
	
}
