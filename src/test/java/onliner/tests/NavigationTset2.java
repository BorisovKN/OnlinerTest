package onliner.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigationTset2 {
    private static final String NAV_MENU_ITEM = "//span[@class='b-main-navigation__text' and text()='%s']";
    private static final By PAGE_TITLE_XPATH = By.xpath("//div[@class='catalog-navigation__title' and text()='Каталог']");
    private static final String NAVIGATE_MENU = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'%s')]";
    private static final String NAV_SUBMENU_CATEGORY = "//div[@class='catalog-navigation-list__category']//span[@class='catalog-navigation-list__dropdown-title' and contains(text(),'Игровые ноутбуки')]";
    private static final String NAV_SUBMENU_ITEM = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]";

    @Test
    public void onlinerTest(){

//        WebElement navMenu = driver.findElement(By.xpath(String.format(NAV_MENU_ITEM, "Каталог")));
//        navMenu.click();
//
//        WebElement pageTitle = new WebDriverWait
//                (driver, Duration.ofSeconds(new PropertyReader("config.properties").getIntProperty("timeout.for.page.load")))
//                .until(ExpectedConditions.visibilityOf(driver.findElement(PAGE_TITLE_XPATH)));
//        if (!pageTitle.isDisplayed()) {
//            System.out.println("ERROR: Страница Каталог не была загружена!!!");
//        }
//        WebElement navMenuOnCatalogPage = driver.findElement(By.xpath(String.format(NAVIGATE_MENU, "Компьютеры")));
//        navMenuOnCatalogPage.click();
//
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath(NAV_SUBMENU_ITEM)))
//                .moveToElement(driver.findElement(By.xpath(NAV_SUBMENU_CATEGORY)))
//                .click().build().perform();
    }
}
