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

WebUI.click(findTestObject('Object Repository/PLP/Page_Office Depot Mexico  Compra en lnea Ar_97767d/PLP_p_Laptops'))

WebUI.verifyElementText(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_div_Marca'), 'Marca')

WebUI.verifyElementText(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_div_Procesador'), 'Procesador')

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/label_Ms relevante                         _d358f7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/img_grid_lazy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_grid_select-heart-od anony-heart-od'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Product_1_span_SKU'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/h2_Laptop Asus Vivobook 15 Intel Core i5 8G_c3f615'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Product_1_Descount_Price'), 0)

WebUI.closeBrowser()

