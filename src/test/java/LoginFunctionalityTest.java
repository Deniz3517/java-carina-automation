
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.config.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automationexercise.pages.HomePage;
import automationexercise.pages.LoginPage;
import automationexercise.pages.TopPanel;

import static org.testng.Assert.assertTrue;

public class LoginFunctionalityTest implements IAbstractTest {

    @Test
    public void testLoginFunctionality() {
        getDriver().get(Configuration.getRequired("url"));

        HomePage homePage = new HomePage(getDriver());
        homePage.acceptCookies();

        TopPanel topPanel = new TopPanel(getDriver());
        topPanel.navigateToLogin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(Configuration.getRequired("username"), Configuration.getRequired("password"));

        assertTrue(getDriver().findElement(By.id("user-account-name")).isDisplayed(), "Login failed!");
    }
}
