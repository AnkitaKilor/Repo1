package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAdr {
	
	@FindBy(xpath="//input[@name='s_zipcode']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='s_city']")
	private WebElement city;

	@FindBy(xpath="//select[@class='cardOptions']")
	private WebElement state;

	@FindBy(xpath="//input[@id='s_firstname']")
	private WebElement name;

	@FindBy(xpath="//input[@id='s_phone']")
	private WebElement phonenum;

	@FindBy(xpath="//input[@name='s_address']")
	private WebElement plotNo;

	@FindBy(xpath="//input[@name='s_address_2']")
	private WebElement landmark;
	
	@FindBy(xpath="//input[@value='Save & Continue']")
	private WebElement saveAndContinue;
	
	public CustomerAdr (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin() {
		pincode.sendKeys("414001");
	}
	
	public void entercity() {
		city.sendKeys("nagpur");
	}
	
	public void entername() {
		name.sendKeys("pankaj");
	}
	
	public void enterphonenum() {
		phonenum.sendKeys("9890456321");
	}
	
	public void enterplotno() {
		plotNo.sendKeys("404");
	}
	
	public void enterlandmark() {
		landmark.sendKeys("MG Road");
	}
	
	public void entersaveAndContinue() {
		saveAndContinue.click();
	}

}
