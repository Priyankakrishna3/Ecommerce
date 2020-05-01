package TestScipts;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.AmazonHomePage;
import generic.CommonConfigurations;

public class PriceCompareTest extends CommonConfigurations {
		@Test
		public void comparePrice() throws IOException 
		{
			AmazonHomePage ah=new AmazonHomePage(driver);
			ah.searchItem();
			
			
			
		}

}
