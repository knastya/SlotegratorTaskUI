package stepDefinitions;

import io.cucumber.java.After;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseStep {
    protected static WebDriver driver;

    public BaseStep() {
        if (driver == null)
            createNewDriverInstance();
    }

    //TODO поправить путь
    private void createNewDriverInstance() {
        System.out.println("Open browser");
        System.setProperty("webdriver.chrome.driver", "C://Users/jenne/IdeaProjects/SlotegratorTaskUI/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    //todo вызывать после каждого теста автоматически
    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}
