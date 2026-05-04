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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import com.email.utils.ShareEmail as ShareEmail

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Careate Account/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.click(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/a_Crear cuenta'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/h1_Crear cuenta'), 
    0)

WebUI.setText(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Crear cuenta_firstNameMaterial'), 
    GlobalVariable.CreateAccount_First_Name)

WebUI.setText(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'), 
    GlobalVariable.CreateAccount_Middle_Name)

WebUI.setText(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_lastNameMaterial'), 
    GlobalVariable.CreateAccount_Last_Name)

WebUI.setText(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_phoneMaterial'), 
    GlobalVariable.CreateAccount_phone_Number)

def timestamp = new SimpleDateFormat('yyyyMMddHHmmss').format(new Date())

ShareEmail.email = "test$timestamp@gmail.com"

WebUI.setText(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Mnimo 10 dgitos_emailMaterial'), 
    ShareEmail.email)

WebUI.setText(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_pas_e12d55'), 
    GlobalVariable.CreateAccount_Password)

WebUI.click(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/span__view-password'))

WebUI.click(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_pas_e12d55'))

WebUI.click(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/span_trminos y condiciones de Office Depot__ac3903'))

WebUI.click(findTestObject('Object Repository/Careate Account/Page_Ingresar  Office Depot Mexico/button_Crear cuenta'))

WebUI.verifyElementText(findTestObject('Careate Account/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_Test'), 
    GlobalVariable.CreateAccount_First_Name)

WebUI.closeBrowser()

