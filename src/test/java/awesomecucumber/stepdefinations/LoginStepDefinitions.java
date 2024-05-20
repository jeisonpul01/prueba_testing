package awesomecucumber.stepdefinations;

import awesomecucumber.context.TestContext;
import awesomecucumber.pages.DashboardPage;
import awesomecucumber.pages.LoginPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginStepDefinitions  {
    private final TestContext context;
    private final LoginPage loginPage;
    private final DashboardPage dashboardPage;


    public LoginStepDefinitions(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
        dashboardPage = PageFactoryManager.getDasboardPage(context.driver);
    }


    @Given("I'm on the login Page")
    public void iMOnTheLoginPage() throws InterruptedException {
        loginPage.loginURL();
    }

    @When("I identify myself with my credentials")
    public void loginUser() {
        loginPage.loginUser("Admin", "admin123");
    }

    @Then("I access the user dashboard")
    public void ComprobationDashboard() {
        dashboardPage.DashboardAssertions();

    }
}
