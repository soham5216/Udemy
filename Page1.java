package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	
	
	public WebDriver driver;

   
    public Page1(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
		
		
		
	
	
	@FindBy(xpath="//a[1]")
	WebElement login;
	
	/*
	 * public WebElement login() { return login; }
	 */

	/*
	 * public void setLogin(WebElement login) { this.login = login; }
	 */





	@FindBy(xpath="//username")
	WebElement username;
}
