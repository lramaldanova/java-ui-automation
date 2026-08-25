package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {

```
private WebDriver driver;
private LoginPage loginPage;

@BeforeMethod
public void setUp() {

    driver = DriverFactory.getDriver();

    loginPage = new LoginPage(driver);

    loginPage.open();
}

@Test
public void successfulLoginTest() {

    loginPage
            .enterUsername("standard_user")
            .enterPassword("secret_sauce")
            .clickLogin();

    Assert.assertTrue(
            driver.getCurrentUrl().contains("inventory")
    );
}

@Test
public void invalidLoginTest() {

    loginPage
            .enterUsername("standard_user")
            .enterPassword("wrong_password")
            .clickLogin();

    Assert.assertTrue(
            loginPage.getErrorMessage()
                    .contains("Username and password do not match")
    );
}

@AfterMethod
public void tearDown() {

    DriverFactory.quitDriver();
}
```

}
