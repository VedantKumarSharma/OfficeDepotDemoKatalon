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

// ---------- Random Generator ----------
Random random = new Random()

// Generate 3-digit number (100–999)
int unique3Digit = random.nextInt(900) + 100

// ---------- Name ----------
GlobalVariable.name = ('sam María ' + unique3Digit)

// ---------- Email ----------
//int twoDigit = random.nextInt(90) + 10 // 10–99
GlobalVariable.email = (('saddepalli+' + unique3Digit) + '@kognivera.com')

// ---------- Logging ----------
println('Name        : ' + GlobalVariable.name)

println('Email       : ' + GlobalVariable.email)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/a_Iniciasesin'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/a_Crear cuenta'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Crear cuenta_firstNameMaterial'), 
    GlobalVariable.FirstName)

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'), 
    GlobalVariable.LastName)

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/label_Apellido materno'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_lastNameMaterial'), 
    'kumar')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_phoneMaterial'), 
    '9238457934')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Mnimo 10 dgitos_emailMaterial'), 
    GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_pas_e12d55'), 
    'cvW8qx4B2o3J/qo+fRAOjg==')

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/span_trminos y condiciones de Office Depot__ac3903'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Ingresar  Office Depot Mexico/button_Crear cuenta'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_vedant'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_vedant'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/p_Laptops'))

WebUI.verifyElementPresent(findTestObject('Direct/Page_Laptops  Office Depot Mexico/div_Marca'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Laptops  Office Depot Mexico/h1_Laptops'), 0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptops  Office Depot Mexico/span_ACER_facet__list__mark'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_ACER Laptops  Office Depot Mexico/div_SKU 100249188                          _b8c416'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_ACER Laptops  Office Depot Mexico/h2_Laptop Acer Aspire Lite 15 Intel Core i5_2d68e9'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/h1_Laptop Acer Aspire Lite 15 Intel Core i5_772c05'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/div_'))

not_run: WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/div_SKU_container-img-2022'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/div_(document).ready(function()            _a4dbaa'), 
    0)

not_run: WebUI.rightClick(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/h2_Descripcin y caractersticas'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/h2_Descripcin y caractersticas_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Acer Aspire Lite 15 Intel Core _f04cbb/span_Blog_imgFavs'))

not_run: WebUI.verifyElementNotVisible(findTestObject('Object Repository/Direct/Page_Shopping Lists  Office Depot Mexico/div_Guarda tus productos favoritos Nosotros_25db94'))

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Shopping Lists  Office Depot Mexico/span_Guarda tus productos favoritos'), 
    'Guarda tus productos favoritos')

WebUI.setText(findTestObject('New Dynamic Objects/SearchBar'), 'laptop')

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Shopping Lists  Office Depot Mexico/div_Laptop Gamer Asus TUF F16 NVIDIA GeForc_3e3469'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Shopping Lists  Office Depot Mexico/div_Laptop Gamer Asus TUF F16 NVIDIA GeForc_3e3469'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/div_SKU_select-heart-od'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/span_Favoritos'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Shopping Lists  Office Depot Mexico/div_PRECIOESPECIALLaptop Gamer Asus TUF F16_9aa377'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Shopping Lists  Office Depot Mexico/a_Laptop Gamer Asus TUF F16 NVIDIA GeForce _d8ccf8'), 
    0)

WebUI.click(findTestObject('New Dynamic Objects/Product1name'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/button_Aadir al carrito'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/button_Aadir proteccin'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/span_1'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/span_1'), 
    '1')

WebUI.click(findTestObject('Object Repository/Direct/Page_Laptop Gamer Asus TUF F16 NVIDIA GeFor_90e335/div_1 Mis productos30,947.65'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Mi Carrito  Office Depot Mexico/div_Laptop Gamer Asus TUF F16 NVIDIA GeForc_ded5b1'), 
    0)

WebUI.click(findTestObject('Object Repository/Direct/Page_Mi Carrito  Office Depot Mexico/div_30,947.65'))

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Mi Carrito  Office Depot Mexico/div_30,947.65'), '$30,947.65')

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Mi Carrito  Office Depot Mexico/div_30,947.65_1'), 
    '$30,947.65')

WebUI.click(findTestObject('Object Repository/Direct/Page_Mi Carrito  Office Depot Mexico/a_Proceder al pago'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/span_Fecha de nacimiento (ddmmaaaa)'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input_Fecha de nacimiento (ddmmaaaa)_input-_e8c017'), 
    '02/04/2000')

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/input__streetName'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input__postalcode'), '64000')

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Express Checkout/select_MONTERREY CENTROLA FINCAOtra Colonia'), 
    0)

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input__streetName'), 'St maxtest')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input__streetNumber'), '980')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input_Nmero interno_address.interiorNo'), 'A1')

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input_(ej. departamento 3 edificio A, puert_f49e7a'), 
    'near teator')

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/label_Entre que calles se encuentra tu domicilio'))

WebUI.setText(findTestObject('Object Repository/Direct/Page_Express Checkout/input__betweenStreet2'), 'Monterrey centro')

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/input_Verifica tu ubicacin_saveAddressInMyA_91c621'))

WebUI.enhancedClick(findTestObject('Object Repository/Direct/Page_Express Checkout/button_Continuar con el pago'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/button_Continuar (1)'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/input_Pago con Tarjeta Dbito Crdito_paypos'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Express Checkout/button_Finalizar mi compra'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Direct/Page_Pagina de Confirmacin  Office Depot Mexico/div_Muchas gracias por tu compra'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Pagina de Confirmacin  Office Depot Mexico/span_por tu compra'), 
    'por tu compra!')

WebUI.verifyElementText(findTestObject('Object Repository/Direct/Page_Pagina de Confirmacin  Office Depot Mexico/span_confirmada con xito'), 
    'confirmada con éxito')

WebUI.getText(findTestObject('Direct/Page_Pagina de Confirmacin  Office Depot Mexico/div_1697493606', [('variable') : 'order_id']), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Direct/Page_Pagina de Confirmacin  Office Depot Mexico/span_Entrega estimada el 25042026', 
        [('variable') : 'Order_Date']), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Direct/Page_Pagina de Confirmacin  Office Depot Mexico/img'))

WebUI.mouseOver(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/div_Hola,'))

WebUI.click(findTestObject('Object Repository/Direct/Page_Office Depot Mexico  Compra en lnea Ar_97767d/span_Mis Pedidos'))

WebUI.verifyMatch('order_id', 'order_id', false)

WebUI.click(findTestObject('Object Repository/Direct/Page_Historial de rdenes  Office Depot Mexico/a_Ver detalle'))

WebUI.verifyMatch('Order_Date', 'Order_Date', false)

WebUI.closeBrowser()

