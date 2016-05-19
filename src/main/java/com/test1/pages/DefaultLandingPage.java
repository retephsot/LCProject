package com.test1.pages;

import java.text.DecimalFormat;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test1.pages.WebTable;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DefaultLandingPage extends PageBase
{

	//private WebDriver driver;
	
	public DefaultLandingPage (WebDriver driver)
	{
		super(driver);
	}
	
//	public String getTitle()
//	{
//		return driver.getTitle();
//	}
	
	
	public DefaultLandingPage AddNewCase(String casenumber, String annuFirstName, String annuLastName) throws InterruptedException
	{
		// refresh the page
		//driver.navigate().refresh();
		
		//Thread.sleep(3000);
		
		//System.out.println(driver.getTitle());
				
		Thread.sleep(8000);
		
		//Find the Add New Case button and click
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[1]/button")).click();
		
		Thread.sleep(2000);
		
		//Find the Cancel button and clilck
		//driver.findElement(By.partialLinkText("Cancel")).click();
		
		//Thread.sleep(2000);
		
		//Find the Add New Case button and click
		//driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[1]/button")).click();
		
		
		//Find the choose case type and select OAS
		driver.findElement(By.xpath("//*[@id='caseTType']")).click();	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='caseTType']/option[2]")).click();	
		
		//Enter Case Number
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(casenumber);
		
		//Enter Annu First Name
		driver.findElement(By.id("firstname")).sendKeys(annuFirstName);
		
		//Enter Annu Last Name
		driver.findElement(By.xpath("//*[@id='add-case-modal-form']/div[4]/input")).sendKeys(annuLastName);
		
		//Find Save and Continue button and click
		driver.findElement(By.linkText("Save & Continue")).click();	
			
		Thread.sleep(1000);
		
		return new DefaultLandingPage(driver);
		
		
	}
	
	
	public DefaultLandingPage AddNewPriorDealCase(String casenumber, String annuFirstName, String annuLastName) throws InterruptedException
	{
		// refresh the page
		//driver.navigate().refresh();
		
		//Thread.sleep(2000);
		
		//System.out.println(driver.getTitle());
		
		
		Thread.sleep(8000);
		
		//Find the Add New Case button and click
		driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[1]/button")).click();
		
		Thread.sleep(2000);
		
		//Find the Cancel button and clilck
		//driver.findElement(By.partialLinkText("Cancel")).click();
		
		//Thread.sleep(2000);
		
		//Find the Add New Case button and click
		//driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		
		//Find the choose case type and select Prior Deal
		driver.findElement(By.name("case-type")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='caseTType']/option[3]")).click();	
		
		//Enter Case Number
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(casenumber);
		
		//Enter Annu First Name
		driver.findElement(By.id("firstname")).sendKeys(annuFirstName);
		
		//Enter Annu Last Name
		driver.findElement(By.xpath("//*[@id='add-case-modal-form']/div[4]/input")).sendKeys(annuLastName);
		
		//Find Save and Continue button and click
		driver.findElement(By.linkText("Save & Continue")).click();	
			
		Thread.sleep(1000);
		
		return new DefaultLandingPage(driver);
		
		
	}
	
	public boolean isAddNewCaseSuccessful(String casenumber, String annuFirstName, 
			String annuLastName) throws InterruptedException
	{
		// refresh the page
		//driver.navigate().refresh();
				
		Thread.sleep(3000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/"
				+ "div/div/div/div[6]/div/div[1]/div/table")));
				
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
		
		//System.out.println(table.getRowElement(casenumber).getText());
		
		//Thread.sleep(3000);
		
		System.out.println("getRowElement for case number: " + 
				table.getRowElement(casenumber).getText());
		
		Thread.sleep(1000);
		
		String Claimant = annuFirstName + " " + annuLastName;
		
		System.out.println("The Claimant name is: " + Claimant);
		
		Thread.sleep(2000);	
		
		String retreiveRole = table.getRowElement(casenumber).getText();
		
		boolean testresults;
		
		testresults = retreiveRole.contains(Claimant);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		
	}
	
	
	public boolean isAddNewCaseSuccessfulCheckDB(String casenumber, String annuFirstName, 
			String annuLastName) throws InterruptedException, SQLException, ClassNotFoundException
	{
		String uName = null;
		// refresh the page
		//driver.navigate().refresh();
				
		Thread.sleep(3000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/"
				+ "div/div/div/div[6]/div/div[1]/div/table")));
				
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
		
		//System.out.println(table.getRowElement(casenumber).getText());
		
		//Thread.sleep(3000);
		
		System.out.println("getRowElement for case number: " + 
				table.getRowElement(casenumber).getText());
		
		Thread.sleep(1000);
		
		String Claimant = annuFirstName + " " + annuLastName;
		
		System.out.println("The Claimant name is: " + Claimant);
		
		Thread.sleep(2000);	
		
		String retreiveRole = table.getRowElement(casenumber).getText();
		
		//connect to DB for validation
		// Connection url
				String dbUrl = "jdbc:jtds:sqlserver://SOLAD:1433/LibertyQA";
				
				// Give DB username
				String username = "jslee";
				
				// Give DB password
				String password = "fast13BT";
				
				String ColName = "UserName";
				
				// SQL query
				//String query = "SELECT * FROM ccDaily.ScheduledTests WHERE RequestedOn LIKE \"2016-03-22%\";";		
				//SELECT UserName FROM ccDemo.Users WHERE UserFirstName = \"Rick\";
				String query = "SELECT AgreementID FROM LibertyQA.dbo.tblAgreement WHERE CaseNumber = 'CaseNumber123';";
				
				//Local SQL Server JDBC driver
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDrive");
				
				// get connection to DB
				Connection con = DriverManager.getConnection(dbUrl, username, password);
				
				// to show if DB connection is successful
				System.out.println("Connection Successfull");
		        System.out.println(con); 
				
				// Create statement object
				Statement stmt = con.createStatement();
				
				Thread.sleep(2000);
				
				// Send SQL query to DB
				ResultSet rs = stmt.executeQuery(query);
				

				
				// While loop to get ResultSet all rows of data
				while(rs.next())
				{
//					System.out.println("RequestedOn: " + rs.getString("RequestedOn"));
//					System.out.println("ScheduledTestNotes: " + rs.getString("ScheduledTestNotes"));
//					System.out.println("SiteID: " + rs.getString("SiteID"));
//					System.out.println("RequestedBy: " + rs.getString("RequestedBy"));
//					System.out.println("NextStartDate: " + rs.getString("NextStartDate"));
//					System.out.println("NextEndDate: " + rs.getString("NextEndDate"));
					
				    uName = rs.getString(1);
				    
				    Thread.sleep(2000);
				    
					System.out.println(uName);
				}
								
				// Close DB connection
				con.close();
				
				System.out.println("The value for uName outside of the while loop is " + uName);
		
		
		
		boolean testresults;
		
		testresults = retreiveRole.contains(Claimant);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		
	}
	
	
	public boolean isAddCaseSummaryInfoSuccessful(String casenumber, String state, String county, 
			String instructions, String researchstat, String date, String annuFirstName, String annuLastName) throws InterruptedException
	{
		
		
		
		// refresh the page
		//driver.navigate().refresh();
				
		Thread.sleep(2000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/"
				+ "div/div/div/div[6]/div/div[1]/div/table")));
				
		Thread.sleep(3000);
		
		System.out.println("getRowElement for case number: " + 
				table.getRowElement(casenumber).getText());
		
		Thread.sleep(1000);
		
		String inputinfo = state + " " + county + " " + annuFirstName + " " + annuLastName + " " + date;
		
		System.out.println("The added info includes: " + inputinfo);
		
		Thread.sleep(2000);	
		
		String retreiveRole = table.getRowElement(casenumber).getText();
		
		boolean testresults;
		
		testresults = retreiveRole.contains(inputinfo);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		
	}
	
	
	public boolean isAddCaseSummaryInfoPrevMonthSuccessful(String casenumber, String state, String county, 
			String instructions, String researchstat, String year, String day, String month, String annuFirstName, String annuLastName) throws InterruptedException
	{
		Thread.sleep(3000);
		
		// refresh the page
		//driver.navigate().refresh();
				
		//Thread.sleep(2000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/"
				+ "div/div/div/div[6]/div/div[1]/div/table")));
				
		Thread.sleep(3000);
		
		System.out.println("getRowElement for case number: " + 
				table.getRowElement(casenumber).getText());
		
		Thread.sleep(1000);
		
		//to remove trailing .0
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		Thread.sleep(1000);
		
		System.out.println("This is the value of month: " + month);
		
		
		
		Thread.sleep(2000);
		
		String inputinfo = state + " " + county + " " + annuFirstName + " " + annuLastName + " " + month + "/" + day + "/" + year;
		
		Thread.sleep(2000);
		
		System.out.println("The added info includes: " + inputinfo);
		
		Thread.sleep(2000);	
		
		String retreiveRole = table.getRowElement(casenumber).getText();
		
		boolean testresults;
		
		testresults = retreiveRole.contains(inputinfo);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		
	}
	
	
	public boolean isAddCaseSummaryInfoNewSuccessful(String casenumber, String state, String county, 
			String instructions, String researchstat, String year, String day, String month, String annuFirstName, String annuLastName) throws InterruptedException
	{
		Thread.sleep(3000);
		
		// refresh the page
		//driver.navigate().refresh();
				
		//Thread.sleep(2000);
		
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/"
				+ "div/div/div/div[6]/div/div[1]/div/table")));
				
		Thread.sleep(3000);
		
		System.out.println("getRowElement for case number: " + 
				table.getRowElement(casenumber).getText());
		
		Thread.sleep(1000);
		
		//to remove trailing .0
		month = month.replaceAll("([0-9])\\.0+([^0-9]|$)", "$1$2");
		
		Thread.sleep(1000);
		
		System.out.println("This is the value of month: " + month);
		
		
		
		Thread.sleep(2000);
		
		//to remove trailing zero
    	day = day.replaceAll("\\.0*$",  "");
		
		String inputinfo = state + " " + county + " " + annuFirstName + " " + annuLastName + " " + month + "/" + day + "/" + year;
		
		Thread.sleep(2000);
		
		System.out.println("The added info includes: " + inputinfo);
		
		Thread.sleep(2000);	
		
		String retreiveRole = table.getRowElement(casenumber).getText();
		
		boolean testresults;
		
		testresults = retreiveRole.contains(inputinfo);
		
		System.out.println(testresults);
		
		
		Thread.sleep(1000);	
		
		return testresults;
		
	}
	
	public CaseSummaryTab clickCaseNumbertLink(String casenumber) throws InterruptedException
	{
		
		Thread.sleep(8000);
		//Liberty QA launch base table
		WebTable table = new WebTable(driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/div/div/div/"
				+ "div[6]/div/div[1]/div/table")));
		
		Thread.sleep(1000);
		
		
		//Scroll down
		
		//Instance of Javascript executor		
		//JavascriptExecutor je = (JavascriptExecutor) driver;
		//Identify which element will appear after scrolling down 
	    //WebElement element = driver.findElement(By.xpath("//*[@id='page-container']/div/div/div[3]/div/div"
	   // 		+ "/div/div[6]/div/div[1]/div/table/tbody/tr[17]/td[2]/div/a"));
	    // execute query which will scroll until element is not appearing on the page
	   // je.executeScript("arguments[0].scrollIntoView(true);",element);
		
	   // Thread.sleep(2000);
	    
		// to get all elements from role that contains "GGS1234501".
		
		System.out.println("getRowElement(" + casenumber + "): " + table.getRowElement(casenumber).getText());
		
		Thread.sleep(1000);	
		//Find Case # link and click on it
		driver.findElement(By.partialLinkText(casenumber)).click();
		
		Thread.sleep(1000);	
		
		return new CaseSummaryTab(driver);
		
	}
	
	
	public ResearchRequestsPage ClickRequestsLink() throws InterruptedException
	{
		// refresh the page
		//driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		// to hover the mouse pointer over the "Research" link
		WebElement ele = driver.findElement(By.partialLinkText("Research"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		// after hovering the mouse pointer click on the Requests link from the drop down
	    driver.findElement(By.xpath("//*[@id='page-container']/header/div[2]/ul/li[2]/ul/li[2]/a")).click();
					
		
		//Thread.sleep(3000);
		
		// to hover the mouse pointer over the "Research" link
//		WebElement ele2 = driver.findElement(By.partialLinkText("Research"));
//		Actions action2 = new Actions(driver);
//		action2.moveToElement(ele2).build().perform();
//		
		// after hovering the mouse pointer click on the cases link from the drop down
	    //driver.findElement(By.xpath("//*[@id='page-container']/header/div[2]/ul/li[2]/ul/li[1]/a")).click();
						
	//    driver.findElement(By.partialLinkText("Cases")).click();	
		
		
		return new ResearchRequestsPage(driver);
		
		
	}
	
	

//	how to handle multiple windows / tabs
//	public DefaultLoadingPage SiteDView(String sitename) throws InterruptedException
//	{
//		//to get the window count
//		//driver.getWindowHandles().size();
//		System.out.println("Initial window count: " + driver.getWindowHandles().size());
//		
//        Thread.sleep(2000);
//		
//		//Find Site List link and click on it
//		driver.findElement(By.partialLinkText("Site List")).click();
//		
//		Thread.sleep(1000);
//		
//		//Find Next Page button and click on it
//		driver.findElement(By.xpath(".//*[@id='content-body']/div[2]/site-list-view/div/div[2]/button[2]")).click();
//		
//		Thread.sleep(2000);
//								
//		System.out.println("Link URL: " + 
//		driver.findElement(By.partialLinkText("Arby's 30")).getAttribute("href"));
//				
//		//Find the link for site name and click
//		driver.findElement(By.partialLinkText(sitename)).click();
//		
//		//to get the window count after clicking on Arby's 30
//		System.out.println("Window count after " + sitename + ": " + driver.getWindowHandles().size());
//		
//        Iterator<String> whs = driver.getWindowHandles().iterator();
//		
//		String mainWin = whs.next();
//		String detailViewWin = whs.next();
//		//String Publix30 = whs.next();
//		
//		
//		driver.switchTo().window(detailViewWin);
//
//		return new DefaultLoadingPage(driver);
//	}
//	

	
}
