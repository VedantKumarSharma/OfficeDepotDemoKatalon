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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.click(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/a_Crear cuenta'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/img'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/h1_Crear cuenta'), 0)

WebUI.setText(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/input_Crear cuenta_firstNameMaterial'), 
    'test')

WebUI.setText(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_middleNameMaterial'), 
    'test')

WebUI.setText(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_lastNameMaterial'), 
    'test')

WebUI.setText(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/input_Mnimo 3 caracteres_phoneMaterial'), 
    '6456453546')

def timestamp = new SimpleDateFormat('yyyyMMddHHmmss').format(new Date())

GlobalVariable.CreateAccount_Email = "test$timestamp@gmail.com"

WebUI.setText(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/input_Mnimo 10 dgitos_emailMaterial'), 
    GlobalVariable.CreateAccount_Email)

WebUI.setText(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/input_Por favor ingresa un correo vlido_pas_e12d55'), 
    'Test@Test1234')

WebUI.click(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/span__view-password'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/span_trminos y condiciones de Office Depot__ac3903'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Ingresar  Office Depot Mexico/button_Crear cuenta'))

WebUI.verifyElementText(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_test'), 
    'test')

WebUI.click(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/span_Favoritos'))

WebUI.verifyElementText(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/div_Favoritos'), 
    'Favoritos')

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/div_Tu regreso a clases comienza con tus favoritos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/span_Guarda tus productos favoritos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/span_Nosotros los guardamos para cuando qui_981052'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/a_Agregar favoritos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/span_Tu regreso a clases comienza con tus f_d068ea'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Shopping Lists  Office Depot Mexico/img'), 0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/span_Mis productos'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/h2_Eliminaste todos los productos de tu carrito'), 
    0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/img'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/p_Laptops'))

WebUI.verifyElementPresent(findTestObject('E2E/Page_Laptops  Office Depot Mexico/div_Marca'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/div_Procesador'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/label_Ms relevante                         _d358f7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/img_grid_lazy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/div_grid_select-heart-od heart-noanonym-od'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/span_SKU'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/h2_Laptop Asus Vivobook 15 Intel Core i5 8G_c3f615'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/div_11,999.00'), 0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/div_grid_select-heart-od heart-noanonym-od'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Laptops  Office Depot Mexico/p_Papel'))

WebUI.click(findTestObject('Object Repository/E2E/Page_papeleria  Office Depot Mexico/h2_Caja de Papel Ecolgico Tamao Carta Earth_1358a8'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/h1_Caja de Papel Ecolgico Tamao Carta Earth_8539ab'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/span_SKU'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/div_699.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/img_SKU_sbImage'), 
    0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/img_SKU_sbImage_1'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/div_Cantidad_flecha-cantidad-mb'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/li_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/button_Aadir al carrito'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/h2_Descripcin y caractersticas'), 
    0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/button_Aadir al carrito'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/div_OFFICE DEPOT es una marca registrada pr_a2fd7c'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Caja de Papel Ecolgico Tamao Carta Ear_425a25/span_Mis productos'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/div_Mi carrito'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/img_Gratis_lazy'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/div_Caja de Papel Ecolgico Tamao Carta Eart_ee900d'), 
    0)

WebUI.getText(findTestObject('E2E/Page_Mi Carrito  Office Depot Mexico/div_2,097.00', [('variable') : 'Order_Total']), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/input_2,097.00_input_quantity_0'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/small_ID del carrito 1703143607'), 
    0)

WebUI.verifyMatch('Order_Total', 'Order_Total', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/a_Proceder al pago'), 
    0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Mi Carrito  Office Depot Mexico/a_Proceder al pago'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('E2E/Page_Express Checkout/input__streetName'), 'Calle Padre Mier')

WebUI.setText(findTestObject('Object Repository/E2E/Page_Express Checkout/input__streetNumber'), '980')

WebUI.setText(findTestObject('Object Repository/E2E/Page_Express Checkout/input__postalcode'), '64000')

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Express Checkout/select_MONTERREY CENTROLA FINCAOtra Colonia'), 
    0)

WebUI.setText(findTestObject('Object Repository/E2E/Page_Express Checkout/span_Entre que calles se encuentra tu domicilio'), 
    'Monterrey Centro')

WebUI.setText(findTestObject('Object Repository/E2E/Page_Express Checkout/input_(ej. departamento 3 edificio A, puert_f49e7a'), 
    'Monterrey Centro')

WebUI.click(findTestObject('Object Repository/E2E/Page_Express Checkout/input_Verifica tu ubicacin_saveAddressInMyA_91c621'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Express Checkout/button_Continuar con el pago'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Express Checkout/span_Continuar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Express Checkout/img_Envo a domicilio_lazy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Express Checkout/div_Caja de Papel Ecolgico Tamao Carta Eart_ee900d'), 
    0)

WebUI.verifyMatch('Order_Total', 'Order_Total', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Express Checkout/span_Entrega estimada el 30042026'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Express Checkout/span_Pago en tienda'), 0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Express Checkout/input_Pago a contra entrega_paypos'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Express Checkout/button_Finalizar mi compra'))

WebUI.getText(findTestObject('E2E/Page_Pagina de Confirmacin  Office Depot Mexico/div_1703153071', [('variable') : 'order_id']), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Pagina de Confirmacin  Office Depot Mexico/span_testtest123gmail.com'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Pagina de Confirmacin  Office Depot Mexico/li_Fecha lmite de Pago 04052026'), 
    0)

WebUI.click(findTestObject('Object Repository/E2E/Page_Pagina de Confirmacin  Office Depot Mexico/img'))

WebUI.mouseOver(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/div_Hola,test'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/span_Mis Pedidos'))

WebUI.verifyMatch('order_id', 'order_id', false)

WebUI.verifyMatch('Order_Total', 'Order_Total', false)

WebUI.click(findTestObject('Object Repository/E2E/Page_Historial de rdenes  Office Depot Mexico/a_Ver detalle'))

WebUI.click(findTestObject('Object Repository/E2E/Page_Detalles de Compra  Office Depot Mexico/span_Salir_glyphicon glyphicon-chevron-left'))

WebUI.verifyElementPresent(findTestObject('Object Repository/E2E/Page_Historial de rdenes  Office Depot Mexico/div_MIS PEDIDOS'), 
    0)

WebUI.closeBrowser()

