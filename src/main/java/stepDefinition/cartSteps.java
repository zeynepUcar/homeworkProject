package stepDefinition;
import PageObjectModel.*;
import Utilities.Driver;
import Utilities.readProperties;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
public class cartSteps extends AbstractClass {



    BuyItemPage bip = new BuyItemPage();
    CartPage cp = new CartPage();



    @And("^navigate over the titles$")
    public void navigateOverTheTitles() throws InterruptedException {

        bip.navigateOver();
    }

    @And("^click to women button$")
    public void clickToWomenButton() {
        bip.clickWomenButton();
    }

    @And("^choose a random product$")
    public void chooseARandomProduct() throws InterruptedException {



        bip.clickToListIcon();
        Thread.sleep(1000);
        bip.clickRandomCartButton();
        Thread.sleep(1000);


    }


    @When("^click to Proceed to checkout$")
    public void clickToProceedToCheckout() throws InterruptedException {
        bip.clickToCheckoutButton();

        Thread.sleep(3000);


    }

    @Then("^cart shouldn't be empty$")
    public void cartShouldnTBeEmpty() {
        cp.verifyToCart();


    }
    @When("^click to remove button$")
    public void clickToRemoveButton() {

        cp.clickRemoveTitle();
    }



    @Then("^cart should be empty$")
    public void cartShouldBeEmpty() {

    }


}
