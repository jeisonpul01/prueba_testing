package awesomecucumber.pages;

import awesomecucumber.constants.EndPoint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TimePage extends BasePage {
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div/button")
    private WebElement ViewBTN;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[1]/div[2]/div/p")
    private WebElement TimesheetPeriod;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button")
    private WebElement EditBTN;

    public TimePage(WebDriver driver) {
        super(driver);
    }

    public void TimeURL() {
        load(EndPoint.TIME.url);
    }
    public void ClickViewLastPeriod (){
        wait.until(ExpectedConditions.elementToBeClickable(ViewBTN)).click();
    }
    public void TimePage_TimesheetAssertions (){
        wait.until(ExpectedConditions.visibilityOf(TimesheetPeriod));
        assertThat(TimesheetPeriod.getText(), containsString("Timesheet Period"));

        wait.until(ExpectedConditions.visibilityOf(EditBTN));
        assertThat("Element should be present", EditBTN, is(notNullValue()));
    }



}
