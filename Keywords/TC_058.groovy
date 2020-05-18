package home

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement



import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

public class TC_058 {
	
	
	
	WebDriver driver = DriverFactory.getWebDriver()

	KeywordLogger log = new KeywordLogger()

        @Keyword
		
		def verifyTheMandatryTextInTheAddLink()
		{
			
		
	
		driver.findElement(By.xpath("//*[@id='tblEntityinstance']/tbody/tr[2]/td[14]/center/ul/li/a[2]/i")).click()
		
		 driver.findElement(By.xpath("//*[@title='Add Link']")).click()
		 
		 driver.findElement(By.id("btn_savelinkadd")).click()
	
		 
	String LinkName = driver.findElement(By.id("err-lnknam")).getText()
		 
	log.logInfo(LinkName)
	
	String Linkurl = driver.findElement(By.id("err-lnkurl")).getText()
	
      log.logInfo(Linkurl)
		 
	
	  
	
	
	}
	
	
}
