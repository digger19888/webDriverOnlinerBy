package onliner;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrashPage extends BasePage {


    public WebElement getCart() {
        return cart;
    }

    @FindBy(xpath = "//a[contains(text(),'Пульсометр Polar H10 (серый)')]")
    private WebElement cart;


    public TrashPage() {
        PageFactory.initElements(driver, this);
    }
}
