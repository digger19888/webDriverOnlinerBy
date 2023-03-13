package onliner;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public WebElement getCatalog() {
        return catalog;
    }

    public WebElement getAgeWarning() {
        return ageWarning;
    }

    public WebElement getLogIn() {
        return logIn;
    }

    @FindBy(xpath = "//span[contains(@class,'b-main-navigation__text')][contains(text(),'Каталог')]")
    private WebElement catalog;

    @FindBy(xpath = "//div[@class='b-top-navigation-age']")
    private WebElement ageWarning;

    @FindBy(xpath = "auth-bar__item auth-bar__item--text")
    private WebElement logIn;

    public MainPage(String url) {
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public MainPage redirectToCatalogPage() {
        catalog.click();
        return this;
    }

}
