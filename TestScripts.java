package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestScripts implements Animal{
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\drivers\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	// Businessfunctions businessfunctions=new Businessfunctions();
	driver.get("https://www.google.com");
	//driver.manage().window().maximize();
	 Businessfunctions.maximizescreen(driver);
	Thread.sleep(5000);
	//driver.findElements(By.cssSelector(""));
	// Java

	//WebElement ele = driver.findElement(RelativeLocator.with(By.xpath("//*[@value='Google Search']")).below(By.xpath("//a[1]")));
	WebElement ele = driver.findElement(RelativeLocator.with(By.tagName("")));
	System.out.println(ele.getText());
	ele.click();
	Thread.sleep(5000);
	
	//Page1 page=new Page1(driver);
	//page.login.click();
	
	
	
	  Businessfunctions.action(driver);
	  
	  Businessfunctions.actionclick();
	 TestScripts ts=new TestScripts();
	 ts.animalSound();
	 ts.sleep();
	 
	 
	
	
	driver.close();
	// interface
	/*
	 * interface Animal { public void animalSound(); // interface method (does not
	 * have a body) public void sleep(); // interface method (does not have a body)
	 * }
	 * 
	 * // Pig "implements" the Animal interface class Pig implements Animal { public
	 * void animalSound() { // The body of animalSound() is provided here
	 * System.out.println("The pig says: wee wee"); } public void sleep() { // The
	 * body of sleep() is provided here System.out.println("Zzz"); } }
	 * 
	 * class MyMainClass { public static void main(String[] args) { Pig myPig = new
	 * Pig(); // Create a Pig object myPig.animalSound(); myPig.sleep(); } }
	 */
	
	}
	
	public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	
	
}
