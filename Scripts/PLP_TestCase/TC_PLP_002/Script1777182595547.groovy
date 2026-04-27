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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import java.util.Collections as Collections
import java.util.ArrayList as ArrayList

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.click(findTestObject('Object Repository/PLP/Page_Office Depot Mexico  Compra en lnea Ar_97767d/PLP_p_Laptops'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Sort_select_Ms relevante _a681d4'), 
    'topRated', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Sort_select_Ms relevante _a681d4'), 
    'name-asc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Sort_select_Ms relevante _a681d4'), 
    'name-desc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Sort_select_Ms relevante _a681d4'), 
    'price-asc', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PLP/Page_Laptops  Office Depot Mexico/PLP_Sort_select_Ms relevante _a681d4'), 
    'price-desc', true)

WebUI.verifyElementPresent(findTestObject('PLP/Page_Laptops  Office Depot Mexico/PLP_Product_1_Descount_Price'), 0)

WebUI.verifyElementPresent(findTestObject('PLP/Page_Laptops  Office Depot Mexico/PLP_Product_2_Descount_Price'), 0)

WebUI.verifyElementPresent(findTestObject('PLP/Page_Laptops  Office Depot Mexico/PLP_Product_3_Descount_Price'), 0)

WebUI.verifyElementPresent(findTestObject('PLP/Page_Laptops  Office Depot Mexico/PLP_Product_4_Descount_Price'), 0)

WebUI.verifyElementPresent(findTestObject('PLP/Page_Laptops  Office Depot Mexico/PLP_Product_5_Descount_Price'), 0)

WebUI.verifyElementPresent(findTestObject('PLP/Page_Laptops  Office Depot Mexico/PLP_Product_6_Descount_Price'), 0)

WebUI.delay(3)

// Capture ALL product prices (removed [1])
List<WebElement> priceElements = DriverFactory.getWebDriver().findElements(By.xpath('//div[@class=\'discountedPrice-grid cont-price-grid bp-original\']'))

List<Double> prices = new ArrayList<Double>()

for (WebElement e : priceElements) {
    String priceText = e.getText().replace('$', '').replace(',', '').trim()

    if (!(priceText.equals(''))) {
        prices.add(Double.parseDouble(priceText))
    }
}

println('Captured Prices: ' + prices)

// Verify descending order
for (int i = 0; i < (prices.size() - 1); i++) {
    if (prices.get(i) < prices.get(i + 1)) {
        WebUI.comment((((('Sorting failed at index ' + i) + ' : ') + prices.get(i)) + ' is less than ') + prices.get(i + 
                1))

        assert false : 'Sale Prices are NOT in descending order'
    }
}

println('Prices are in descending order')

WebUI.closeBrowser()

