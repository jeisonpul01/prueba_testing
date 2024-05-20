package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//h6[contains(@class, 'oxd-text--h6') and contains(@class, 'oxd-topbar-header-breadcrumb-module')]")
    private WebElement DashboarAssert;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")
    private WebElement TimeAtWork_Element;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void DashboardAssertions (){
        wait.until(ExpectedConditions.visibilityOf(DashboarAssert));
        assertThat(DashboarAssert.getText(), containsString("Dashboard"));

        wait.until(ExpectedConditions.visibilityOf(TimeAtWork_Element));
        assertThat("Element should be present", TimeAtWork_Element, is(notNullValue()));
    }
}
