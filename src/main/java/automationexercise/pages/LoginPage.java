package automationexercise.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(id = "login-email")
    private ExtendedWebElement emailField;

    @FindBy(id = "login-password")
    private ExtendedWebElement passwordField;

    @FindBy(id = "login-submit")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        emailField.type(email);
        passwordField.type(password);
        loginButton.click();
    }
}
