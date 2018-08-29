import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.10.106:8036/Enroll')

WebUI.click(findTestObject('Object Repository/Page_- Wellness App/input_Activities8.SelectedActi (1)'))

WebUI.click(findTestObject('Page_- Wellness App/a_OK'))

WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/span_Dates'), ' Dates')

WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/span_Event'), ' Event')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Halloween 5K - Pecan Grove'), 'Halloween 5K - Pecan Grove Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Jingle Bell 5K - Community'), 'Jingle Bell 5K - Community Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Resolutions 5K - Community'), 'Resolutions 5K - Community Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Cupid 5K - Community Park'), 'Cupid 5K - Community Park')
//WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_St. Paddys Day 5K - Communi'), 'St. Paddy's Day 5K - Community Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Memorial Day 5K - Community'), 'Memorial Day 5K - Community Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Firecracker 5K - Community'), 'Firecracker 5K - Community Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_Inferno 5K - Community Park'), 'Inferno 5K - Community Park')
WebUI.verifyElementText(findTestObject('Object Repository/Page_- Wellness App/td_External 5K'), 'External 5K')




WebUI.closeBrowser()

