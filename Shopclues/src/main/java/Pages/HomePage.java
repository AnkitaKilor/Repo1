package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy (xpath="//a[text()='Mobiles & More']")
	private WebElement mobileAndMore;
	
	@FindBy(xpath="(//a[text()='Nokia'])")
	private WebElement nokiaMobile;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public  void clickonMobileAndMore() throws InterruptedException{
		Actions act= new Actions(driver);
		act.moveToElement(mobileAndMore).perform();
		Thread.sleep(4000);
		act.moveToElement(nokiaMobile).perform();
		Thread.sleep(3000);
		act.click().perform();
	
	}
	
	
	
	
	
	


}
