package stepdef;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import initiate.State;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private final String START = "http://localhost:8080/start";

    private State state;
    private HomePage homePage;

    @Inject
    public MyStepdefs(State state) {
        this.state = state;
        this.homePage = new HomePage(state.webDriver);
        PageFactory.initElements(state.webDriver, homePage);
    }

    @Given("^User goes to the home page$")
    public void openHomePage() throws Throwable {
        homePage.navigateTo(START);
    }

    @Then("^The message (.*) is displayed$")
    public void theMessageIsDisplayed(String expected) throws Throwable {
        String actual = homePage.result.getText();
        assertEquals(actual, expected);
    }
}
