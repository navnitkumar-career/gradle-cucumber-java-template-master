package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBCPage extends PageObject {

    public BBCPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(partialLinkText = "News")
    public WebElement bbcNewsLink;

}
