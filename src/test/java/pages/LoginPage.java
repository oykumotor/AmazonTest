package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class LoginPage {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By emailField = By.xpath("//input[@id='ap_email']");
    static By passwordField = By.xpath("//input[@id='ap_password']");
    static By continueBtn = By.xpath("//input[@id='continue']");
    static By loginBtn = By.id("signInSubmit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.elementHelper = new ElementHelper(driver);
    }

    public static void loginPage() {

        driver.navigate().to("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

    }

    public static void fillEmailField() {
        elementHelper.sendKey(emailField,"oyk1633@gmail.com");
    }

    public static void continueButton() {
        elementHelper.click(continueBtn);

    }

    public static void fillPasswordField() {

        elementHelper.sendKey(passwordField,"Amazon");
    }

    public static void loginButton() {
        elementHelper.click(loginBtn);
    }


}
