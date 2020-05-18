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

public class TC_026 {


	@Keyword

	def VerifyAddProject() {

		KeywordLogger log = new KeywordLogger()

		WebDriver driver = DriverFactory.getWebDriver()

		driver.findElement(By.id("addentityinstanc")).click()


		//log.logInfo("Pop up is closed by clicking by close button")



		driver.findElement(By.xpath("(//*[@type='text'])[12]")).sendKeys('Adhoc new')


		Select ProgressStatus = new Select(driver.findElement(By.xpath("//*[@data-attributename='ProgressStatus']")))

		ProgressStatus.selectByVisibleText("In Progress")

		Select ProjectType = new Select(driver.findElement(By.xpath("//*[@data-attributename='ProjectType']")))

		ProjectType.selectByVisibleText("Adhoc")

		Select ProjectPriority = new Select(driver.findElement(By.xpath("//*[@data-attributename='Priority']")))

		ProjectPriority.selectByVisibleText("A")
		Select ProjectOwner = new Select(driver.findElement(By.xpath("//*[@data-attributename='Owner']")))

		ProjectOwner.selectByVisibleText("Pradeep S")


		driver.findElement(By.id("saveentityinstance")).click()

		Thread.sleep(3000)



	}
}
