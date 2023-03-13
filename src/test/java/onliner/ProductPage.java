package onliner;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    public WebElement getOffer() {
        return offer;
    }

    @FindBy(xpath = "//a[@title='Сравнение предложений на Polar H10 (серый)']")
    private WebElement offer;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public ProductPage redirectToOfferPage() {
        offer.click();
        return this;
    }
}
