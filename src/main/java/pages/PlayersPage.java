package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlayersPage {
    private final WebDriver driver;

    public PlayersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[@id='payment-system-transaction-grid']")
    private WebElement playersTable;

    @FindBy(xpath = ".//input[@name='PlayerSearch[login]']")
    private WebElement usernameSortField;

    @FindBy(xpath = ".//tbody/tr/td[2]/a")
    private List<WebElement> usernameList;

    @FindBy(xpath = ".//div[@class='grid-view grid-view-loading']")
    private WebElement loadingPic;

    public void playersTableLoaded() {
        playersTable.isDisplayed();
    }

    public void sortTableByUsername(String Username) {
        usernameSortField.sendKeys(Username);
        usernameSortField.sendKeys(Keys.ENTER);
    }

    public boolean isSortingByUsernameCorrect(String Username) throws InterruptedException {
        //TODO change sleep to wait
        Thread.sleep(3000);

        boolean isSortCorrect = true;
        for (int i = 0; i < usernameList.size() && isSortCorrect; i++) {
            isSortCorrect = usernameList.get(i).getText().contains(Username);
        }
        return isSortCorrect;
    }
}
