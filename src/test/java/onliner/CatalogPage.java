package onliner;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends BasePage {
    public WebElement getElectronics() {
        return electronics;
    }

    public WebElement getCatalogTitle() {
        return catalogTitle;
    }

    public WebElement getGadgets() {
        return gadgets;
    }

    public WebElement getHeartRateMonitors() {
        return heartRateMonitors;
    }

    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    private WebElement electronics;

    @FindBy(xpath = "//div[contains(@class,'catalog-navigation__title')][contains(text(),'Каталог')]")
    private WebElement catalogTitle;

    @FindBy(xpath = "//div[contains(text(),'Гаджеты')]")
    private WebElement gadgets;

    @FindBy(xpath = "//div[contains(@class,'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active')]//a[3]//span[1]//span[2]")
    private WebElement heartRateMonitors;

    public CatalogPage(String url) {
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public CatalogPage redirectToProductPage() {
        electronics.click();
        gadgets.click();
        heartRateMonitors.click();
        return this;
    }

}
