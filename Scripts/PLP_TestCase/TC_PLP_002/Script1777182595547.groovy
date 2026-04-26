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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import java.util.Collections
import java.util.ArrayList

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.click(findTestObject('Object Repository/PLP/Page_Office Depot Mexico  Compra en lnea Ar_97767d/p_Laptops'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/select_Ms relevante                        _a681d4'), 
    'topRated', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/select_Ms relevante                        _a681d4'), 
    'name-asc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/select_Ms relevante                        _a681d4'), 
    'name-desc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/select_Ms relevante                        _a681d4'), 
    'price-asc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/select_Ms relevante                        _a681d4'), 
    'price-desc', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_32,999.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_22,999.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_27,999.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_19,339.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_19,999.00'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/div_20,299.00'), 0)


WebUI.delay(3)


// Update XPath if needed for your site
List<WebElement> priceElements = DriverFactory.getWebDriver().findElements(
	By.xpath("(//div[@class='discountedPrice-grid cont-price-grid bp-original'])[1]")
)

List<Double> actualPrices = new ArrayList<Double>()

for (WebElement e : priceElements) {

	String priceText = e.getText()
	priceText = priceText.replace('$','')
	priceText = priceText.replace(',','')
	priceText = priceText.trim()

	if (!priceText.equals("")) {
		actualPrices.add(Double.parseDouble(priceText))
	}
}

println("Actual Prices: " + actualPrices)


// Copy list and sort descending
List<Double> expectedPrices = new ArrayList<Double>(actualPrices)

Collections.sort(expectedPrices)
Collections.reverse(expectedPrices)

println("Expected Descending: " + expectedPrices)


// Verify
assert actualPrices.equals(expectedPrices) :
	"Prices are NOT in descending order"
	
WebUI.closeBrowser()

