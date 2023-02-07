import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AvByHomeWork {
    @Test
    public void avByRegName() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until
                (ExpectedConditions.elementToBeClickable
                        (By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='tab' and text()='почте']"))).click();
        WebElement name = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='name']"));
        name.sendKeys("Kirill");
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regEmail']"));
        mail.sendKeys("hdeer9598@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regPassword']"));
        password.sendKeys("Borisov88");
        new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='auth__option']//label[@class='checkbox' and @for='emailUserEulaAccepted']//span[text()='Я понимаю и согласен с']"))).click();
        driver.findElement(By.xpath("//div[@aria-labelledby='почте']//span[@class='button__text' and text()='Зарегистрироваться']")).click();
        var error = driver.findElement(By.xpath("//div[@aria-labelledby='почте']//div[@class='error-message']")).getText();
        System.out.println("Ошибка при неверном имени: " + error);
        driver.quit();
    }

    @Test
    public void aVByRegMail() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until
                (ExpectedConditions.elementToBeClickable
                        (By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-selected='false' and text()='почте']"))).click();
        WebElement name = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='name']"));
        name.sendKeys("Иван");
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regEmail']"));
        mail.sendKeys("ывммумы@еназ");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regPassword']"));
        password.sendKeys("Borisov88");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='auth__option']//label[@class='checkbox' and @for='emailUserEulaAccepted']//span[text()='Я понимаю и согласен с']"))).click();
        driver.findElement(By.xpath("//div[@aria-labelledby='почте']//span[@class='button__text' and text()='Зарегистрироваться']")).click();
        var error = driver.findElement(By.xpath("//div[@aria-labelledby='почте']//div[@class='error-message']")).getText();
        System.out.println("Ошибка при неверной почте: " + error);
        driver.quit();
    }

    @Test
    public void avByRegPassword() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until
                (ExpectedConditions.elementToBeClickable
                        (By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-selected='false' and text()='почте']"))).click();
        WebElement name = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='name']"));
        name.sendKeys("Иван");
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regEmail']"));
        mail.sendKeys("hdeer9598@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regPassword']"));
        password.sendKeys("гупцаыдвмидыв");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='auth__option']//label[@class='checkbox' and @for='emailUserEulaAccepted']//span[text()='Я понимаю и согласен с']"))).click();
        driver.findElement(By.xpath("//div[@aria-labelledby='почте']//span[@class='button__text' and text()='Зарегистрироваться']")).click();
        var error = driver.findElement(By.xpath("//div[@aria-labelledby='почте']//div[@class='error-message']")).getText();
        System.out.println("Ошибка при неверном пароле: " + error);
        driver.quit();
    }

    @Test
    public void reg() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until
                (ExpectedConditions.elementToBeClickable
                        (By.xpath("//div[@class='drawer__slide drawer__slide--active']//button[@class='drawer__slide-toggle']//span"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-selected='false' and text()='почте']"))).click();
        WebElement name = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='name']"));
        name.sendKeys("Иван");
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regEmail']"));
        mail.sendKeys("hdeer9598@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='regPassword']"));
        password.sendKeys("Borisov88");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='auth__option']//label[@class='checkbox' and @for='emailUserEulaAccepted']//span[text()='Я понимаю и согласен с']"))).click();
        driver.findElement(By.xpath("//div[@aria-labelledby='почте']//span[@class='button__text' and text()='Зарегистрироваться']")).click();
        var message = driver.findElement(By.xpath("//div[@class='drawer__slide drawer__slide--active']//div[@class='auth__title']")).getText();
        System.out.println("Сообщение при успешной регистрации: " + message);
        driver.quit();
    }

    @Test
    public void enter() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tablist']//button[@class='tab' and text()='почте или логину']"))).click();
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='authLogin']"));
        mail.sendKeys("kirill_borisov98@mail.ru");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='loginPassword']"));
        password.sendKeys("Borisov88");
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button__text' and text()='Войти']"))).click();
        driver.quit();
    }

    @Test
    public void autoReview() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='button__text' and text()='Все обзоры авто']")).click();
        driver.findElement(By.xpath("//img[@alt='«С водительской стороны одна дверь, с пассажирской — две». Минчанка о владении редким Hyundai Veloster']")).click();
        driver.quit();
    }

    @Test
    public void termsOfUse() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//a[@href='https://av.by/pages/user_agreement']")).click();
        driver.quit();
    }

    @Test
    public void carSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tablist']//button[@class='tab' and text()='почте или логину']"))).click();
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='authLogin']"));
        mail.sendKeys("kirill_borisov98@mail.ru");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='loginPassword']"));
        password.sendKeys("Borisov88");
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button__text' and text()='Войти']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='catalog__title' and text()='Renault']"))).click();
        driver.findElement(By.xpath("//div[@class='cookie-banner__action']//span[@class='button__text']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown-floatlabel__value' and text()='Модель']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown' and @id='p-6-0-3-model']//button[@class='dropdown__listbutton' and text()='Scenic']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button-group__text' and text()='механика']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown-floatlabel__value' and text()='Поколение']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown__card-text' and text()='IV, 2016…']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown-floatlabel__value' and text()='Год от']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='dropdown__listbutton' and text()='2018']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='p-15-engine_type']//span[@class='dropdown-button__value']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='checkbox__description' and text()='дизель']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='p-15-engine_type']//span[@class='dropdown-button__value']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button__text' and text()='Показать']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='listing-item__link' and @href='/renault/scenic/103385058']//span"))).click();
        driver.quit();
    }

    @Test
    public void showPhoneNumber() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[@class='nav__link-text' and text()='Войти']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tablist']//button[@class='tab' and text()='почте или логину']"))).click();
        WebElement mail = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='authLogin']"));
        mail.sendKeys("kirill_borisov98@mail.ru");
        WebElement password = driver.findElement(By.xpath("//input[@class='form-control form-control--large' and @id='loginPassword']"));
        password.sendKeys("Borisov88");
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button__text' and text()='Войти']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='catalog__title' and text()='Renault']"))).click();
        driver.findElement(By.xpath("//div[@class='cookie-banner__action']//span[@class='button__text']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown-floatlabel__value' and text()='Модель']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown' and @id='p-6-0-3-model']//button[@class='dropdown__listbutton' and text()='Scenic']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button-group__text' and text()='механика']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown-floatlabel__value' and text()='Поколение']"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='dropdown__card-text' and text()='IV, 2016…']"))).click();
        driver.findElement(By.xpath("//span[@class='dropdown-floatlabel__value' and text()='Год от']")).click();
        driver.findElement(By.xpath("//button[@class='dropdown__listbutton' and text()='2018']")).click();
        driver.findElement(By.xpath("//button[@name='p-15-engine_type']//span[@class='dropdown-button__value']")).click();
        driver.findElement(By.xpath("//span[@class='checkbox__description' and text()='дизель']")).click();
        driver.findElement(By.xpath("//button[@name='p-15-engine_type']//span[@class='dropdown-button__value']")).click();
        driver.findElement(By.xpath("//span[@class='button__text' and text()='Показать']")).click();
        driver.findElement(By.xpath("//a[@class='listing-item__link' and @href='/renault/scenic/103453707']//span")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button__text' and text()='Показать телефон']"))).click();
        driver.quit();
    }

}
