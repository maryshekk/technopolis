package ro.ok;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public ChromeDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:/CLionProgects/technopolis/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close()
    {
        driver.quit();

    }
}
