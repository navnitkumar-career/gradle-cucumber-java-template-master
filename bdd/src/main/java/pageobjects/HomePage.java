package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(id = "result")
    public WebElement result;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
}
