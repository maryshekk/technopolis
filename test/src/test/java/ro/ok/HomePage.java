package ro.ok;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    private ChromeDriver driver;

    public HomePage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    public boolean atPage()
    {
        String title = driver.getTitle();
        return title.equals("Одноклассники")
                && driver.findElement(By.xpath("//*[@id='viewImageLinkId']")).isEnabled();
    }
}
