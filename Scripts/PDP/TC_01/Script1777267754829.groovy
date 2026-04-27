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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/input_Agrega tu ubicacin para mejorar la ex_080146'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/img'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Celulares  Office Depot Mexico/a_SKU 100278763                            _5d5044'))

WebUI.verifyElementText(findTestObject('PDP/ProductName_PDP'), 'Apple iPhone 17 Pro Max 256GB 12GB RAM Azul Profundo')

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Celulares  Office Depot Mexico/PDP_SKUcode'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Celulares  Office Depot Mexico/PDP_SKUcode'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Celulares  Office Depot Mexico/PDP_DiscountPrice'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Celulares  Office Depot Mexico/PDP_img'))

WebUI.verifyElementText(findTestObject('PDP/ProductName_PDP'), 'Apple iPhone 17 Pro Max 256GB 12GB RAM Azul Profundo')

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/PDP_DiscountPrice'), 
    '$29,999.00')

WebUI.verifyElementText(findTestObject('PDP/PDP_description'), 'Descripción y características')

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/div_Artculos similares'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/div_Mtodos de pago                         _3b9e59'))

WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/div_EVALA ESTE PRODUCTO'))

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/div_EVALA ESTE PRODUCTO'), 
    'EVALÚA ESTE PRODUCTO')

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/img'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/ol_CategoraCategora,CategoraCategoraofficed_ef444a'))

WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/ol_CategoraCategora,CategoraCategoraofficed_ef444a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/ol_CategoraCategora,CategoraCategoraofficed_ef444a'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/span_Hasta'))

WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/span_Hasta'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Apple iPhone 17 Pro Max 256GB 12GB RAM_456143/ol_CategoraCategora,CategoraCategoraofficed_ef444a'), 
    0)

WebUI.closeBrowser()

