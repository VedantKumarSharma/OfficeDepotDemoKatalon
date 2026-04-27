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

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.setText(findTestObject('Object Repository/Search/Page_Office Depot Mexico  Compra en lnea Ar_97767d/input_Agrega tu ubicacin para mejorar la ex_080146'), 
    'Bingo')

WebUI.click(findTestObject('Object Repository/Search/Page_Office Depot Mexico  Compra en lnea Ar_97767d/button_Agrega tu ubicacin para mejorar la e_49fd67'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/img_www.officedepot.com.mx_imgerror'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/p_Te recomendamos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/p_Usar palabras ms simples'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/p_Revisar tu ortografa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/p_Navegar por las categoras para encontrar _a0ca3f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/p_Continuar comprando'), 
    0)

WebUI.click(findTestObject('Object Repository/Search/Page_Bingo  Office Depot Mexico/a_Continuar comprando'))

