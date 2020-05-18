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

public class TC_114{


	WebDriver driver = DriverFactory.getWebDriver()

	KeywordLogger log = new KeywordLogger()

	@Keyword


	def VerifyTaskFiltersInListPage_Deliverable_Projects() {





		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()

		driver.findElement(By.xpath("//*[@id='entitylist']/li[5]/a")).click()

		// Choose Progress Status

		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Project'])[2]"))

		Select select = new Select(dropdown)

		java.util.List<WebElement> options = select.getOptions()

		for(WebElement item:options)
		{


			String s = item.getText()

			log.logInfo("Choose Projects  ---" + s)

			log.logInfo("-----------------" )
		}

	}



	@Keyword

	def VerifyTheFiltersInListPage_Deliverables_Release()
	{


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()



		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Release'])[2]"))

		Select select = new Select(dropdown)

		java.util.List<WebElement> options = select.getOptions()

		for(WebElement item:options)
		{

			String s = item.getText()

			log.logInfo("Choose Release ---" + s)

			log.logInfo("-----------------" )
		}

	}

	@Keyword

	def VerifyTheFiltersInListPage_Status()

	{


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Progress Status'])[2]"))

		Select select = new Select(dropdown)

		java.util.List<WebElement> options = select.getOptions()

		for(WebElement item:options)
		{

			String s = item.getText()

			log.logInfo("Choose Progress Status ---" + s)

			log.logInfo("-----------------" )
		}

	}






















}
