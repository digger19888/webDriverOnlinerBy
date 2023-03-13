package onliner;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class MainPageTest extends BaseTest {
        private final static String URL = "https://www.onliner.by/";
        private final static String CATALOG_URL = "https://catalog.onliner.by/";

    @Test
    public void checkElementsMainPage(){
        MainPage mainPage = new MainPage(URL);
        WebElement catalog = mainPage.getCatalog();
        WebElement ageWarning = mainPage.getAgeWarning();
        WebElement logIn = mainPage.getLogIn();
        Assert.assertNotNull(catalog);
        Assert.assertNotNull(ageWarning);
        Assert.assertNotNull(logIn);
    }

    @Test
    public void checkRedirectToCatalogPage() {
        MainPage mainPage = new MainPage(URL);
        mainPage.redirectToCatalogPage();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(CATALOG_URL, currentUrl);
    }
}
