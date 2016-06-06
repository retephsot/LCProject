package com.test1.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AnnuitantDetailTab extends PageBase
{
	public AnnuitantDetailTab (WebDriver driver)
	{
		super(driver);
	}

	public AnnuitantContactInfoTab ClickContinueLinkwithOutFillingOut() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Annuitant Contact Info")).click();
		
		Thread.sleep(1000);	
		return new AnnuitantContactInfoTab(driver);
		
	}
	
	public AnnuitantContactInfoTab ClickContinueToAnnuitContactInfoLink() throws InterruptedException
	{
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Annuitant Contact Info")).click();
		
		Thread.sleep(1000);	
		return new AnnuitantContactInfoTab(driver);
		
	}
	
	
	public AnnuitantContactInfoTab FillOutAnnuInfoNClickContinue(String ssN, String gender, 
			String mStatus, String bMonth, String bDay, String bYear) throws InterruptedException
	{
		
		//Find SSN# field and enter SSN number
		driver.findElement(By.name("ssn")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("ssn")).sendKeys(ssN);
		
		Thread.sleep(2000);
		
		//Find Gender field and enter gender
		driver.findElement(By.name("gender")).sendKeys(gender);
		Thread.sleep(2000);
		driver.findElement(By.name("gender")).click();
		
		//Find Marital Status, input status
		driver.findElement(By.name("marital")).sendKeys(mStatus);
		Thread.sleep(1000);
		driver.findElement(By.name("marital")).click();
		
		
		
		//Find and click on Date of Birth field
		driver.findElement(By.name("dob")).click();
		Thread.sleep(1000);
		//click on year
		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[1]/div[2]/a/span/i")).click();
		Thread.sleep(1000);
		
		
		//Year selectah
		int byearNew = Integer.parseInt(bYear);
		
		if (1996 <= byearNew && byearNew <= 2015)
			{
			driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
			
			Thread.sleep(1000);
			//find the byear and click
			driver.findElement(By.partialLinkText(bYear)).click();
			Thread.sleep(1000);
			
			}
			
			else if (1986 <= byearNew && byearNew <= 2005)
		 	{
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
				//find the byear and click
				driver.findElement(By.partialLinkText(bYear)).click();
				Thread.sleep(1000);
		 	}
			
			else if (1976 <= byearNew && byearNew <= 1995)
			{
				driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
				//find the byear and click
				driver.findElement(By.partialLinkText(bYear)).click();
				Thread.sleep(1000);
			}
		
			else if (1966 <= byearNew && byearNew <= 1985)
			{
				driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
				//find the byear and click
				driver.findElement(By.partialLinkText(bYear)).click();
				Thread.sleep(1000);
			}
		
			else if (1956 <= byearNew && byearNew <= 1975)
			{
				driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
				//find the byear and click
				driver.findElement(By.partialLinkText(bYear)).click();
				Thread.sleep(1000);
			}
		
			else if (1946 <= byearNew && byearNew <= 1965)
			{
				driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[2]/div[2]/a[1]/b")).click();
		 		Thread.sleep(1000);
				//find the byear and click
				driver.findElement(By.partialLinkText(bYear)).click();
				Thread.sleep(1000);
			}
		
		
		
		//Month selectah
		
		int bmonthNew = Integer.parseInt(bMonth);
		
		Calendar cal1 = Calendar.getInstance();
		// The month value is string
		// str.replaceAll("^0+(?!$)", "") to remove leading zeros
		String currentMonth = new SimpleDateFormat("MM").format(cal1.getTime());
		System.out.println("The current value of Month is: " + currentMonth);
		
		Thread.sleep(3000);
		//to remove leading zero
		currentMonth = currentMonth.replaceAll("^0+(?!$)", "");
		
		System.out.println("The value of current month is now :" + currentMonth);
		
		int currentMonthNew = Integer.parseInt(currentMonth);
		
		if (bmonthNew < currentMonthNew)
		{
			for (int i = currentMonthNew - bmonthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select previous month arrow
				driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/"
						+ "div[1]/div[1]/a/b")).click();
				Thread.sleep(1000);
			}
			
		}
		else if (bmonthNew > currentMonthNew)
		{
			for (int i = bmonthNew - currentMonthNew; i > 0; --i)
			{
				Thread.sleep(1000);
				//select next month arrow
				driver.findElement(By.xpath("//*[@id='annuitantDateOfBirthDiv']/datepicker/div/div[1]/"
						+ "div[3]/a/b")).click();
				Thread.sleep(1000);
			}
		}
		
		//Select the day
		//to remove leading zero
		bDay = bDay.replaceAll("^0+(?!$)", "");
		Thread.sleep(2000);	
		driver.findElement(By.linkText(bDay)).click();
		Thread.sleep(1000);
		
				
		
		//Find Continue to Annuitant button and click on it
		driver.findElement(By.partialLinkText("Continue to Annuitant Contact Info")).click();
		
		Thread.sleep(1000);	
		return new AnnuitantContactInfoTab(driver);
		
	}
	
	
	public boolean IsCreateNewClaimantSuccessful(String annuFirstName, String annuLastName, 
			String ssN, String state, String county, String bMonth, String bDay, String bYear) 
					throws InterruptedException
	{
		
		boolean testresults;
		
		//to remove trailing .0
		bMonth = bMonth.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		Thread.sleep(1000);
		bDay = bDay.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		Thread.sleep(1000);
		bYear = bYear.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		Thread.sleep(1000);
		
		//Find Lookup Existing Claimant button and click on it
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[2]/div[2]/div/div/form/"
				+ "div[1]/div[2]/div[5]/input")).click();
		
		Thread.sleep(1000);	
		
		//Find the first name field and enter first name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(annuFirstName);
		Thread.sleep(1000);
		
		//Find the last name field and enter last name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(annuLastName);
		Thread.sleep(1000);
		
		//Find the SSN# field and enter SS number
		//double click on the ssN field
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.id("ssn"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.id("ssn")).sendKeys(ssN);
		Thread.sleep(1000);
		
		//Find the State field and enter state
		driver.findElement(By.xpath("//*[@id='lookup-existing-annuitant-modal-form']/div[4]/"
				+ "select")).sendKeys(state);
		Thread.sleep(1000);
		
		//Find the search button and click
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(2000);
		
		
		if (driver.findElement(By.xpath("//*[@id='claimants-table']/div/div"
				+ "[6]/div/div[1]/div/table")).isDisplayed())
		{	
		//Existing Claimant table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='claimants-table']/div/div"
				+ "[6]/div/div[1]/div/table")));
		
        Thread.sleep(3000);
		
		System.out.println("getRowElement for added claimant: " + 
				table.getRowElement(annuFirstName).getText());
		
		Thread.sleep(1000);
		
		//work on the below
		String dob = bMonth + "/" + bDay + "/" + bYear;
		
		String inputinfo = annuFirstName + " " + annuLastName + " " + state + " " + 
		county + " " + dob + " " + ssN;
		
        Thread.sleep(2000);
		
		System.out.println("The claimant info includes: " + inputinfo);
		
		Thread.sleep(2000);	
		
		String retreiveRole = table.getRowElement(annuFirstName).getText();
		
		
		testresults = retreiveRole.contains(inputinfo);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		}
		
		else
		{
			System.out.println("The claimant may not have been created as the claimant "
					+ "cannot be found or the claimant info may be mismatched.");
			
			Thread.sleep(1000);	
			testresults = false;
			return testresults;
		}
		
		
	}
	
	
}
