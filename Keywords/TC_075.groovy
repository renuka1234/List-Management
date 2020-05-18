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
import org.openqa.selenium.WebElement

import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

public class TC_075 {

	@Keyword

	def VerifyTaskFiltersInListPage_Task() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()

		// Choose Progress Status

		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Task Type'])[2]"))

		Select select = new Select(dropdown)

		select.selectByVisibleText("Adhoc")

		Thread.sleep(2000)

		WebUI.refresh()



		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}



	@Keyword

	def VerifyTheFiltersInListPage_ProgressStatus() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()



		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Progress Status'])[2]"))

		Select select = new Select(dropdown)



		select.selectByVisibleText("In Progress")

		Thread.sleep(2000)

		WebUI.refresh()

		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}

	@Keyword

	def VerifyTheFiltersInListPage_Prority() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Priority'])[2]"))

		Select select = new Select(dropdown)


		select.selectByVisibleText("A")

		Thread.sleep(2000)

		WebUI.refresh()

		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}





	@Keyword

	def VerifyTheFiltersInListPage_Milestone() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Milestone'])[2]"))

		Select select = new Select(dropdown)

		select.selectByVisibleText("A")

		Thread.sleep(2000)

		WebUI.refresh()

		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}



	@Keyword

	def VerifyTheFiltersInListPage_Release() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Release'])[2]"))

		Select select = new Select(dropdown)

		select.selectByVisibleText("M1")

		Thread.sleep(2000)

		WebUI.refresh()

		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}


	@Keyword

	def VerifyTheFiltersInListPage_Owner() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Owner'])[2]"))

		Select select = new Select(dropdown)

		select.selectByVisibleText("Admin")

		Thread.sleep(2000)

		WebUI.refresh()

		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}

	@Keyword

	def VerifyTheFiltersInListPage_Sprint() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose SprintVersion'])[2]"))

		Select select = new Select(dropdown)



		select.selectByVisibleText("W1")

		Thread.sleep(2000)

		WebUI.refresh()


		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}

	@Keyword

	def VerifyTheFiltersInListPage_Chunk() {


		WebDriver driver = DriverFactory.getWebDriver()

		KeywordLogger log = new KeywordLogger()


		WebElement dropdown = driver.findElement(By.xpath("(//*[@title='Choose Chunk'])[2]"))
		Select select = new Select(dropdown)



		select.selectByVisibleText("Admin")

		Thread.sleep(2000)

		WebUI.refresh()

		driver.findElement(By.xpath("//*[@title='Show Associated Entities']")).click()

		Thread.sleep(2000)
	}
}
