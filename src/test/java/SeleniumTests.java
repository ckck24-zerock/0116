import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class SeleniumTests {

    @Test
    public void test1()throws Exception{

        WebDriver driver = new ChromeDriver();
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        // WebDriver driver = new ChromeDriver();
        driver.get("https://www.coupang.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.id("headerSearchKeyword"));
        searchBox.sendKeys("화장지");
        //searchBox.submit();

        //driver.findElement(By.id("headerSearchBtn")).click();

        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();

    }
}
