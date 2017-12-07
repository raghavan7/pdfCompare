package pdfDownload;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class download {

	// Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
	 WebDriver driver1,driver2,driver3;
	 
	@BeforeSuite
	public void webdriverStart() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
        driver1 = new ChromeDriver(options);
        driver2 = new ChromeDriver(options);
        driver3 = new ChromeDriver(options);
        driver1.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
        driver2.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
        driver3.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	}
	
	@Test(testName = "pdf1")
	public void startTest1() {
	        
	        
	        Date date = new Date();
	        String date1 = dateFormat.format(date);
	        System.out.println(date1);
	        driver1.findElement(By.linkText("Click")).click();
	        
	}
	
	@Test(testName = "pdf2")
	public void startTest2() {
		

	        
	        Date date = new Date();
	        String date1 = dateFormat.format(date);
	        System.out.println(date1);
	        driver2.findElement(By.linkText("Click")).click();
	}
	
	@Test(testName = "pdf3")
	public void startTest3() {
	
	        
	        
	        Date date = new Date();
	        String date1 = dateFormat.format(date);
	        System.out.println(date1);
	        driver3.findElement(By.linkText("Click")).click();
	}
	
	/*@Test(testName = "pdf4")
	public void startTest4() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver4 = new ChromeDriver(options);
	        
	        driver4.manage().window().maximize();
	        driver4.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}
	
	@Test(testName = "pdf5")
	public void startTest5() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver5 = new ChromeDriver(options);
	        
	        driver5.manage().window().maximize();
	        driver5.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}
	
	/*@Test(testName = "pdf6")
	public void startTest6() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver6 = new ChromeDriver(options);
	        
	        driver6.manage().window().maximize();
	        driver6.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}
	
	@Test(testName = "pdf7")
	public void startTest7() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver7 = new ChromeDriver(options);
	        
	        driver7.manage().window().maximize();
	        driver7.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}
	
	@Test(testName = "pdf8")
	public void startTest8() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver8 = new ChromeDriver(options);
	        
	        driver8.manage().window().maximize();
	        driver8.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}
	
	@Test(testName = "pdf9")
	public void startTest9() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver9 = new ChromeDriver(options);
	        
	        driver9.manage().window().maximize();
	        driver9.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}
	
	@Test(testName = "pdf10")
	public void startTest10() {
		
		 	ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver32.exe");
	        WebDriver driver10 = new ChromeDriver(options);
	        
	        driver10.manage().window().maximize();
	        driver10.navigate().to("http://www.sample-videos.com/download-sample-pdf.php");
	        
	}*/
	
}
