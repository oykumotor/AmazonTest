package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageStepDefs {

   WebDriver driver = DriverFactory.getDriver();
   HomePage HomePage = new HomePage(driver);
   LoginPage LoginPage = new LoginPage(driver);


   @Given(": I clicked the login button on the home page.")
   public void iClickedTheLoginButtonOnTheHomePage() {

      HomePage.clickLoginButton();
   }

   @And(": I am on the login page.")
   public void iAmOnTheLoginPage() {

      LoginPage.loginPage();
   }

   @When(":  I write my e-mail address in the e-mail text field.")
   public void iWriteMyEMailAddressInTheEMailTextField() {
      LoginPage.fillEmailField();
   }

   @And(": I click continue button.")
   public void iClickContinueButton() {
      LoginPage.continueButton();
   }

   @And(": I type the password in the password text field.")
   public void iTypeThePasswordInThePasswordTextField() {
      LoginPage.fillPasswordField();
   }

   @And(": I click login button.")
   public void iClickLoginButton() {
      LoginPage.loginButton();

   }

   @Then("I should be on the users home page")
   public void iShouldBeOnTheUsersHomePage() {
      HomePage.homePage();

   }


}
