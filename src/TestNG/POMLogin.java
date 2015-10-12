package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.TestHelper;
//import org.testng.annotations.Test;

//Non-TestNG Project

public class POMLogin {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		  
		   
	      driver = new FirefoxDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("http://socialsofttesthb.com/");
	      driver.manage().window().maximize();
	      
	      //Use page Object library now
	      //Enter email address
	      TestHelper.emailAddress(driver).clear();
	      TestHelper.emailAddress(driver).sendKeys("amit@ravabe.com");
	      //Enter password
	      TestHelper.password(driver).clear();
	      TestHelper.password(driver).sendKeys("Amit1234");
	      //Select remember email address 
	      TestHelper.rememberEmail(driver).click();
	      
	      //Click on login button
	      TestHelper.login(driver).click();
	      //Explicit wait
	      WebDriverWait wait=new WebDriverWait(driver,10);
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myModal']/div[2]/div/div[1]")));
	      driver.close();
	      }
}
