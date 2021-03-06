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

public class TC_112 {


	WebDriver driver = DriverFactory.getWebDriver()

	KeywordLogger log = new KeywordLogger()


	@Keyword

	def VerifyAddTheDeliverableWithoutSavebutton() {

		Thread.sleep(2000)

		driver.findElement(By.xpath("//*[@id='entitylist']/li[5]/a")).click()

		Thread.sleep(2000)


		driver.findElement(By.xpath("//*[@id='action-container']/a")).click()

		driver.findElement(By.id("addentityinstanc")).click()

		driver.findElement(By.id("saveentityinstance")).click()


		String text  = driver.findElement(By.xpath("//*[@id='addentityinstancedetail']/div/div/div[2]/div/form/div/div[1]/div/span")).getText()

		log.logInfo(text)
	}
}
