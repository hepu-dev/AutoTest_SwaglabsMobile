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

for (int i = 0; i < Total; i++) {
    if (i == 0) {
        Mobile.scrollToText(Item0, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Product/TextView - Products', [('text') : Item0]), 0)
    } else if (i == 1) {
        Mobile.scrollToText(Item1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Product/TextView - Products', [('text') : Item1]), 0)
    } else if (i == 2) {
        Mobile.scrollToText(Item2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Product/TextView - Products', [('text') : Item2]), 0)
    } else if (i == 3) {
        Mobile.scrollToText(Item3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Product/TextView - Products', [('text') : Item3]), 0)
    } else if (i == 4) {
        Mobile.scrollToText(Item4, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Product/TextView - Products', [('text') : Item4]), 0)
    } else if (i == 5) {
        Mobile.scrollToText(Item5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Product/TextView - Products', [('text') : Item5]), 0)
    }
    
    Mobile.scrollToText('ADD TO CART', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Product/TextView - ADD TO CART'), 0)

    Mobile.tap(findTestObject('Product/Button - BACK TO PRODUCTS'), 0)
}

Mobile.tap(findTestObject('Product/Image - Cart'), 0)

Mobile.scrollToText('CHECKOUT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Product/TextView - CHECKOUT'), 0)

