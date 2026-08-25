package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

```
private final WebDriver driver;

private final By pageTitle =
        By.cssSelector(".title");

private final By backpack =
        By.id("add-to-cart-sauce-labs-backpack");

private final By cart =
        By.className("shopping_cart_link");

public InventoryPage(WebDriver driver) {
    this.driver = driver;
}

public String getPageTitle() {

    return driver.findElement(pageTitle)
            .getText();
}

public void addBackpackToCart() {

    driver.findElement(backpack)
            .click();
}

public void openCart() {

    driver.findElement(cart)
            .click();
}
```

}
