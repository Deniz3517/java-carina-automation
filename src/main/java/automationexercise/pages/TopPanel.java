package automationexercise.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopPanel extends AbstractPage {

    @FindBy(xpath = "//a[@href='/products']")
    private ExtendedWebElement productsMenu;

    @FindBy(xpath = "//a[@href='/cart']")
    private ExtendedWebElement cartMenu;

    @FindBy(xpath = "//a[@href='/login']")
    private ExtendedWebElement loginMenu;

    @FindBy(xpath = "//a[@href='/']")
    private ExtendedWebElement homeMenu;

    public TopPanel(WebDriver driver) {
        super(driver);
    }

    public void navigateToProducts() {
        productsMenu.click();
    }

    public void navigateToCart() {
        cartMenu.click();
    }

    public void navigateToLogin() {
        loginMenu.click();
    }

    public void navigateToHome() {
        homeMenu.click();
    }
}
