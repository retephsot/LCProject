package com.test1.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseDetailsTab extends PageBase
{
	public PurchaseDetailsTab (WebDriver driver)
	{
		super(driver);
	}

	public RelatedDocumentsTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Related Documents")).click();
		
		Thread.sleep(3000);	
		return new RelatedDocumentsTab(driver);
		
	}
	
	public PurchaseDetailsTab CreateLumpsumPaymentLifeCon(String amount, String month, String year, String day) throws InterruptedException
	{
		//to remove trailing zeros
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		
		System.out.println("The date value = " + month + " " + day + " " + year);
		Thread.sleep(2000);
		
		//Find Add Payment button and click
		driver.findElement(By.xpath("(//a[contains(text(),'Add Payment')])[2]")).click();
		
		Thread.sleep(2000);
		
		//Select payment type - click on type field
		driver.findElement(By.id("purchasePaymentType")).click();
		Thread.sleep(1000);
		//Select lumpsum
		driver.findElement(By.xpath("//*[@id='purchasePaymentType']/option[2]")).click();
		Thread.sleep(1000);
		
		//Enter amount into amount field		
		driver.findElement(By.xpath("//*[@id='purchasePaymentAmount']")).sendKeys(amount);
		Thread.sleep(1000);
		
		
		
		//Find the Start Date field and click		
		driver.findElement(By.id("purchasePaymentStartDate")).click();		
		Thread.sleep(2000);
		
    	//Select year
		
		//click on year
		driver.findElement(By.cssSelector("span.ng-binding")).click();
		Thread.sleep(1000);
		
		
		//Year selectah
		int byearNew = Integer.parseInt(year);
		
		if (1996 <= byearNew && byearNew <= 2015)
			{
			driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
			
			Thread.sleep(2000);
			//find the byear and click
			driver.findElement(By.linkText(year)).click();
			Thread.sleep(1000);
			
			}
			
			else if (1986 <= byearNew && byearNew <= 2005)
		 	{
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
		 	}
			
			else if (1976 <= byearNew && byearNew <= 1995)
			{
				driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1966 <= byearNew && byearNew <= 1985)
			{
				driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1956 <= byearNew && byearNew <= 1975)
			{
				driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1946 <= byearNew && byearNew <= 1965)
			{
				driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.cssSelector("b._720kb-datepicker-default-button")).click();
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
		
		
		if (monthNew < currentMonthNew)
		{
			for (int i = currentMonthNew - monthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select previous month arrow
				//need to create new xpath***
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[1]/div[1]/a/b")).click();
				Thread.sleep(1000);
			}
			
		}
		else if (monthNew > currentMonthNew)
		{
			for (int i = monthNew - currentMonthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select next month arrow   
				//driver.findElement(By.linkText(")"))
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[1]/div[3]/a/b")).click();
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
		return new PurchaseDetailsTab(driver);
		
	}
	
	public boolean isAddPurchaseLumpsumPaymentSuccessful(String amount, String year, 
			String day, String month) throws InterruptedException
	{
		
		String expectedval;
		//to remove trailing .0
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		amount = amount.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		
		//to remove leading 0
		month = month.replaceAll("^0+(?!$)", "");
		day = day.replaceAll("^0+(?!$)", "");
		
		
		String date = month + "/" + day + "/" + year;
		// refresh the page
		//driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		//System.out.println("The value of date is: " + date);
				
		//Thread.sleep(3000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/"
				+ "div/div[2]/div[5]/div/div/div/div[2]/div[2]/div/div[6]/div/div[1]/div/table")));
				
		Thread.sleep(3000);
		
		
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
	
	
	public boolean isAddPurchaseLumpsumRejectionMessageSuccessful() throws InterruptedException
	{
		
		String expectedval = "No annuity found for this account.";
		
		String actualval = driver.findElement(By.className("dx-dialog-message")).getText();
		
		Thread.sleep(1000);	
		
		System.out.println("The popup message is " + 
		driver.findElement(By.className("dx-dialog-message")).getText());
		
		Thread.sleep(1000);	
		
		
		boolean testresults;
		
		testresults = actualval.contains(expectedval);
		
		Thread.sleep(1000);
		
		System.out.println(testresults);
				
		Thread.sleep(1000);	
		
		return testresults;
		
	}		
	
	public PurchaseDetailsTab CreatePeriodicPayment(String amount, String month, String year, String day, String paycount, 
			String frequency) throws InterruptedException
	{
		Thread.sleep(1000);
		
		//Find Add Payment button and click
		driver.findElement(By.xpath("(//a[contains(text(),'Add Payment')])[2]")).click();
		
		Thread.sleep(1000);
		
		//to remove trailing zeros
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
				
		System.out.println("The date value = " + month + " " + day + " " + year);
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		
		//Select payment type - click on type field
		driver.findElement(By.id("purchasePaymentType")).click();
		Thread.sleep(1000);
		//Select periodic
		driver.findElement(By.xpath("//*[@id='purchasePaymentType']/option[3]")).click();
		Thread.sleep(2000);
		
		//Find payment count field and enter count
		driver.findElement(By.id("purchasePaymentCount")).sendKeys(paycount);
		Thread.sleep(1000);
		
		//Enter amount into amount field		
		driver.findElement(By.xpath("//*[@id='purchasePaymentAmount']")).sendKeys(amount);
		Thread.sleep(1000);
		
		//Find the Start Date field and click		
		driver.findElement(By.id("purchasePaymentStartDate")).click();		
		Thread.sleep(2000);
		
    	//Select year
		
		//click on year
		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker"
				+ "/div/div[1]/div[2]/a/span/i")).click();
		Thread.sleep(1000);
		
		
		//Year selectah
		int byearNew = Integer.parseInt(year);
		
		if (1996 <= byearNew && byearNew <= 2015)
			{
			driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
			
			Thread.sleep(2000);
			//find the byear and click
			driver.findElement(By.linkText(year)).click();
			Thread.sleep(1000);
			
			}
			
			else if (1986 <= byearNew && byearNew <= 2005)
		 	{
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
		 	}
			
			else if (1976 <= byearNew && byearNew <= 1995)
			{
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1966 <= byearNew && byearNew <= 1985)
			{
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1956 <= byearNew && byearNew <= 1975)
			{
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(2000);
				//find the year and click
				driver.findElement(By.linkText(year)).click();
				Thread.sleep(1000);
			}
		
			else if (1946 <= byearNew && byearNew <= 1965)
			{
				
				
			for (int i = 0; i < 6; i++)
				{
			 //click the previous year range button
			driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
	 		Thread.sleep(1000);
	
				 }
				
				
//				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
//		 		Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
//		 		Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
//		 		Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
//		 		Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
//		 		Thread.sleep(1000);
//		 		driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
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
		
		
		//System.out.println("The value of monthNew is: " + monthNew);
		

		
		if (monthNew < currentMonthNew)
		{
			for (int i = currentMonthNew - monthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select previous month arrow
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[1]"
						+ "/div[1]/a/b")).click();
				Thread.sleep(1000);
			}
			
		}
		else if (monthNew > currentMonthNew)
		{
			for (int i = monthNew - currentMonthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select next month arrow
				driver.findElement(By.xpath("//*[@id='addPurchasePaymentStartDateDiv']/datepicker/div/div[1]"
						+ "/div[3]/a/b")).click();
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
		
		
		//Find the frequency field and enter frequency
		driver.findElement(By.id("purchasePaymentFrequency")).sendKeys(frequency);
		Thread.sleep(1000);
		driver.findElement(By.id("purchasePaymentFrequency")).click();
		Thread.sleep(1000);
    	
    	//Select Life Contingent
    	//driver.findElement(By.name("life-contingent")).click();
    	//Thread.sleep(1000);
    	//Select Save & Continue button
    	driver.findElement(By.linkText("Save & Continue")).click();			
    	Thread.sleep(2000);
    	
    	
    	
		return new PurchaseDetailsTab(driver);
		
	}
	
	
	
	public boolean isAddPeriodicMonthlyPaymentSuccessful(String amount, String year, 
			String day, String month, String paycount, String frequency, String casenumber) throws InterruptedException
	{
		String frq;
		String expectedval;
		String newmonthstrg;
		
		
		if (frequency.contentEquals("Monthly") )
		{
			frq = "M";
			
		}
		else if (frequency.contentEquals("Weekly"))
		{
			frq = "W";
		}
		else if (frequency.contentEquals("Quarterly"))
		{
			frq = "Q";
		}
		else if (frequency.contentEquals("Semi-Annual"))
		{
			frq = "SA";
		}
		else if (frequency.contentEquals("Annual"))
		{
			frq = "A";
		}
		else
		{
			frq = null;
		}
		
		System.out.println("the value of frequency is :" + frq);
		
		//to remove trailing .0
		paycount = paycount.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		day = day.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		year = year.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		amount = amount.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		//change month and paycount into integer to calculate check month
        int monthint = Integer.parseInt(month);
        int paycountint = Integer.parseInt(paycount);
        int yearint = Integer.parseInt(year);
        
        int yearadder = monthint + paycountint;
        
        if (yearadder > 12)
        {
        	yearint = yearint + 1;
        }
        else if (yearadder > 24)
        {
        	yearint = yearint + 2;
        }
        else if (yearadder > 36)
        {
        	yearint = yearint + 3;
        
        }
        else
        {
        	yearint = yearint + 0;
        }
        
		int newmonth = (monthint + paycountint) - 13;
		
		if (newmonth < 10)
		{
			 newmonthstrg = String.format("%02d", newmonth);
			 
			 //System.out.println("The value of newmonth is " + newmonth);
		}
		else
		{
			 newmonthstrg = String.format("%,d", newmonth);
			 //System.out.println("The value of newmonth is " + newmonth);
		}
		
		Thread.sleep(1000);
		System.out.println("The value of month is :" + newmonthstrg);
		
		
	
		
        //change newmonth back to string to compare
		//String newmonthstrg = String.format("%,d", newmonth);
		
		//change yearint back to string
		String yearintString = String.format("%,d", yearint);
		
		//to remove , from yearintString
		String yearintString2 = yearintString.replace(",", "");
		
		String lastdate = newmonthstrg + "/" + day + "/" + yearintString2;
		
		System.out.println("The lastdate is :" + lastdate);
		
		
		// refresh the page
		//driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		//System.out.println("The value of date is: " + date);
				
		//Thread.sleep(3000);
		
		boolean testresults;
		
		if (driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[5]/"
				+ "div/div/div/div[2]/div[2]/div/div[6]/div/div[1]/div/table")).isDisplayed())
		{
			//Search for payment table
			WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[5]/"
					+ "div/div/div/div[2]/div[2]/div/div[6]/div/div[1]/div/table")));
			
			Thread.sleep(2000);
			
			System.out.println("getRowElement for last pay date: " + 
					table.getRowElement(lastdate).getText());
			
			Thread.sleep(2000);
			
			testresults = table.getRowElement(lastdate).isDisplayed();
			
			System.out.println("The results of the test is :" + testresults);
			
			String retreiveRole = table.getRowElement(lastdate).getText();
			
			Thread.sleep(1000);
			
			//System.out.println("The value for amount is: " + amount);
			
	       
			Thread.sleep(1000);
			
			int amount2 = Integer.parseInt(amount);
			
			String amount3 = String.format("%,d", amount2);
			
			Thread.sleep(1000);
		    System.out.println("The value for amount is: " + amount3);
			Thread.sleep(1000);
			expectedval = lastdate + " " +  frq + " " + "$" + amount3;
			
			Thread.sleep(1000);
			System.out.println("The expected value is :" + expectedval);
			
			Thread.sleep(1000);
			
			testresults = retreiveRole.contains(expectedval);
			
			System.out.println(testresults);
			
			
			Thread.sleep(1000);	
			
			return testresults;
					
			
		}
		
		else
		{
			
			testresults = false;
			
			System.out.println("The periodic payment has not been created for case number " + casenumber +"."
					+ "The payment table is missing.");
			
			return testresults;
			
		}
			
		
	}		
	

// special assignment ************************************************************************	
	public void assignment(int SNumber)
	{
		if (SNumber % 2 == 0 && SNumber % 3 == 0)
		{	
		System.out.println("this is the value of the SNumber :" + SNumber + " BizzFizz");
		}
		else if (SNumber % 2 == 0)
	     
		{
			System.out.println("the value of SNumber is :" + SNumber + " Bizz");
		}
		else if (SNumber % 3 == 0)
		{
			System.out.println("the value of SNumber is :" + SNumber + " Fizz");
		}
		return;
	}
	
	
		
	
}
