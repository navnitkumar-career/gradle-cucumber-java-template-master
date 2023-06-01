package initiate;

import com.google.inject.Inject;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.net.MalformedURLException;

public class Fixtures {

    private State state;

    @Inject
    public Fixtures(State state){
        this.state = state;
    }

    @Before
    private void setUp() throws MalformedURLException {
        state.webDriver.manage().deleteAllCookies();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            File screenshot = ((TakesScreenshot) state.webDriver).getScreenshotAs(OutputType.FILE);
            System.out.println(screenshot.getName());
        }
        state.webDriver.close();
    }
}