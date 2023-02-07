import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class OnlinerHomeWork {
    @Test
    public void regForm() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://profile.onliner.by/registration");
        driver.findElement(By.xpath("//a[@class='auth-button auth-button_accessorial auth-button_huge auth-form__button auth-form__button_gg']"));
        WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
        mail.sendKeys("wolf@mm/mm");
        driver.findElement(By.xpath("//span[@class='i-checkbox__faux']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
        driver.quit();
    }

    @Test
    public void headPhones() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://onliner.by/");
        driver.findElement(By.xpath("//span[@class='project-navigation__sign' and text()='Наушники и гарнитуры']")).click();
        WebElement element = driver.findElement(By.xpath("//div[@data-bind='click: facet.togglePopover.bind(facet)']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        driver.findElement(By.xpath("//div[@class='schema-filter-popover__inner']//span[@class='schema-filter__checkbox-text' and text()='Marshall']")).click();
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-bind='html: product.extended_name || product.full_name' and text()='Наушники Marshall Motif']"))).click();
        driver.findElement(By.xpath("//span[@class='offers-description__review-count']")).click();
        driver.quit();
    }

    @Test
    public void car() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://onliner.by/");
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and text()='Автобарахолка']")).click();
        WebElement element = driver.findElement(By.xpath("//div[@class='input-style__faux' and text()='Марка']//..//div[@class='input-style__real']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        WebElement mark = driver.findElement(By.xpath("//input[@placeholder='Найти марку']"));
        mark.sendKeys("Renault");
        driver.findElement(By.xpath("//div[@class='dropdown-style__checkbox-sign' and text()='Renault']")).click();
        driver.findElement(By.xpath("//div[@class='input-style__faux' and text()='Модель']//..//div[@class='input-style__real']")).click();
        WebElement model = driver.findElement(By.xpath("//input[@placeholder='Найти модель']"));
        model.sendKeys("Scenic");
        driver.findElement(By.xpath("//div[@class='dropdown-style__checkbox-sign' and text()='Scenic']")).click();
        driver.findElement(By.xpath("//div[@class='input-style__faux' and text()='Поколение']//..//div[@class='input-style__real']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-style__checkbox-text']//div[@class='dropdown-style__checkbox-value' and text()='2016 — по настоящее время']")).click();
        driver.quit();
    }
}
