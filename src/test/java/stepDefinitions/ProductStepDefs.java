package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ListingPage;
import pages.LoginPage;
import pages.MyCartPage;
import util.DriverFactory;

public class ProductStepDefs {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    ListingPage listingPage = new ListingPage(driver);

    MyCartPage myCartPage =new MyCartPage(driver);



    @Given(": I'm on the home page.")
    public void iMOnTheHomePage() {
    }

    @When(": Write the product name in the search box.")
    public void writeTheProductNameInTheSearchBox() {
        homePage.writeSearchBox();
    }

    @When(": Click the search button.")
    public void clickTheSearchButton() {
        homePage.clickSearchButton();
    }

    @And(": Filter products by price from low to high")
    public void filterForPriceLowToHigh() {
       // listingPage.clickSortByBtn();

        listingPage.clickLowtoHigh();

    }

    @And(": Click to the first product on the listing.")
    public void clickToTheFirstProductOnTheListing() {
        listingPage.clickFirstProduct();

    }

    @And(": I add the first product to my cart.")
    public void iAddTheFirstProductToMyCart() {
        listingPage.clickAddCart();
    }

    @And(": Click to my cart button.")
    public void clickToMyCartButton() {

         myCartPage.goToCart();

    }

    @Then(": I should see the product that I added on my cart.")
    public void iShouldSeeTheProductThatIAddedOnMyCart() {


      myCartPage.cartCheck();

    }
}
