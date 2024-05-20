package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static TimePage timePage;


    public static LoginPage getLoginPage(WebDriver driver){
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }
    public static DashboardPage getDasboardPage(WebDriver driver){
        return dashboardPage == null ? new DashboardPage(driver) : dashboardPage;
    }
    public static TimePage getTimePage(WebDriver driver){
        return timePage == null ? new TimePage(driver) : timePage;
    }
}
