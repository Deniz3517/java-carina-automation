package automationexercise.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//button[p[text()='accept']]")
    private ExtendedWebElement cookieAcceptButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        if (cookieAcceptButton.isElementPresent()) {
            cookieAcceptButton.click();
            System.out.println("Cookie accepted.");
        }
    }
}
