package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageSteps extends BaseStep {
    private MainPage mainPage;

    @Then("^User successfully logged in and admin panel opens$")
    public void userLoggedInAdminPanelOpens() {
        mainPage = new MainPage(driver);
        mainPage.mainPageIsOpened();
    }

    @When("^User opens list of players$")
    public void userOpensListOfPlayers() {
        mainPage.expandUsersList();
        mainPage.openPlayersList();
    }

}
