package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class ListingPage {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;



    static By sortBtn = By.xpath("//*[@id=\"s-result-sort-select\"]");
    static  By firstProduct = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[1]/span/a/div");
    static By addCartBtn=By.id("add-to-cart-button");
    String sortingValue = "price-asc-rank";

    public ListingPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickLowtoHigh() {

       elementHelper.select(sortBtn,sortingValue);

    }

    public void clickFirstProduct() {
        elementHelper.click(firstProduct);
    }

    public void clickAddCart() {
        elementHelper.click(addCartBtn);
    }


}
