package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Businessfunctions extends Library{

	//public WebDriver driver;
	
	public static void action(WebDriver driver) {
		//action
				Actions action=new Actions(driver);
				WebElement element = driver.findElement(By.xpath("//a[1]"));
				action.click(element).build().perform();
	}
	public static void actionclick() {
		//action
				System.out.println("Clicked Gmail successfully");
	}
}
