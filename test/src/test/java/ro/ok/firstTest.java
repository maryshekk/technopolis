package ro.ok;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
public class firstTest extends WebDriver {

    @Test
    public void succesfullLoginTest() {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("89379585734");
        loginPage.enterPassword("Termokruzka22");
        loginPage.clickLogin();

        HomePage homePage = new HomePage(driver);
        assert homePage.atPage();
    }

    @Test
    public void emptyLoginTest()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("");
        loginPage.enterPassword("Termokruzka22");
        loginPage.clickLogin();

        assert loginPage.emptyLoginError();
    }

    @Test
    public void emptyPasswordTest()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("89379585734");
        loginPage.enterPassword("");
        loginPage.clickLogin();

        assert loginPage.emptyPasswordError();
    }

    @Test
    public void emptyLoginAndPasswordTest()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("");
        loginPage.enterPassword("");
        loginPage.clickLogin();

        assert loginPage.emptyLoginError();
    }

    @Test
    public void wrongPasswordTest()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("89379585734");
        loginPage.enterPassword("123");
        loginPage.clickLogin();

        assert loginPage.wrongLoginOrPasswordError();
    }

    @Test
    public void wrongLoginTest()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("8937958574");
        loginPage.enterPassword("Termokruzka22");
        loginPage.clickLogin();

        assert loginPage.wrongLoginOrPasswordError();
    }

    @Test
    public void wrongLoginAndPasswordTest()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("8937985734");
        loginPage.enterPassword("123");
        loginPage.clickLogin();

        assert loginPage.wrongLoginOrPasswordError();
    }

    @Test
    public void succesfullLoginTestWithEnter() {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("89379585734");
        loginPage.enterPassword("Termokruzka22" + Keys.ENTER);
//        loginPage.clickLogin();

        HomePage homePage = new HomePage(driver);
        assert homePage.atPage();
    }

    @Test
    public void emptyLoginTestWithEnter()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("" + Keys.ENTER);
//        loginPage.enterPassword("Termokruzka22");
//        loginPage.clickLogin();

        assert loginPage.emptyLoginError();
    }

    @Test
    public void emptyPasswordTestWithEnter()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("89379585734");
        loginPage.enterPassword("" + Keys.ENTER);
//        loginPage.clickLogin();

        assert loginPage.emptyPasswordError();
    }

    @Test
    public void emptyLoginAndPasswordTestWithEnter()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("");
        loginPage.enterPassword("" +  Keys.ENTER);
//        loginPage.clickLogin();

        assert loginPage.emptyLoginError();
    }

    @Test
    public void wrongPasswordTestWithEnter()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("89379585734");
        loginPage.enterPassword("123" + Keys.ENTER);
//        loginPage.clickLogin();

        assert loginPage.wrongLoginOrPasswordError();
    }

    @Test
    public void wrongLoginTestWithEnter()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("8937958574");
        loginPage.enterPassword("Termokruzka22" + Keys.ENTER);
//        loginPage.clickLogin();

        assert loginPage.wrongLoginOrPasswordError();
    }

    @Test
    public void wrongLoginAndPasswordTestWithEtner()
    {
        driver.get("https://ok.ru/");
        LoginPage loginPage = new LoginPage(driver);
        assert loginPage.atPage();

        loginPage.enterLogin("8937985734");
        loginPage.enterPassword("123" + Keys.ENTER);
//        loginPage.clickLogin();

        assert loginPage.wrongLoginOrPasswordError();
    }



}
