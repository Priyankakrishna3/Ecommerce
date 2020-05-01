package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.CommonUtils;

public class AmazonHomePage {
	@FindBy(id="twotabsearchtextbox") private WebElement searchbox;
	public AmazonHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
		
	}
	CommonUtils u=new CommonUtils();

	public void  searchItem() throws IOException
	{
		searchbox.sendKeys(u.getDataFromProperties("item"),Keys.ENTER);
		
	}


}
