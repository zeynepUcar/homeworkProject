package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractClass {
    WebDriverWait wait;

    public void clickOnFunctionalities(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendkeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendkeysElement));
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
}
