package udemy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class SeleniumTestCases {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\drivers\\IEDriverServer.exe");  
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
		//window handles	
		String parent=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		for (String child:windows) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.switchTo().window(parent);
			}else {
				System.out.println("No child window found");
			}
		}
		// Open the current date and time
        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		
		//action
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[1]"));
		File srcfile=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\screenshot\\Selenium4TestImage"+timestamp+".png"));
		Thread.sleep(5000);
		action.click(element).build().perform();
		
		
		 //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot) driver);

        //Call getScreenshotAs method to create image file

               File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\screenshot\\TestImage"+timestamp+".png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

		
		
		
		//driver.close();
		
		
	}

}
