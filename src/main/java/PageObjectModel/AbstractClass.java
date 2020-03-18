package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class AbstractClass {
    WebDriverWait wait;
    WebDriver driver =Driver.getDriver();


    public void waitMethod(){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    public void clickOnFunctionalities(WebElement clickElement) {
        waitMethod();
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendkeysElement, String value) {
        waitMethod();
        sendkeysElement.sendKeys(value);
    }
    public void waitUntilVisibility(WebElement waitElement){
        try {
            wait.until( ExpectedConditions.visibilityOf( waitElement ) );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void waitUntilInVisibility(WebElement waitElement){

        try {
            wait.until( ExpectedConditions.invisibilityOf( waitElement ) );
        }catch(Exception e){
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



}

