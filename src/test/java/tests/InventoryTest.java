package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;
import utils.DriverFactory;

public class InventoryTest {

```
private WebDriver driver;
private InventoryPage inventoryPage;

@BeforeMethod
public void setUp() {

    driver = DriverFactory.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    loginPage.open()
            .enterUsername("standard_user")
            .enterPassword("secret_sauce")
            .clickLogin();

    inventoryPage = new InventoryPage(driver);
}

@Test
public void inventoryPageIsDisplayed() {

    Assert.assertEquals(
            inventoryPage.getPageTitle(),
            "Products"
    );
}

@Test
public void addProductToCart() {

    inventoryPage.addBackpackToCart();

    inventoryPage.openCart();

    Assert.assertTrue(
            driver.getCurrentUrl().contains("cart")
    );
}

@AfterMethod
public void tearDown() {

    DriverFactory.quitDriver();
}
```

}
