import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CatalogOffersHot {
    private static final String NAV_MENU_ITEM = "//span[@class='b-main-navigation__text' and text()='%s']";
    private static final By NAV_MENU_ITEM_XPATH = By.xpath("//span[@class='b-main-navigation__text' and text()='Форум']");
    @Test
    public void catalogOffersHot(){
        //System.setProperty("chrome.drive","src/test/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        //driver.get("https://www.onliner.by/");
//        System.out.println("Onliner home page has been opened");
//        driver.findElement(By.xpath("//div[@data-item-name='Genesis Boron 500 XXL RGB']//div[@class='catalog-offers__hot']"));
//        System.out.println("element");
//        driver.findElement(By.xpath(String.format(NAV_MENU_ITEM,"Новости"))).click();
//        driver.findElement(By.xpath(String.format(NAV_MENU_ITEM,"Форум"))).click();
//        driver.findElement(NAV_MENU_ITEM_XPATH);
        //driver.findElement(By.xpath(String.format("//a[@class='footer-style__link footer-style__link_primary' and contains(text(),'О компании')]"))).click();
        driver.get("https://av.by/");
        //driver.findElement(By.xpath("//button[contains(@class,'button--primary')]")).click();
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //driver.findElement(By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span")));
//        driver.findElement(By.xpath("//button[@class='tab' and text()='почте']")).click();
//        driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='name']")).click();
        driver.quit();
    }
}
