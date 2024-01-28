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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=stripbooks-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'da vinci code')

WebUI.click(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=electronics-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/input_Search Amazon_field-keywords'), 
    'Mobile phones')

WebUI.click(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  da vinci code/input_Search Amazon_nav-search-submit-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  Mobile phones/select_Electronics        All Departments  _28d51a'), 
    'search-alias=aps', true)

WebUI.setText(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  Mobile phones/input_Search Amazon_field-keywords'), 
    'Washing Machines')

WebUI.click(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  Mobile phones/input_Search Amazon_nav-search-submit-button'))

WebUI.setText(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  Washing Machines/input_Search Amazon_field-keywords'), 
    'Wooden Tables')

WebUI.click(findTestObject('Object Repository/Amazon_ValidateSearchFieldItem_OR/Page_Amazon.com  Washing Machines/input_Search Amazon_nav-search-submit-button'))

WebUI.closeBrowser()

