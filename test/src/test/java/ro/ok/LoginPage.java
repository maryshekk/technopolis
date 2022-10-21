package ro.ok;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private ChromeDriver driver;

    public LoginPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public boolean atPage()
    {
        String title = driver.getTitle();
        return title.equals("Социальная сеть Одноклассники. Общение с друзьями в ОК. Ваше место встречи с одноклассниками");
    }

    public void enterLogin(String login)
    {
        driver.findElement(By.xpath("//*[@class='it h-mod']")).sendKeys(login);
    }

    public void enterPassword(String password)
    {
        driver.findElement(By.xpath("//*[@class='it ']")).sendKeys(password);
    }

    public void clickLogin()
    {
        driver.findElement(By.xpath("//*[@value='Войти в Одноклассники']")).click();
    }

    public boolean emptyLoginError()
    {
        return driver.findElement(By.xpath("//*[@class='input-e login_error']")).getText().equals("Введите логин");
    }

    public boolean emptyPasswordError()
    {
        return driver.findElement(By.xpath("//*[@class='input-e login_error']")).getText().equals("Введите пароль");
    }

    public boolean wrongLoginOrPasswordError()
    {
        return driver.findElement(By.xpath("//*[@class='input-e login_error']")).
                getText().equals("Неправильно указан логин и/или пароль");
    }



}
