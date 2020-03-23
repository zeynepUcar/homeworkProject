package PageObjectModel;

import Utilities.Driver;
import Utilities.readProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class contactPage extends AbstractClass {

    WebDriver driver;



    public contactPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[title='Contact Us']")
    private WebElement contactTab;

    @FindBy(css = "select[id='id_contact']")

    private WebElement subjectHeadingOptions;
    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    private WebElement orderPreference;
    @FindBy(xpath = "(//select[@name='id_product'])[1]")
    private WebElement productOptions;

    @FindBy(css = "#message")
    private WebElement messageBox;

    @FindBy(css = "button[name='submitMessage']")
    private WebElement sendButton;
    @FindBy(css="p[class='alert alert-success']")
    private WebElement successMessage;

    public void clickOnContactUs() {
        clickOnFunctionalities(contactTab);
    }

    public void selectSubjectHeading() {
        Select headingSubject = new Select(subjectHeadingOptions);
        headingSubject.selectByVisibleText("Customer service");
    }

    public void selectOrderPreference() {
        Select orderPre = new Select(orderPreference);

            orderPre.selectByIndex(0);

    }

    public void selectProduct() {
        Select product = new Select(productOptions);
        product.selectByIndex(1);
    }

    public void typeTheMessage(String message) {
        message = readProperties.getData("message");
        sendKeysFunction(messageBox, message);
    }

    public void clickOnSendButton() {
        clickOnFunctionalities(sendButton);
    }
    public void verifySentMessage(){
        String message="Your message has been successfully sent to our team.";
        String actual=successMessage.getText().trim();
       if(message.equals(actual)){
           System.out.println("it is verified");
       }else{
           System.out.println("fail");
       }
    }
}
