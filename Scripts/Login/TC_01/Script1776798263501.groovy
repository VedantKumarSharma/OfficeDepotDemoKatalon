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

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/a_Iniciasesin'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/a_Crear cuenta'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Crear cuenta_firstNameMaterial'), 
    'vedant')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'), 
    'sharma')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_lastNameMaterial'), 
    '')

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_lastNameMaterial'))

WebUI.doubleClick(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Crear cuenta_firstNameMaterial'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Crear cuenta_firstNameMaterial'), 
    'ABC')

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'))

WebUI.doubleClick(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'), 
    'xyz')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_lastNameMaterial'), 
    'jkl')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_phoneMaterial'), 
    '1092830192')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 10 dgitos_emailMaterial'), 
    'aksjdh7@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_pas_e12d55'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/label_Contrasea'))

WebUI.setEncryptedText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_pas_e12d55'), 
    'Bclyd91aUwEHkFPmP+6v9w==')

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/span_trminos y condiciones de Office Depot__ac3903'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/button_Crear cuenta'))

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_ABC'), 
    'ABC')

