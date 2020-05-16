import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;


public class Testing {
    WebDriver driver;

    @Test
    public void test() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\SimpleTestCase\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        System.out.println("chrome is opened");
        driver.get("https://www.facebook.com/");
        driver.quit();

    }

}
