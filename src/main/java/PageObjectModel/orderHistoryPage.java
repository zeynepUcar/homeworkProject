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


    @FindBy(xpath = "//span[text()='Order history and details']")
    private WebElement orderHistory;


    @FindBy(xpath = "//*[@id=\"center_column\"]/div/span/strong")

    private WebElement amount;


    @FindAll({
            @FindBy(xpath = "//table[@id='order-list']/tbody//td[3]")
    })

    private List<WebElement> firstColumnOflist;



    public void clickOnTugbaAydinTab(){
        clickOnFunctionalities(clickOnTugbaAydin);
    }


    public void clickOnOrderHistoryTab(){
        scrollDown();
        clickOnFunctionalities(orderHistory);
    }



    //to get the amount from order confirmation

    String totalPrice= "";  //we used this to define in below, otherwise I cannot get webElement as string

    public void getTheAmountFromOrder(){


       totalPrice = getAmountFromConfirmation(amount);

    }



    //to get the column of total price list

    public void getTheColumnAmountPrice(){

        verifyTotalPrice(firstColumnOflist,totalPrice);



    }
}
