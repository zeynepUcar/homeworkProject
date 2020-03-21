package stepDefinition;
import PageObjectModel.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cartSteps extends AbstractClass {

    AddToCartPage acp = new AddToCartPage();

    @And("^navigate over the titles$")
    public void navigateOverTheTitles() throws InterruptedException {

        acp.navigateOver();
    }

    @And("^click to women button$")
    public void clickToWomenButton() {
        acp.clickWomenButton();
    }

    @And("^choose a random product$")
    public void chooseARandomProduct() throws InterruptedException {

        acp.clickToListIcon();
        Thread.sleep(1000);
        acp.clickRandomCartButton();
        Thread.sleep(1000);

    }

    @When("^click to Proceed to checkout$")
    public void clickToProceedToCheckout() throws InterruptedException {
        acp.clickToCheckoutButton();
        Thread.sleep(3000);

    }

    @Then("^cart shouldn't be empty$")
    public void cartShouldnTBeEmpty() {
        acp.verifyToCart();

    }
    @When("^click to remove button$")
    public void clickToRemoveButton() {

        acp.clickRemoveTitle();
    }

    @Then("^cart should be empty$")
    public void cartShouldBeEmpty() {

    }

}
