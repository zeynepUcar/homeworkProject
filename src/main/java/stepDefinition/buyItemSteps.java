package stepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.BuyItemPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class buyItemSteps extends AbstractClass {
    BuyItemPage bip = new BuyItemPage();

    @Given("^Search  for the \"([^\"]*)\"$")
    public void search_for_the(String myItem) throws Throwable {
        bip.typeTheSearchBox(myItem);

    }

    @Given("^Click on Search Button$")
    public void click_on_Search_Button() throws Throwable {
        bip.clickOnSearchButton();

    }

    @Given("^Click on List View$")
    public void click_on_List_View() throws Throwable {
        bip.clickOnListView();
    }

    @Given("^Click on any dress$")
    public void click_on_any_dress() throws Throwable {
        bip.clickOnAnyItem();

    }

    @Given("^Click on add to cart button$")
    public void click_on_add_to_cart_button() throws Throwable {
        bip.clickOnAddToCartButton();

    }

    @Given("^Click on Proceed to Checkout Button$")
    public void click_on_Proceed_to_Checkout_Button() throws Throwable {
        scrollDown();
        bip.clickOnProceedToChechout();


    }

    @Given("^Click on Proceed to Checkout Button of Sign In Part$")
    public void click_on_Proceed_to_Checkout_Button_of_Sign_In_Part() throws Throwable {
        bip.clickOnProceedToChechoutSignIn();
    }

    @Given("^Click on Proceed to Checkout Button of Adress Part$")
    public void click_on_Proceed_to_Checkout_Button_of_Adress_Part() throws Throwable {
        bip.clickOnProceedToCheckOutAdressPart();
    }


    @Given("^Click on Terms of Service Box$")
    public void click_on_Terms_of_Service_Box() throws Throwable {

        bip.clickOnCheckbox();

    }

    @Given("^Click on Proceed to Checkout Button Last Part$")
    public void click_on_Proceed_to_Checkout_Button_Last_Part() throws Throwable {
        bip.clickOnProceedToChckOutLast();
    }


    @Given("^Click on Pay by bank wire tab$")
    public void click_on_Pay_by_bank_wire_tab() throws Throwable {
        bip.clickOnPaymentType();

    }

    @Given("^Click on I confirm my order button$")
    public void click_on_I_confirm_my_order_button() throws Throwable {
        bip.clickOnConfirmButton();
    }

    @Then("^Verify your order is complete$")
    public void verify_your_order_is_complete() throws Throwable {
        bip.verifyingMyOrder();
    }


}
