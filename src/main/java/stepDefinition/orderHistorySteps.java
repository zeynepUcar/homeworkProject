package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.orderHistoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class orderHistorySteps extends AbstractClass {

    WebDriver driver;

    orderHistoryPage order = new orderHistoryPage();


    @And("^Get the amount from order confirmation$")
    public void getTheAmountFromOrderConfirmation() {

        order.getTheAmountFromOrder();
    }


    @Given("^Click on Tugba Aydin tab$")
    public void click_on_Tugba_Aydin_tab() throws Throwable {

        order.clickOnTugbaAydinTab();
    }

    @Given("^Click on Order History and Details$")
    public void click_on_Order_History_and_Details() throws Throwable {

        order.clickOnOrderHistoryTab();

    }

    @Then("^Confirm total price column is matched with amount from order confirmation$")
    public void confirmTotalPriceColumnIsMatchedWithAmountFromOrderConfirmation() {

        sleep(1);
        order.getTheColumnAmountPrice();
    }
}
