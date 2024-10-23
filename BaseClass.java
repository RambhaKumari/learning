package testCases;
import org.testng.annotations.Parameters;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass {

	public WebDriver driver; // Declare WebDriver here so it's accessible in child classes
    public Properties p;
@BeforeClass(groups= {"Sanity","Regression"})
@Parameters({"os","browser"})
public void setup(String os, String br) throws IOException
{
	//Loading config.properties file
	FileReader file=new FileReader("./src//test//resources//config.properties");
	p=new Properties();
	p.load(file);
	
	switch(br.toLowerCase()) 
	{
	case "chrome" : driver=new ChromeDriver(); break;
	case "edge" : driver=new EdgeDriver(); break;
	default : System.out.println("Invalid browser name"); return;
	}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get(p.getProperty("appurl")); //reading url from config.properties file
	
	driver.manage().window().maximize();
}
@AfterClass(groups= {"Sanity","Regression"})   
public void tearDown()
{
	if (driver != null) {
	   driver.quit();
	}
}
}
