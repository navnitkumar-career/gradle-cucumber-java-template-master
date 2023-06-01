package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageObject {

    private WebDriver webDriver;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void navigateTo(String pageUrl) {
        this.webDriver.navigate().to(pageUrl);
    }

    public void clickElementWithText(String text) {
        this.webDriver.findElement(By.partialLinkText(text)).click();
    }

    public void clickFirstElementWithText(String text) {
        this.webDriver.findElements(By.partialLinkText(text)).get(0).click();
    }
    public void typeIntoTextFieldWithLabel(String label, String text) {
        this.webDriver.findElement(By.name(label)).sendKeys(text);
    }
    public void submitRequest(String label) {
        this.webDriver.findElement(By.name(label)).submit();
    }
    public boolean containsText(String text) {
        return this.webDriver.getPageSource().contains(text);
    }
    public boolean titleIs(String text) {
        return this.webDriver.getTitle().contains(text);
    }

    public String getSource() {
        return this.webDriver.getPageSource();
    }
}