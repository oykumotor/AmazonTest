package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class MyCartPage {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By goToCartBtn = By.xpath("//*[@id=\"sw-gtc\"]/span/a");
    static By cartProduct= By.cssSelector(".a-truncate-cut");

    public MyCartPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.elementHelper = new ElementHelper(driver);
    }

    public void goToCart() {
        elementHelper.click(goToCartBtn);


    }


    public void cartCheck() {
        elementHelper.checkVisible(cartProduct);
    }
}
