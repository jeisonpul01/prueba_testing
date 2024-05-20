package awesomecucumber.stepdefinations;

import awesomecucumber.context.TestContext;
import awesomecucumber.pages.DashboardPage;
import awesomecucumber.pages.LoginPage;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.TimePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimeStepDefinitions {
    private final TestContext context;
    private final LoginPage loginPage;
    private final TimePage timePage;


    public TimeStepDefinitions(TestContext context) {
        this.context = context;
        loginPage = PageFactoryManager.getLoginPage(context.driver);
         timePage = PageFactoryManager.getTimePage(context.driver);
    }


    @Given("I'm on the Time Page")
    public void ImOnTheTimePage()  {
        timePage.TimeURL();
        loginPage.loginUser("Admin", "admin123");
    }

    @When("I click on view in the last period")
    public void loginUser() {
        timePage.ClickViewLastPeriod();
    }


    @Then("I access the user's Time Sheet")
    public void ComprobationTimePage() {
        timePage.TimePage_TimesheetAssertions();
    }
}
