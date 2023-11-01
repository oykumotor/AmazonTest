package util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public void click(By key){

       driver.findElement(key).click();

    }
    public void sendKey(By key, String text){
        driver.findElement(key).sendKeys(text);
    }


    public void checkVisible(By key){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(key)));
    }

    public void select(By key, String value){

        Select select = new Select(driver.findElement(key));

        select.selectByValue(value);

    }

}