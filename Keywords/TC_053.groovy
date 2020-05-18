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
import org.junit.After
import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

public class TC_053 {

	WebDriver driver = DriverFactory.getWebDriver()

	//KeywordLogger log = new KeywordLogger()
	
	
	@Keyword
	
	
	def verifytheTableEditIntheProjectPage()
{
		
	
	
	
	
	for(int i=2;i<=3;i++) {
		
		
					driver.findElement(By.xpath("//*[@id='tblEntityinstance']/tbody/tr["+i+"]/td[2]/center/input")).click()
				}

	driver.findElement(By.id("btnRequestMultiEdit")).click()
	
	
	driver.findElement(By.xpath("(//*[@type='text'])[12]")).sendKeys('Adhoc new 1')
	 
	 
			 Select ProgressStatus = new Select(driver.findElement(By.xpath("//*[@data-attributename='ProgressStatus']")))
	 
			 ProgressStatus.selectByVisibleText("In Progress")
	 
			 Select ProjectType = new Select(driver.findElement(By.xpath("//*[@data-attributename='ProjectType']")))
	 
			 ProjectType.selectByVisibleText("Adhoc")
	 
			 Select ProjectPriority = new Select(driver.findElement(By.xpath("//*[@data-attributename='Priority']")))
	 
			 ProjectPriority.selectByVisibleText("A")
			 Select ProjectOwner = new Select(driver.findElement(By.xpath("//*[@data-attributename='Owner']")))
	 
			 ProjectOwner.selectByVisibleText("Pradeep S")
	 
	 
			 driver.findElement(By.id("btnsubmit_Update")).click()
	 
			 Thread.sleep(3000)
	
	

}




}
