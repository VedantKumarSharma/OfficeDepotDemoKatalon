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
import com.email.utils.ShareEmail as ShareEmail

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Login/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/input_Iniciar sesin_usernamelogin'), 
    GlobalVariable.Login_Email)

WebUI.setText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_j_p_38a518'), 
    GlobalVariable.Login_Password)

WebUI.click(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/label_Contrasea'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/h1_Iniciar sesin'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/label_Correo electrnico'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/label_Contrasea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/a_Olvidaste tu contrasea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/a_Crear cuenta'), 
    0)

WebUI.click(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/span__view-password'))

WebUI.getText(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_j_p_38a518'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch('Password', 'Password', false)

WebUI.click(findTestObject('Object Repository/Login/Page_Ingresar  Office Depot Mexico/button_Iniciar sesin'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_Shubham Kumar'), 
    'Shubham Kumar')

