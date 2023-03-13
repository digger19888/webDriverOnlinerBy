package onliner;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage extends BasePage {

    public WebElement getToTrash() {
        return toTrash;
    }

    @FindBy(xpath = "//div[contains(@class,'offers-list__part offers-list__part_action')]//a[@class='button-style button-style_base-alter offers-list__button offers-list__button_cart button-style_expletive'][contains(text(),'В корзину')]")
    private WebElement toTrash;

    public WebElement getTrash() {
        return trash;
    }

    @FindBy(xpath = "//a[@title='Корзина']")
    private WebElement trash;

    public OfferPage() {
        PageFactory.initElements(driver, this);
    }

    public OfferPage redirectToTrashPage() {
        trash.click();
        return this;
    }
}
