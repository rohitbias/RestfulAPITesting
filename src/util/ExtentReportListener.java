package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportListener {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void test(){
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/Report.html");
	// Create an object of Extent Reports
extent = new ExtentReports();  
extent.attachReporter(htmlReporter);
extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
	extent.setSystemInfo("Environment", "Production");
extent.setSystemInfo("User Name", "Rajkumar SM");
htmlReporter.config().setDocumentTitle("Title of the Report Comes here "); 
        // Name of the report
htmlReporter.config().setReportName("Name of the Report Comes here "); 
        // Dark Theme
	}
	

}
