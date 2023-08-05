package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	@FindBy (xpath="//h1[@itemprop='name']")
	private WebElement productTitle;

	@FindBy (xpath="//button[@id='buy']")
	private WebElement buyNowButton;
	
    @FindBy	(xpath="//button[@id='add_cart']")
	private WebElement addToCart;

	
	public ProductDetailPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getProductTitle() {
		String title=productTitle.getText();
		return title;
	}
	
	public void clickonbuyNowButton(){
		buyNowButton.click();
	}
	
	public void clickonaddToCart(){
		addToCart.click();
	}
	public String getTextAddtoCart() {
		String text=addToCart.getText();
		return text;
	}
	
	
}
