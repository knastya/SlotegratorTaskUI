package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@alt='Casino']")
    private WebElement casinoPic;

    @FindBy(xpath = ".//*[@id='nav-container']//*[@class='fa fa-user']//span[@class='icon-bg bg-success']")
    private WebElement usersIcon;

    @FindBy(xpath = ".//*[@id='s-menu-users']//a[text() = 'Players']")
    private WebElement playersButton;

    public void mainPageIsOpened() {
        casinoPic.isDisplayed();
    }

    public void expandUsersList() {
        usersIcon.click();
    }

    public void openPlayersList() {
        playersButton.click();
    }

}
