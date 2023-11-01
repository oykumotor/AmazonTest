package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverFactory;
import util.ElementHelper;

import java.time.Duration;

public class HomePage {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

   static By LgnBttn = By.id("nav-link-accountList-nav-line-1");
   static By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
   static By searchBtn = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.elementHelper = new ElementHelper(driver);
    }
    public static void homePage() {


    }

    public static void clickLoginButton() {

        elementHelper.click(LgnBttn);


    }
    public void writeSearchBox() {
        elementHelper.sendKey(searchBox,"kulaklık");
    }

    public void clickSearchButton() {

        elementHelper.click(searchBtn);

    }
}
