package onliner;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CatalogPageTest extends BaseTest {
    private final static String URL = "https://www.onliner.by/";
    private final static String CATALOG_URL = "https://catalog.onliner.by/";

    private final static String PRODUCT_URL = "https://catalog.onliner.by/heart_rate?hr_type%5B0%5D=heartratemon&hr_type%5Boperation%5D=union";

    @Test
    public void checkElementsCatalogPage(){
        MainPage mainPage = new MainPage(URL);
        WebElement catalog = mainPage.getCatalog();
        catalog.click();
        CatalogPage catalogPage = new CatalogPage(CATALOG_URL);
        WebElement catalogTitle = catalogPage.getCatalogTitle();
        WebElement electronics = catalogPage.getElectronics();

        Assert.assertNotNull(catalogTitle);
        Assert.assertNotNull(electronics);
    }

    @Test
    public void checkRedirectToProductPage() {
        MainPage mainPage = new MainPage(URL);
        mainPage.redirectToCatalogPage();
        CatalogPage catalogPage = new CatalogPage(CATALOG_URL);
        catalogPage.redirectToProductPage();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(PRODUCT_URL, currentUrl);
    }

}
