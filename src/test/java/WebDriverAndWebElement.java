import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;


public class WebDriverAndWebElement {
    WebDriver driver;
    @BeforeAll
    static void downloadDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupDriver(){
        driver= new ChromeDriver();
    }
    @AfterEach
    void closeBrowser(){
        Set<String> set = driver.getWindowHandles();
        for(String id: set){
            driver.switchTo().window(id);
            driver.close();
        }
    }

    @Test
    void navigationTest(){
        driver.get("https://www.google.com/");
        driver.get("https://www.selenide.org/");
        System.out.println("t");
    }
    @Test
    void findElementTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        By securityLocator = By.xpath("//a[@href='http://demo.guru99.com/Security/SEC_V1/index.php']");
        WebElement element = driver.findElement(securityLocator);
        System.out.println(element.getText());
    }
    @Test
    void jsTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        WebElement element = (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return document.querySelector('#philabelphia-filed-email')");
        System.out.println(element.getAttribute("placeholder"));
    }
    @Test
    void findListElementsTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'parent')]"));
        System.out.println(list.size());
    }
    @Test
    void switchToWindowTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        System.out.println(driver.getTitle());
        String firstId = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://google.com/");
        System.out.println(driver.getTitle());
        driver.switchTo().window(firstId);
        System.out.println(driver.getTitle());
    }
    @Test
    void switchToFrameTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        By jmeter = By.xpath("//img[@src='Jmeter720.png']");
        driver.findElement(jmeter);
        driver.switchTo().defaultContent();
        By securityLocator = By.xpath("//a[@href='http://demo.guru99.com/Security/SEC_V1/index.php']");
        driver.findElement(securityLocator);
    }
    @Test
    void navigationBackAndToTest(){

    }
    @Test
    void cookiesTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        Cookie cookie = new Cookie("password","123");
        driver.manage().addCookie(cookie);
        System.out.println("t");
    }
    @Test
    void smartWaitsTest(){
        By locator = By.xpath("//button[@aria-label='Scroll to top button']");
        driver.get("https://blocsapp.com/");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(locator));
        System.out.println("t");
    }
    @Test
    void webElementActionsTest(){
        driver.get("https://demo.guru99.com/test/guru99home/");
        By emailLocator = By.xpath("//input[@placeholder='Enter Email']");
        WebElement element = driver.findElement(emailLocator);
        element.sendKeys("testing");
        element.clear();
        System.out.println(element.getLocation());
        System.out.println(element.getSize());
        System.out.println(element.isDisplayed());
        System.out.println("t");

    }
}
