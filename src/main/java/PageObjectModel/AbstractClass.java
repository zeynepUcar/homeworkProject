package PageObjectModel;

import Utilities.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public abstract class AbstractClass {
    WebDriver driver;
    WebDriverWait wait;



    public void waitMethod(){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    public AbstractClass() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickOnFunctionalities(WebElement clickElement) {
        waitMethod();

        try {
            wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendkeysElement, String value) {

        waitMethod();

        try {
            wait.until(ExpectedConditions.visibilityOf(sendkeysElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sendkeysElement.sendKeys(value);
    }

    public void waitUntilVisibility(WebElement waitElement) {
        try {
            wait.until(ExpectedConditions.visibilityOf(waitElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void waitUntilInVisibility(WebElement waitElement) {

        try {
            wait.until(ExpectedConditions.invisibilityOf(waitElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }




    public void randomMethodForClothes( List<WebElement> produckts) {

        int randomNum = randomGenerator(produckts.size());
        clickOnFunctionalities(produckts.get(randomNum));


    }

    public int randomGenerator(int max) {

        Random random = new Random();
        int randomNum = random.nextInt(max);
        return randomNum;
    }




    public void scrollDown() {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,270)", "");
    }


    public void selectInDropDown(WebElement dropdown){
        Select select = new Select(dropdown);
        List<WebElement> list = select.getOptions();

            select.selectByIndex(39);

    }


    public void verifyURL(String expectedResult){


        String URL = driver.getCurrentUrl();

        Assert.assertTrue(URL.contains( expectedResult )  );

    }


}

