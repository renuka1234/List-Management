package home

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver

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
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys

import org.openqa.selenium.WebElement



import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


public class TC_125 {


	WebDriver driver = DriverFactory.getWebDriver()

	KeywordLogger log = new KeywordLogger()

	@Keyword


	def VerifyTheTaskPage_VGroup() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()

		Thread.sleep(5000)

		driver.findElement(By.xpath("//*[@id='entitylist']/li[6]/a")).click()

		Thread.sleep(3000)

		driver.findElement(By.xpath("//*[@id='action-container']/a")).click()

		driver.findElement(By.id("groupby-initilizer")).click()


		WebElement dropdown = driver.findElement(By.id("sltentitygroupby"))

		Select select = new Select(dropdown)

		java.util.List<WebElement> options = select.getOptions()

		for(WebElement item:options) {

			String s = item.getText()

			log.logInfo("Choose VGroup  ---" + s)

			log.logInfo("-----------------" )
		}
	}

	@Keyword


	def VerifyTheTaskPage_HGroup() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.id("sltentityhgroupby"))

		Select select = new Select(dropdown)

		java.util.List<WebElement> options = select.getOptions()

		for(WebElement item:options) {

			String s = item.getText()

			log.logInfo("Choose HGroup  ---" + s)

			log.logInfo("-----------------" )
		}
	}
}
