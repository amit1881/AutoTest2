package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.TestHelper;

public class TestPOM1 {
	private static WebDriver driver = null;
  
	@Test
  public void POM() {
		  driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("http://www.calculator.net");
	      driver.manage().window().maximize();
	      //Use page Object library now
	      TestHelper.lnk_math_calc(driver).click();		
	      TestHelper.lnk_percent_calc(driver).click();
	      
	      TestHelper.txt_num_1(driver).clear();
	      TestHelper.txt_num_1(driver).sendKeys("10");      
	  	   
	      TestHelper.txt_num_2(driver).clear();
	      TestHelper.txt_num_2(driver).sendKeys("50");  
	  	   
	      TestHelper.btn_calc(driver).click();
	      String result =  TestHelper.web_result(driver).getText();
	      
	      if(result.equals("5")){      
	         System.out.println(" The Result is Pass");
	         }
	      else {
	         System.out.println(" The Result is Fail");
	         
	         }
	      driver.close();	
  }
}
