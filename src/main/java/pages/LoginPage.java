package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private final WebDriver driver;
    private final String LOGIN_URL = "http://test-app.d6.dev.devcaz.com/admin/login";

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='UserLogin_username']")
    private WebElement loginField;

    @FindBy(xpath = ".//*[@id='UserLogin_password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//*[@value='Sign in']")
    private WebElement signInButton;

    public void openPage() {
        driver.get(LOGIN_URL);
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }

}
