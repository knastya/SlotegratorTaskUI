package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BaseStep {

    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @Before
    public void beforeScenario() {
        System.out.println("Open browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterScenario() {
        driver.quit();
        driver = null;
    }

}