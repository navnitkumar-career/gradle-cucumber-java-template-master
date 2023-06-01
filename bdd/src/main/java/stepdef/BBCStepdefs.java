package stepdef;

import com.google.inject.Inject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import initiate.State;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BBCPage;

import static org.junit.Assert.assertTrue;

public class BBCStepdefs {

    private final String START = "http://www.bbc.co.uk";

    private State state;
    private BBCPage bbcPage;

    @Inject
    public BBCStepdefs(State state) {
        this.state = state;
        this.bbcPage = new BBCPage(state.webDriver);
        PageFactory.initElements(state.webDriver, bbcPage);
    }

    @Given("^I go to the BBC home page$")
    public void openBBCPage() throws Throwable {
        bbcPage.navigateTo(START);
    }

    @And("^I can click on the BBC News link$")
    public void clickOnBBCNewsLink() {
        WebElement bbcNewsLink = bbcPage.bbcNewsLink;
        bbcNewsLink.click();
    }

    @Then("^I am on the BBC News page$")
    public void confirmBBCNewsPage() throws Throwable {
        assertTrue(bbcPage.titleIs("Home - BBC News"));
    }

}
