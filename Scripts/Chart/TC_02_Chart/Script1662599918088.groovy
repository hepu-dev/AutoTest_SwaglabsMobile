import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/TC_01_Login'), [('username') : 'standard_user', ('password') : 'secret_sauce'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/chart/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/chart/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/chart/android.widget.TextView - CHECKOUT'), 0)

Mobile.setText(findTestObject('Object Repository/chart/android.widget.EditText - First Name'), 'heru', 0)

Mobile.setText(findTestObject('Object Repository/chart/android.widget.EditText - Last Name'), 'pur', 0)

Mobile.setText(findTestObject('chart/android.widget.EditText - ZipPostal Code'), '42210', 0)

Mobile.tap(findTestObject('Object Repository/chart/android.widget.TextView - CONTINUE'), 0)

