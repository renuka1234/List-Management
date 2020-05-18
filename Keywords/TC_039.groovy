package home

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebElement
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory



public class TC_039
 {
	
	WebDriver driver = DriverFactory.getWebDriver()
	KeywordLogger log = new KeywordLogger()
	
		@Keyword
	
	
	def VerifyTheAddBookmarkInBookmarkPAge()
	{
		
		Thread.sleep(2000)
		
		driver.findElement(By.xpath("//*[@id='innerscroll']/div[1]/div[1]/div/div/div[2]/div/ul/li[5]/a/span")).click()
			
		List<WebElement> drop = driver.findElements(By.xpath("//*[@id='tblEntityinstance_body']/tbody/tr[2]/td[2]/span"))
		
		java.util.Iterator<WebElement> i = drop.iterator()
		
		while(i.hasNext()) 
		{
			WebElement row = i.next()
			
			String s =row.getText()
			
		
			
			log.logInfo(s)
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

