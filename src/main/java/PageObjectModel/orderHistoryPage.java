package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class orderHistoryPage extends AbstractClass{

    WebDriver driver;
    public orderHistoryPage(){

        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//span[text()='Tugba Aydin']")
    private WebElement clickOnTugbaAydin;

    public void clickOnTugbaAydinTab(){
        clickOnFunctionalities(clickOnTugbaAydin);
    }

    @FindBy(xpath = "//span[text()='Order history and details']")
    private WebElement orderHistory;

    public void clickOnOrderHistoryTab(){
        scrollDown();
        clickOnFunctionalities(orderHistory);
    }

    //to get the reference number in text

    @FindBy(xpath = "//div[@class='box']/text()[11]")
    private String referenceNum;
    
    public void getTheReferenceNumber(){

        sleep(3);

        String s = injectWrappedText(getXpathForTitle(11),driver);

        System.out.println(driver.findElement(By.xpath("ca9c255d-bd62-4cba-8df0-fbf674aaa629")));
    }

    //to get the column of reference list

    @FindAll({
            @FindBy(xpath = "//table[@id='order-list']/tbody//td[1]")
    })
    private List<WebElement> firstColumnlist;

    public void getTheColumnReferenceNum(String value){

        verifyOrderNumber(firstColumnlist,referenceNum, value );



    }
}
