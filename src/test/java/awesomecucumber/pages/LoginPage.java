package awesomecucumber.pages;

import awesomecucumber.constants.EndPoint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement LoginUsername;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement LoginPassword;
    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement LoginBTN;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginURL() {
        load(EndPoint.LOGIN.url);

}

    public void loginUser(String User, String Password) {
        wait.until(ExpectedConditions.visibilityOf(LoginUsername)).sendKeys(User);
        wait.until(ExpectedConditions.visibilityOf(LoginPassword)).sendKeys(Password);
        wait.until(ExpectedConditions.elementToBeClickable(LoginBTN)).click();

    }






}
