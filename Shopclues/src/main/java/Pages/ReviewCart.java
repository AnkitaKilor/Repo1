package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewCart {
	
	@FindBy (xpath="//input[@id='main_user_login']")
	private WebElement enterMail;
	
    @FindBy(xpath="//a[text()='Continue without Password']")
	private WebElement continuewithoutPass;
    
    public ReviewCart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
    public void enterMailID(){
    	enterMail.sendKeys("chinamobile@gmail.com");
	}
    
    public void clickoncontinuewithoutPass(){
    	continuewithoutPass.click();
	}

}
