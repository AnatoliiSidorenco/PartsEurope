package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationManager {
    public WebDriver driver;
    String BASE_URL = "https://www.partseurope.eu/en";

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\EducationProg\\SeleniumChromeDriver116\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("prefs", "profile.default_content_setting_values.cookies=1", "profile.default_content_setting_values.popups=1");
        driver = new ChromeDriver(options);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".yes-to-all")).click();
        driver.findElement(By.cssSelector(".save-information")).click();
    }

    public void stop() {
        driver.quit();
    }
}
