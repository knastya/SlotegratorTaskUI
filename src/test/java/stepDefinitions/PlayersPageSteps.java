package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PlayersPage;

public class PlayersPageSteps extends BaseStep {
    private PlayersPage playersPage;

    @Then("^Table with players is loaded$")
    public void tableWithPlayersIsLoaded() {
        playersPage = new PlayersPage(driver);
    }

    @When("^User sorts table on Username (.*)$")
    public void userSortsTableOnUsername(String userName){
        playersPage.sortTableByUsername(userName);
    }

    @Then("^Table are sorted correctly by (.*) Username$")
    public void tableSortedByUsername(String userName) throws InterruptedException {
       assert  playersPage.isSortingByUsernameCorrect(userName);
    }

}
