package com.test1.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaseSummaryTab extends PageBase
{
	public CaseSummaryTab (WebDriver driver)
	{
		super(driver);
	}
	
	public AnnuitantDetailTab filloutTabAndClickContinueLink(String state, String county, 
			String instructions, String researchstat, String month, String day, String year) throws InterruptedException
	{
		String CurrentMonth;
		String clearField;
		
		clearField = "-- choose";
		
		//Find State field and clear
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).sendKeys(clearField);
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		Thread.sleep(1000);	
		
		//Find State field enter state and click
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).sendKeys(state);
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		
		//Thread.sleep(1000);	
		
		//driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		
		//Find County field, enter county and click 
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).click();
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).sendKeys(county);
		Thread.sleep(1000);	
        driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).click();
		
		//Thread.sleep(1000);	
		
		//Find date field, enter date and click 
		//driver.findElement(By.xpath("//*[@id='annuitant.fileDate']")).clear();
		//Thread.sleep(1000);	
		//driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/datepicker/input")).sendKeys(date);
		//driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/datepicker/input")).click();
		//Thread.sleep(1000);
        
        //New select File Date from the date picker pop-up
      //Click on the File Date field
	  driver.findElement(By.xpath("//*[@id='annuitant.fileDate']")).click();    	
	  Thread.sleep(1000);
        
      //Year selectah
    	int yearInt = Integer.parseInt(year);
    	    	   	
    	
    	if (1996 <= yearInt && yearInt <= 2015)
    		{
    		//Click on the Year 
        	driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/div[2]/a/span/i")).click();    	
        	Thread.sleep(1000);
        	
    		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    		
    		Thread.sleep(1000);
    		//find the year and click
    		System.out.println("The value of year: " + year);
    		Thread.sleep(1000);
    		
    		driver.findElement(By.linkText(year)).click();
    		Thread.sleep(1000);
    		
    		}
    		
    		else if (1986 <= yearInt && yearInt <= 2005)
    	 	{
    			//Click on the Year 
    	    	driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/div[2]/a/span/i")).click();    	
    	    	Thread.sleep(1000);
    	    	
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		
    	 		System.out.println("The value of year: " + year);
        		Thread.sleep(1000);
    			//find the year and click
    			driver.findElement(By.linkText(year)).click();
    			Thread.sleep(1000);
    	 	}
    		
    		else if (1976 <= yearInt && yearInt <= 1995)
    		{
    			//Click on the Year 
    	    	driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/div[2]/a/span/i")).click();    	
    	    	Thread.sleep(1000);
    			driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		
    	 		System.out.println("The value of year: " + year);
        		Thread.sleep(1000);
    			//find the year and click
    			driver.findElement(By.linkText(year)).click();
    			Thread.sleep(1000);
    		}
    	
    		else if (1966 <= yearInt && yearInt <= 1985)
    		{
    			//Click on the Year 
    	    	driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/div[2]/a/span/i")).click();    	
    	    	Thread.sleep(1000);
    			driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
    	 		Thread.sleep(1000);
    	 		
    	 		System.out.println("The value of year: " + year);
        		Thread.sleep(1000);
    			//find the year and click
    			driver.findElement(By.linkText(year)).click();
    			Thread.sleep(1000);
    		}
    	
    	
    		else if (2016 <= yearInt && yearInt <= 2025)
    		{
    			//Click on the Year 
            	driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/div[2]/a/span/i")).click();    	
            	Thread.sleep(1000);
            	
    			driver.findElement(By.linkText(year)).click();
    			Thread.sleep(1000);
    		}
    	
    	//Month selectah
    	
    	//to remove leading zero
    	//month = month.replaceAll("^0+(?!$)", "");
    	
    	//to remove trailing zero
    	month = month.replaceAll("\\.0*$",  "");
    	
    	int monthInt = Integer.parseInt(month);
    	
    	//To get the current month value
    	Calendar cal1 = Calendar.getInstance();
    	// The month value is string
    	// str.replaceAll("^0+(?!$)", "") to remove leading zeros
    	CurrentMonth = new SimpleDateFormat("MM").format(cal1.getTime());
    	System.out.println("The current value of Month is: " + CurrentMonth);
    	
    	Thread.sleep(2000);
    	//to remove leading zero
    	CurrentMonth = CurrentMonth.replaceAll("^0+(?!$)", "");
    	
    	
    	int currentMonthNew = Integer.parseInt(CurrentMonth);
    	
    	if (monthInt < currentMonthNew)
    	{
    		for (int i = currentMonthNew - monthInt; i > 0; --i)
    		{
    			Thread.sleep(1000);
    			//select previous month arrow
    			driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/"
    					+ "div[1]/a/b")).click();
    			Thread.sleep(1000);
    		}
    		
    	}
    	else if (monthInt > currentMonthNew)
    	{
    		for (int i = monthInt - currentMonthNew; i > 0; --i)
    		{
    			Thread.sleep(1000);
    			//select next month arrow
    			driver.findElement(By.xpath("//*[@id='annuitantFileDateDiv']/datepicker/div/div[1]/div"
    					+ "[3]/a/b")).click();
    			Thread.sleep(1000);
    		}
    	}
    	
    	//Select the day
    	Thread.sleep(1000);	
    	
    	//to remove leading zero
    	day = day.replaceAll("^0+(?!$)", "");
    	
    	//to remove trailing zero
    	day = day.replaceAll("\\.0*$",  "");
    	
    	System.out.println("This is the value of day : " + day);
    	
    	//day = day + 1;
    	
    	Thread.sleep(2000);	
    	
    	//driver.findElement(By.xpath("(//a[contains(text()," + day + ")])[2]")).click();
    	driver.findElement(By.linkText(day)).click();
    	
    	Thread.sleep(2000);
    	                             
		
		
		//find the research status field and enter status  //*[@id='form-case-summary']/div[1]/div[2]/div[4]/select
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).sendKeys(researchstat);
		
		Thread.sleep(1000);	
		//Find instructions text box enter instructions
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).sendKeys(instructions);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).click();
		
		
		Thread.sleep(1000);	
		//Find Next Page button and click on it
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[8]/div[1]/a")).click();
		Thread.sleep(1000);	
		
		return new AnnuitantDetailTab(driver);
		
	}
	
	
	public AnnuitantDetailTab fillCaseSumPrevMonthAndClickContinueLink(String state, String county, 
			String instructions, String researchstat, String day, String year) throws InterruptedException
	{
		
		//Find State field enter state and click
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).sendKeys(state);
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		
		//Thread.sleep(1000);	
		
		//driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		
		//Find County field, enter county and click 
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).click();
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).sendKeys(county);
		Thread.sleep(1000);	
        driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).click();
		
		Thread.sleep(1000);	
		
        //Select File Date
		// click on the file date field
    	driver.findElement(By.xpath("//*[@id='annuitant.fileDate']")).click();
    	Thread.sleep(2000);
    	//Select year
    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]"
    			+ "/datepicker/div/div[1]/div[2]/a/span")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.partialLinkText(year)).click();
    	Thread.sleep(2000);
    	//Select the month previous or next
    	//previous
    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
    			+ "datepicker/div/div[1]/div[1]/a/b")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
