package TestPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CustomerAdr;
import Pages.HomePage;
import Pages.ProductDetailPage;
import Pages.ProductFilterPage;
import Pages.ReviewCart;

public class VerifyBuyNowFunctionality {
	WebDriver driver;
	HomePage homePage;
	ProductFilterPage productFilterPage;
	ProductDetailPage productDetailPage;
	ReviewCart reviewCart;
	CustomerAdr customerAdr;
	ArrayList<String> alladr;
	@BeforeTest
	public void openBrowser() {
	}
	
    @BeforeClass
	public void createPOMobject() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    homePage= new HomePage(driver);
		productFilterPage = new  ProductFilterPage(driver);
		productDetailPage = new  ProductDetailPage(driver);
		reviewCart = new ReviewCart(driver);
		customerAdr = new CustomerAdr(driver);
	}
	@BeforeMethod
	public void launchApplication() throws InterruptedException {
		
		driver.get("https://www.shopclues.com/");
		Thread.sleep(9000);
		homePage.clickonMobileAndMore();
		ArrayList<String> alladr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(alladr.get(1));
		Thread.sleep(4000);
		productFilterPage.clickonbrandfilter();
		Thread.sleep(3000);
		
	}
	@Test
	public void verifyProductTitle() throws InterruptedException
	{
		productFilterPage.clickonnokia105ss();
		driver.switchTo().window(alladr.get(2));
		Thread.sleep(3000);
		String actTitle=productDetailPage.getProductTitle();
		String exptTitle="Nokia 105 SS 2021(Black)";
		Assert.assertEquals(actTitle, exptTitle);
		
	}
	@Test
	public void verifyAddToCartButton() throws InterruptedException 
	{
		productFilterPage.clickonnokia105ss();
		driver.switchTo().window(alladr.get(2));
		Thread.sleep(3000);
	    productDetailPage.clickonaddToCart();
	    String act=productDetailPage.getTextAddtoCart();
	    String exp="Add To Cart";
	    Assert.assertEquals(act, exp);
	}
	@Test
	public void verifyBuyNowButton() throws InterruptedException
	{
		productFilterPage.clickonnokia105ss();
		driver.switchTo().window(alladr.get(2));
		Thread.sleep(3000);
		productDetailPage.clickonbuyNowButton();
		reviewCart.enterMailID();
		reviewCart.clickoncontinuewithoutPass();
		customerAdr.enterpin();
		customerAdr.entercity();
		customerAdr.enterphonenum();
		customerAdr.entername();
		customerAdr.enterplotno();
		customerAdr.enterlandmark();
		customerAdr.entersaveAndContinue();
		
	}
	@AfterMethod
	public void logoutFromApplication(){
		
	}
	@AfterClass
	public void clearObject() {
		 homePage=null;
		 productFilterPage= null;
		 productDetailPage=null;
		 reviewCart=null;
		 customerAdr=null;
	}
	@AfterTest()
	public void closedBrowser() {
		driver.quit();
		driver = null ;
		System.gc(); 
	}
	
}
