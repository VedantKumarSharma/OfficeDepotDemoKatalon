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

WebUI.click(findTestObject('Object Repository/Login/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.click(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/button_Iniciar sesin'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/div_Este campo es obligatorio'), 
    'Este campo es obligatorio')

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/div_Este campo es obligatorio_1'), 
    'Este campo es obligatorio')

WebUI.setText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/input_Iniciar sesin_usernamelogin'), 
    'skthakur@')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_j_p_38a518'), 
    'aBgYur6dCakNMhXbRXeWHg==')

WebUI.click(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/span__view-password'))

WebUI.click(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/button_Iniciar sesin'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/div_Por favor ingresa un correo vlido'), 
    'Por favor ingresa un correo válido')

WebUI.closeBrowser()

