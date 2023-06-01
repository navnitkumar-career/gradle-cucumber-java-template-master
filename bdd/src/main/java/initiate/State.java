package initiate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class State  {

    public WebDriver webDriver;

    public State() {
        webDriver = new ChromeDriver();
    }
}