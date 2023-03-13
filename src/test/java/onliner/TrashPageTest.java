package onliner;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TrashPageTest extends BaseTest {
    private final static String URL = "https://www.onliner.by/";
    private final static String CATALOG_URL = "https://catalog.onliner.by/";


    @Test
    public void addProductToTrash(){
        MainPage mainPage = new MainPage(URL);
        mainPage.redirectToCatalogPage();
        CatalogPage catalogPage = new CatalogPage(CATALOG_URL);
        catalogPage.redirectToProductPage();
        ProductPage productPage = new ProductPage();
        productPage.redirectToOfferPage();
        OfferPage offerPage = new OfferPage();
        offerPage.redirectToTrashPage();
        TrashPage trashPage = new TrashPage();
        WebElement cart = trashPage.getCart();
        Assert.assertNotNull(cart);
    }
}
