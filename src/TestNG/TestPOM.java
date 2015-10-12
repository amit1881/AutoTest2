package TestNG;

import org.openqa.selenium.*;
import utility.TestHelper;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

//Non-TestNG Project

public class TestPOM {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		  
		   
	      driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("http://www.calculator.net");
	  
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
