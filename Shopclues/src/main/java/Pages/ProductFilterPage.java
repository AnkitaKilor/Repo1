package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductFilterPage {

	
	@FindBy(xpath="(//a[@class='toggle_arrow'])[3]")
	private WebElement priceFilterArrowButton;
	
	@FindBy(xpath="//label[@for='Rs. 1000 - Rs. 1499']")
	private WebElement priceFilter1000;
	
	@FindBy(xpath="//label[@for='Snexian']")
	private WebElement brandfilter;

	@FindBy(xpath="//a[@pid='152991112']")
	private WebElement nokia105ss;
	
	public ProductFilterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonpriceFilterArrowButton() {
		priceFilterArrowButton.click();
	}
	
	public boolean checkpriceFilter1000isDisplayed() {
		
		boolean r=priceFilter1000.isDisplayed();
	    return r;
	}
	
	public void clickonbrandfilter() {
		brandfilter.click();
	}
	
	public void clickonnokia105ss() {
		nokia105ss.click();
		
		
	}
}