//    			+ "datepicker/div/div[1]/div[1]/a/b")).click();
    	
    	//next month
//    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
//    			+ "datepicker/div/div[1]/div[3]/a/b")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
//    			+ "datepicker/div/div[1]/div[3]/a/b")).click();
    	
    	//Select the day
    	Thread.sleep(2000);	
    	driver.findElement(By.linkText(day)).click();
    	Thread.sleep(2000);
		
		
		//find the research status field and enter status  //*[@id='form-case-summary']/div[1]/div[2]/div[4]/select
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).sendKeys(researchstat);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).click();
		Thread.sleep(1000);	
		//Find instructions text box enter instructions
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).sendKeys(instructions);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).click();
		
		
		Thread.sleep(1000);	
		//Find Next Page button and click on it
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[8]/div[1]/a")).click();
		Thread.sleep(1000);	
		
		return new AnnuitantDetailTab(driver);
		
	}
	
	public AnnuitantDetailTab fillCaseSumThisMonthAndClickContinueLink(String state, String county, 
			String instructions, String researchstat, String day, String year) throws InterruptedException
	{
		
		//Find State field enter state and click
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).sendKeys(state);
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		
		//Thread.sleep(1000);	
		
		//driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[3]/select")).click();
		
		//Find County field, enter county and click 
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).click();
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).sendKeys(county);
		Thread.sleep(1000);	
        driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[4]/select")).click();
		
		Thread.sleep(1000);	
		
        //Select File Date
		// click on the file date field
    	driver.findElement(By.xpath("//*[@id='annuitant.fileDate']")).click();
    	Thread.sleep(2000);
    	//Select year
    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]"
    			+ "/datepicker/div/div[1]/div[2]/a/span")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.partialLinkText(year)).click();
    	Thread.sleep(2000);
    	//Select the month previous or next
    	//previous
    	//driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
    	//		+ "datepicker/div/div[1]/div[1]/a/b")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
//    			+ "datepicker/div/div[1]/div[1]/a/b")).click();
    	
    	//next month
//    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
//    			+ "datepicker/div/div[1]/div[3]/a/b")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[1]/div[5]/"
//    			+ "datepicker/div/div[1]/div[3]/a/b")).click();
    	
    	//Select the day
    	Thread.sleep(2000);	
    	driver.findElement(By.linkText(day)).click();
    	Thread.sleep(2000);
		
		
		//find the research status field and enter status  //*[@id='form-case-summary']/div[1]/div[2]/div[4]/select
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).sendKeys(researchstat);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[1]/div[2]/div[4]/select")).click();
		Thread.sleep(1000);	
		//Find instructions text box enter instructions
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).sendKeys(instructions);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='form-case-summary']/div[2]/div/textarea")).click();
		
		
		Thread.sleep(1000);	
		//Find Next Page button and click on it
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[8]/div[1]/a")).click();
		Thread.sleep(1000);	
		
		return new AnnuitantDetailTab(driver);
		
	}
	
	
	public AnnuitantDetailTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Annuitant Details")).click();
		
		Thread.sleep(1000);	
		return new AnnuitantDetailTab(driver);
		
	}

}
