package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps extends BaseStep {
    private LoginPage loginPage;

    @Given("^Open Casino login page$")
    public void openCasinoLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.openPage();
    }

    @When("^Enter the Username and Password$")
    public void enterUsernamePassword() {
        loginPage.inputLogin("admin1");
        loginPage.inputPassword("[9k<k8^z!+$$GkuP");
    }

    @When("^Click Sign In$")
    public void clickSignIn() {
        loginPage.clickSignIn();
    }

}
